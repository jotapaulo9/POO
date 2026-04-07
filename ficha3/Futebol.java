public class Futebol {

    private Estado estado;
    private int golosCasa; 
    private int golosFora; 

    public enum Estado{ 
        por_iniciar, a_decorrer, terminou
    }

    //CONSTRUTORES 

    public Futebol(){ 
        this.estado = Estado.por_iniciar; 
        this.golosCasa = 0; 
        this.golosFora = 0; 
    }

    public Futebol(Estado estado, int golosCasa, int golosFora){ 
        this.estado = estado;
        this.golosCasa = golosCasa;
        this.golosFora = golosFora;
    }

    public Futebol(Futebol outro){ 
        this.estado = outro.getEstado();
        this.golosCasa = outro.getgolosCasa(); 
        this.golosFora= outro.getgolosFora();
    }


    //GETTERS

    public Estado getEstado(){ 
        return this.estado; 
    }

    public int getgolosCasa(){ 
        return this.golosCasa; 
    }

    public int getgolosFora(){ 
        return this.golosFora; 
    }

    // SETTERS 

    public void setEstado(Estado estado){
        this.estado = estado;
    }

    public void setGolosCasa(int golosCasa){
        this.golosCasa = golosCasa;
    }

    public void setGolosVis(int golosFora){
        this.golosFora = golosFora;
    }


    //a)
    public void startGame(){
        this.setEstado(Estado.a_decorrer);
    }

    //b) 
    public void endGame(){
        this.setEstado(Estado.terminou);
    }

    //c)
    public void goloVisitado(){
        if(this.estado == Estado.a_decorrer){ 
            this.golosCasa++; 
        }
    }
    //d)
    public void goloVisitante(){
        if(this.estado == Estado.a_decorrer){ 
            this.golosFora++; 
        }
    }

    public String resultadoActual(){
        return this.golosCasa + "-" + this.golosFora; 
    }

    public Futebol clone(){
        return new Futebol(this);
    }

    public boolean equals(Object o){
        if( this == o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;
        Futebol jF = (Futebol) this;
        return(this.estado == jF.estado && this.golosCasa == jF.golosCasa && this.golosFora == jF.golosFora);
    }

    public String toString(){
        switch(this.estado){
            case por_iniciar : 
                return "o estado atual do jogo e: " + this.estado;
                
            case a_decorrer : 
                return "o estado atual do jogo e: " + this.estado + 
                       "a equipa da casa marcou: " + this.golosCasa + 
                       "a equipa visitante marcou: " + this.golosFora + 
                       "o resultado atual e: " + this.resultadoActual(); 

            default:
                return "O jogo neste momento está: " + this.estado + "\n" +
                       "A equipa da casa marcou " + this.golosCasa + " golos!\n" +
                       "A equipa visitante marcou " + this.golosFora + " golos!\n" +
                       "O jogo terminou: " + this.resultadoActual() + "!";
        }
    }

}

