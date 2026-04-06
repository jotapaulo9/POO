public class circulo {

    private double x;
    private double y; 
    private double raio; 


    public circulo(){ 

        this.x = 0; 
        this.y = 0; 
        this.raio = 0; 
    }
        
        
    public circulo (double x, double y, double raio){ 

        this.x = x;
        this.y = y; 
        this.raio = raio;
    }

    public circulo(circulo outro) {
        
        this.x = outro.getX();
        this.y = outro.getY();
        this.raio = outro.getRaio();
    }

    //Getters:
    public double getX(){
        return this.x; 
    }

    public double getY(){
        return this.y; 
    }

    public double getRaio(){
        return this.raio; 
    }

    //Setters:
    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public void setRaio(double raio){
        this.raio = raio;
    }

    public void alteraCentro(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calculaArea() {
        return Math.PI * this.raio * this.raio;
    }

    public double calculaPerimetro() {
        return 2 * Math.PI * this.raio;
    }

    public String toString() {
        return "Circulo [Centro: (" + this.x + ", " + this.y + "), Raio: " + this.raio + "]";
    }

    public circulo clone() {
        return new circulo(this);
    }

    public boolean equals(Object o) {
        if (this == o) return true;  // são o mesmo objeto na memória?
        if (o == null || this.getClass() != o.getClass()) return false;
        circulo c = (circulo) o;     // "converte" o Object para Circulo
        return this.x    == c.getX()    &&
               this.y    == c.getY()    &&
               this.raio == c.getRaio();
    }

    







        

}
    

