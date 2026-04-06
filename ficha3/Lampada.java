public class Lampada {

    private Estado estado; 
    private int consumoOn; 
    private int consumoEco; 
    private int milisecs; 

    private int totalConsumoAcumulado;
    private int periodoConsumoAcumulado;

    public enum Estado{ 
        ON, OFF, ECO
    }

    //CONSTRUTORES

    public Lampada(){
        this.estado = Estado.OFF;
        this.consumoOn = 0; 
        this.consumoEco = 0; 
        this.milisecs = 0; 

        this.totalConsumoAcumulado = 0;
        this.periodoConsumoAcumulado = 0;
    }

    public Lampada(Estado estado, int consumoOn, int consumoEco, int milisecs){
        this.estado = estado;
        this.consumoOn = consumoOn;
        this.consumoEco = consumoEco;
        this.milisecs = milisecs;

        this.totalConsumoAcumulado = 0;
        this.periodoConsumoAcumulado = 0;
    }

    public Lampada(Lampada outro) { 
        this.estado = outro.getEstado(); 
        this.consumoOn = outro.getConsumoOn();
        this.consumoEco = outro.getConsumoEco();
        this.milisecs = outro.getMilisecs();

/*         this.totalConsumoAcumulado = outro.getTotalConsumo();
        this.periodoConsumoAcumulado = outro.getPeriodoConsumo(); */
    }

    //GETTERS

    public Estado getEstado(){
        return this.estado;
    }

    public int getConsumoOn(){
        return this.consumoOn;
    }

    public int getConsumoEco(){
        return this.consumoEco;
    }

    public int getMilisecs(){
        return this.milisecs;
    }



    //SETTERS 

    public void setEstado(Estado estado){
        this.estado = estado;
    }

    public void setConsumoOn(int consumoOn){
        this.consumoOn = consumoOn;
    }

    public void setConsumoEco(int consumoEco){
        this.consumoEco = consumoEco;
    }
    
    public void setMilisecs(int milisecs){
        this.milisecs = milisecs;
    }

    //a)
    public void lampOn(){
        this.setEstado(Estado.ON);
    }

    //b)
    public void lampOFF(){
        this.setEstado(Estado.OFF);
        this.setMilisecs(0); 
    }

    //c)
    public void lampECO(){
        this.setEstado(Estado.ECO);
    }

    // auxiliar para a d) e e) 

    public void passarTempo(int ms) {
        if (this.estado == Estado.ON) {
            totalConsumoAcumulado += ms * this.consumoOn;
            periodoConsumoAcumulado += ms * this.consumoOn;
        } else if (this.estado == Estado.ECO) {
            totalConsumoAcumulado += ms * this.consumoEco;
            periodoConsumoAcumulado += ms * this.consumoEco;
        }
        // OFF = consumo zero
    }


    //d)
    public double totalConsumo() {
        return this.totalConsumoAcumulado;
    }

    // e)
    public double periodoConsumo() {
        return this.periodoConsumoAcumulado;
    }

    public void resetConsumo() {
        this.periodoConsumoAcumulado = 0;
    }


    public String toString(){
        return "Estado : " + this.estado + "\n" +
               "Estado ON, Consumo: " + this.consumoOn + "\n" +
               "Estado ECO, Consumo: " + this.consumoEco + "\n" + 
               "Ligada há " + milisecs + " milissegundos";
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;
        Lampada l = (Lampada) o;
        return(this.estado == l.estado && this.consumoOn == l.consumoOn && 
        this.consumoEco == l.consumoEco && this.milisecs == l.milisecs);
    }

    public Lampada clone(){
        return new Lampada(this);
    }

    
}
