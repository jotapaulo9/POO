public class sensor {

    private double pressao; 


    public sensor(){ 
        this.pressao = 0; 
    }

    public sensor(double valor){ 
        this.setPressao(valor); 
    }

    public sensor(sensor outro){ 
        this.pressao = outro.getPressao();
    }
    
    public double getPressao(){ 
        return this.pressao;
    }

    public boolean setPressao(double valor){
        if (valor > 0){ 
            return false; 
        }
        this.pressao = valor; 
        return true; 

    }
    
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        sensor s = (sensor) o;
        return this.pressao == s.getPressao();
    }

    public String toString() {
        return "Sensor [Pressão: " + this.pressao + "]";
    }

    public sensor clone() {
        return new sensor(this);
    }

    
}
