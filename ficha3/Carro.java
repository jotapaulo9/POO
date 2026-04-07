public class Carro {
    
    private String     marca; 
    private String     modelo; 
    private int        ano;
    private double     consumo; 
    private int        kmsTotal; 
    private double     mediaConsumo; 
    private int        kmsViagem; 
    private double     consumoViagem; 
    private double     bateria; // ???
    private boolean    ligado;

    private double combustivelTotal; //fiz estas para a d)
    private double combustivelViagem;

    //CONSTRUTORES 

    public Carro(){
        this.marca         = "";
        this.modelo        = ""; 
        this.ano           = 0; 
        this.consumo       = 0.0; 
        this.kmsTotal      = 0; 
        this.mediaConsumo  = 0.0; 
        this.kmsViagem     = 0; 
        this.consumoViagem = 0.0; 
        this.bateria       = 0;
        this.ligado        = false;
        this.combustivelTotal = 0.0;
        this.combustivelViagem = 0.0;

    }

    public Carro(String marca, String modelo, int ano, 
                 Double consumo, int kmsTotal, Double mediaConsumo, 
                 int kmsViagem, Double consumoViagem, double bateria, boolean ligado){

        this.marca         = marca; 
        this.modelo        = modelo; 
        this.ano           = ano; 
        this.consumo       = consumo; 
        this.kmsTotal      = kmsTotal; 
        this.mediaConsumo  = mediaConsumo; 
        this.kmsViagem     = kmsViagem; 
        this.consumoViagem = consumoViagem; 
        this.bateria       = bateria; 
        this.ligado        = ligado;
        }

    public Carro (Carro outro){
        this.marca         = outro.getMarca(); 
        this.modelo        = outro.getModelo(); 
        this.ano           = outro.getAno(); 
        this.consumo       = outro.getConsumo(); 
        this.kmsTotal      = outro.getKmsTotal(); 
        this.mediaConsumo  = outro.getMediaConsumo(); 
        this.kmsViagem     = outro.getKmsViagem(); 
        this.consumoViagem = outro.getConsumoViagem(); 
        this.bateria       = outro.getBateria();
        this.ligado        = outro.getLigado(); 

        this.combustivelTotal  = outro.getCombustivelTotal();
        this.combustivelViagem = outro.getCombustivelViagem();
    }

    //GETTERS

    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){ 
        return this.modelo;
    }

    public int getAno(){ 
        return this.ano;
    }

    public Double getConsumo(){
        return this.consumo;
    }

    public int getKmsTotal(){
        return this.kmsTotal;
    }

    public Double getMediaConsumo(){
        return this.mediaConsumo;
    }

    public int getKmsViagem(){
        return this.kmsViagem;
    }

    public Double getConsumoViagem(){
        return this.consumoViagem;
    }

    public double getBateria(){
        return this.bateria;
    }

    public boolean getLigado(){
        return this.ligado;
    }

    public double getCombustivelTotal(){
        return this.combustivelTotal;
    }

    public double getCombustivelViagem(){
        return this.combustivelViagem;
    }


    //SETTERS

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){ 
        this.modelo = modelo;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public void setConsumo(Double consumo){
        this.consumo = consumo; 
    }

    public void setBateria(int bateria){
        this.bateria = bateria; 
    }

    //b)
    public void ligaCarro(){
        this.ligado = true; 
        this.kmsViagem = 0;
        this.consumoViagem = 0.0;
        this.combustivelViagem = 0.0;
    }

    //c)
    public void desligaCarro(){
        this.ligado = false;
    }

    //d) 
    public void resetUltimaViagem(){
        this.kmsViagem = 0;
        this.consumoViagem = 0.0;
    }

    //e)
    public void avancaCarro(double metros, double velocidade){
        if(this.ligado){ 
            double kmsPercorridos = metros / 1000;
            double consumoReal = this.consumo * (velocidade / 100);
            double combustivelGasto = consumoReal * kmsPercorridos; 
        

        this.kmsTotal += kmsPercorridos; 
        this.kmsViagem += kmsPercorridos;
        this.mediaConsumo += combustivelTotal;
        this.combustivelViagem += combustivelGasto;

        this.mediaConsumo = this.combustivelTotal / this.kmsTotal;
        this.consumoViagem = this.combustivelViagem / this.kmsViagem;
        }
    }


    //f)
    public void travaCarro(double metros){
    if(this.ligado){
        double kmsPercorridos = metros / 1000;
        double energiaRegenerada = this.bateria * kmsPercorridos;
        
        this.bateria += energiaRegenerada;
    }
}

    public String toString(){
        return  "Marca: " + this.marca + "\n" + 
                "Modelo: " + this.modelo + "\n" + 
                "Ano: " + this.ano + "\n" + 
                "Consumo referencia: " + this.consumo + "L/100km\n" + 
                "Kms totais: " + this.kmsTotal + " km\n" +
                "Kms viagem atual: " + this.kmsViagem + " km\n" +
                "Media consumo total: " + this.mediaConsumo + " L/km\n" +
                "Media consumo viagem: " + this.consumoViagem + " L/km\n" +
                "Bateria: " + this.bateria + "\n" +
                "Ligado: " + this.ligado;
                }
    
    
    public Carro clone(){
        return new Carro(this);
    }

    public boolean equals(Object o){
    if(this == o) return true;
    if(o == null || this.getClass() != o.getClass()) return false;
    Carro c = (Carro) o;
    return this.marca.equals(c.getMarca()) &&
           this.modelo.equals(c.getModelo()) &&
           this.ano == c.getAno();
    }       
}
