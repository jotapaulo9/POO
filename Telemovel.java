public class Telemovel {

    private String marca; 
    private String modelo; 
    private int resolucaoX;
    private int resolucaoY;
    private String[] mensagens;      
    private int      dimArmazTotal;  
    private int      dimArmazFotos;  
    private int      dimArmazApps;   
    private int      espacoOcupado;  
    private int      numFotos;
    private int      numApps;
    private String[] nomesApps;      
    private int[]    tamanhosApps;   


    public Telemovel(){
        this.marca          = "";
        this.modelo         = "";
        this.resolucaoX     = 0;
        this.resolucaoY     = 0;
        this.mensagens      = new String[0];
        this.dimArmazTotal  = 0;
        this.dimArmazFotos  = 0;
        this.dimArmazApps   = 0;
        this.espacoOcupado  = 0;
        this.numFotos       = 0;
        this.numApps        = 0;
        this.nomesApps      = new String[0];
        this.tamanhosApps   = new int[0];
    }


    public Telemovel(String marca, String modelo, int resolucaoX, int resolucaoY,
                     int dimArmazTotal, int dimArmazFotos, int dimArmazApps) {
        this.marca         = marca;
        this.modelo        = modelo;
        this.resolucaoX    = resolucaoX;
        this.resolucaoY    = resolucaoY;
        this.mensagens     = new String[0];
        this.dimArmazTotal = dimArmazTotal;
        this.dimArmazFotos = dimArmazFotos;
        this.dimArmazApps  = dimArmazApps;
        this.espacoOcupado = 0;
        this.numFotos      = 0;
        this.numApps       = 0;
        this.nomesApps     = new String[0];
        this.tamanhosApps  = new int[0];
    }


    public Telemovel(Telemovel outro) {
        this.marca         = outro.getMarca();
        this.modelo        = outro.getModelo();
        this.resolucaoX    = outro.getResolucaoX();
        this.resolucaoY    = outro.getResolucaoY();
        this.dimArmazTotal = outro.getDimArmazTotal();
        this.dimArmazFotos = outro.getDimArmazFotos();
        this.dimArmazApps  = outro.getDimArmazApps();
        this.espacoOcupado = outro.getEspacoOcupado();
        this.numFotos      = outro.getNumFotos();
        this.numApps       = outro.getNumApps();

    

    // cópia manual dos arrays
        String[] msgs = outro.getMensagens();
        this.mensagens = new String[msgs.length];
        for (int i = 0; i < msgs.length; i++) this.mensagens[i] = msgs[i];

        String[] nomes = outro.getNomesApps();
        this.nomesApps = new String[nomes.length];
        for (int i = 0; i < nomes.length; i++) this.nomesApps[i] = nomes[i];

        int[] tam = outro.getTamanhosApps();
        this.tamanhosApps = new int[tam.length];
        for (int i = 0; i < tam.length; i++) this.tamanhosApps[i] = tam[i];
    }

    // getters 

    public String getMarca()        { return this.marca; }
    public String getModelo()       { return this.modelo; }
    public int getResolucaoX()      { return this.resolucaoX; }
    public int getResolucaoY()      { return this.resolucaoY; }
    public int getDimArmazTotal()   { return this.dimArmazTotal; }
    public int getDimArmazFotos()   { return this.dimArmazFotos; }
    public int getDimArmazApps()    { return this.dimArmazApps; }
    public int getEspacoOcupado()   { return this.espacoOcupado; }
    public int getNumFotos()        { return this.numFotos; }
    public int getNumApps()         { return this.numApps; }



    public String[] getMensagens() {
        String[] copia = new String[this.mensagens.length];
        for (int i = 0; i < this.mensagens.length; i++){
            copia[i] = this.mensagens[i];
        }
        return copia;
    }

    public String[] getNomesApps() {
        String[] copia = new String[this.nomesApps.length];
        for (int i = 0; i < this.nomesApps.length; i++){ 
            copia[i] = this.nomesApps[i];
        }
        return copia;
    }

    public int[] getTamanhosApps() {
        int[] copia = new int[this.tamanhosApps.length];
        for (int i = 0; i < this.tamanhosApps.length; i++){ 
            copia[i] = this.tamanhosApps[i];
        }
        return copia;
    }

    // setters

    public void setMarca(String marca)     { this.marca = marca; }
    public void setModelo(String modelo)   { this.modelo = modelo; }
    public void setResolucaoX(int x)       { this.resolucaoX = x; }
    public void setResolucaoY(int y)       { this.resolucaoY = y; }
    public void setDimArmazTotal(int n)    { this.dimArmazTotal = n; }
    public void setDimArmazFotos(int n)    { this.dimArmazFotos = n; }
    public void setDimArmazApps(int n)     { this.dimArmazApps = n; }

    public void setMensagens(String[] mensagens) {
        String[] copia = new String[mensagens.length];
        for (int i = 0; i < mensagens.length; i++){
            copia[i] = this.mensagens[i];
        }
        this.mensagens = copia; 
    }

    public void setNomesApps(String[] nomesApps) {
        String[] copia = new String[nomesApps.length];
        for (int i = 0; i < nomesApps.length; i++){ 
            copia[i] = nomesApps[i];
        }
        this.nomesApps = copia; 
    }

    public void setTamanhosApps(int[] tamanhosApps) {
        int[] copia = new int[tamanhosApps.length];
        for (int i = 0; i < tamanhosApps.length; i++){ 
            copia[i] = tamanhosApps[i];
        }
        this.tamanhosApps = copia; 
    }

    //a)
    public boolean existeEspaco(int numeroBytes) {
        return (this.espacoOcupado + numeroBytes) <= this.dimArmazTotal;
    }


    //b)
    public void instalaApp(String nome, int tamanho){ 
        if(!this.existeEspaco(tamanho)){ 
            System.out.println("Não é possível instalar, armazenamento insuficiente");
            return; 
        }

        String[] novosNomes = new String[this.numApps + 1];
        for (int i = 0; i < this.numApps; i++) {
            novosNomes[i] = this.nomesApps[i];
        }
        novosNomes[this.numApps] = nome;
        this.nomesApps = novosNomes;
    

        int[] novosTam = new int[this.numApps + 1];
        for (int i = 0; i < this.numApps; i++) {
            novosTam[i] = this.tamanhosApps[i];
        }
        novosTam[this.numApps] = tamanho;
        this.tamanhosApps = novosTam;

        this.numApps++;
        this.espacoOcupado += tamanho;
        
    }

        //c)
    public void recebeMsg(String msg) {
        String[] novas = new String[this.mensagens.length + 1];
        for (int i = 0; i < this.mensagens.length; i++) novas[i] = this.mensagens[i];
        novas[this.mensagens.length] = msg;
        this.mensagens = novas;
    }

        //d)
    public double temMedioApps(){
        if(this.numApps == 0){
            return 0;
        }
        int total = 0; 
        for (int i = 0; i < this.numApps; i++){ 
            total = total + this.tamanhosApps[i];
            }
            return total / this.numApps;
        }

        //e)
    public String maiorMsg() {
        if (this.mensagens.length == 0){
            return "";
        } 

        String maior = this.mensagens[0];
        for (int i = 1; i < this.mensagens.length; i++) {
            if (this.mensagens[i].length() > maior.length()) {
                maior = this.mensagens[i];
            }
        }
        return maior;
    }

        // f) nao consegui fazer
    
 




    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Telemovel t = (Telemovel) o;
        return this.marca.equals(t.getMarca()) &&
               this.modelo.equals(t.getModelo());
    }

    public String toString() {
        return "Telemovel [" + this.marca + " " + this.modelo +
               ", Display: " + this.resolucaoX + "x" + this.resolucaoY +
               ", Espaco ocupado: " + this.espacoOcupado + " bytes" +
               ", Apps: " + this.numApps +
               ", Fotos: " + this.numFotos +
               ", Mensagens: " + this.mensagens.length + "]";
    }

    public Telemovel copiar() {
        return new Telemovel(this);
    }

        
}



