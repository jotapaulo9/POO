public class Musica {

    // variaveis de instancia 
    private String nome;
    private String interprete;
    private String autor;
    private String editora;
    private String[] poema;       
    private String[] notasMusica;
    private int duracao;     
    private int vezesEscutada;

    // construtores 

    public Musica() {
        this.nome = "";
        this.interprete = "";
        this.autor = "";
        this.editora = "";
        this.poema = new String[0]; 
        this.notasMusica = new String[0];
        this.duracao = 0;
        this.vezesEscutada = 0;
    }

    public Musica(String nome, String interprete, String autor,
                  String editora, String[] poema, String[] notasMusica,
                  int duracao, int vezesEscutada) {
                    
        this.nome          = nome;
        this.interprete    = interprete;
        this.autor         = autor;
        this.editora       = editora;
        this.poema         = poema.clone();       
        this.notasMusica   = notasMusica.clone();
        this.duracao       = duracao;
        this.vezesEscutada = vezesEscutada;
    }

    public Musica(Musica outra) {
        this.nome          = outra.getNome();
        this.interprete    = outra.getInterprete();
        this.autor         = outra.getAutor();
        this.editora       = outra.getEditora();
        this.poema         = outra.getPoema();     
        this.notasMusica   = outra.getNotasMusica();
        this.duracao       = outra.getDuracao();
        this.vezesEscutada = outra.getVezesEscutada();
    }

    // getters
    public String getNome(){ 
        return this.nome; 
    }

    public String getInterprete(){ 
        return this.interprete; 
    }

    public String getAutor(){ 
        return this.autor;
    }

    public String getEditora(){ 
        
        return this.editora; 
    }

    public int getDuracao(){
         return this.duracao; 
    }

    public int getVezesEscutada(){ 
        return this.vezesEscutada; 
    }

    public String[] getPoema() {
        return this.poema.clone();
    }

    public String[] getNotasMusica() {
        return this.notasMusica.clone();
    }


    // setters 

    public void setNome(String nome){ 
        this.nome = nome; 
    }

    public void setInterprete(String interprete){
        this.interprete = interprete; 
    
    }
    public void setAutor(String autor){ 
        this.autor = autor; 
    }

    public void setEditora(String editora){ 
        this.editora = editora; 
    }

    public void setDuracao(int duracao){ 
        this.duracao = duracao; 
    }

    public void setVezesEscutada(int n){ 
        this.vezesEscutada = n; 
    }


    public void setPoema(String[] poema) {
        this.poema = poema.clone();
    }

    public void setNotasMusica(String[] notasMusica) {
        this.notasMusica = notasMusica.clone();
    }

    // b)
    public int qtsLinhasPoema() {
        return this.poema.length;
    }

    //c) 
    public int numeroCarateres() {
        int total = 0;
        for (int i = 0; i < this.poema.length; i++) {
            total = total + this.poema[i].length();
        }
        return total;
    }

    //d)

    public void addLetra(int posicao, String novaLinha) {
        // Criar array com mais uma posição
        String[] novo = new String[this.poema.length + 1];

        // Copiar tudo ANTES da posição
        for (int i = 0; i < posicao; i++) {
            novo[i] = this.poema[i];
        }

        // Inserir a nova linha
        novo[posicao] = novaLinha;

        // Copiar tudo DEPOIS da posição (empurrado +1)
        for (int i = posicao; i < this.poema.length; i++) {
            novo[i + 1] = this.poema[i];
        }

        this.poema = novo;
    }


    // e) 
    public String linhaMaisLonga() {
        String mais = this.poema[0]; 
        for (int i = 1; i < this.poema.length; i++) {
            if (this.poema[i].length() > mais.length()) {
                mais = this.poema[i];
            }
        }
        return mais;
    }
    
    
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Musica m = (Musica) o;
        return this.nome.equals(m.getNome()) &&
               this.interprete.equals(m.getInterprete()) &&
               this.duracao == m.getDuracao();
    }

    public String toString() {
        return "Musica [Nome: " + this.nome +
               ", Interprete: " + this.interprete +
               ", Autor: " + this.autor +
               ", Duracao: " + this.duracao + "s" +
               ", Vezes escutada: " + this.vezesEscutada + "]";
    }

     public Musica clone() {
        return new Musica(this);
    }

}
