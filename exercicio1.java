public class exercicio1 {
    
    private int[] numeros;


    public void recebeArray(int[] vetor, int dimensao) {
            numeros = new int[dimensao];
            
            for (int i = 0; i < dimensao; i++) {
                numeros[i] = vetor[i];
            }
        }

    public void mostrarArray() {
        System.out.print("array interno: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }

    public int minValue(){
        
        int minimo = this.numeros[0]; 

        for (int i = 1; i < numeros.length; i++){
            if (this.numeros[i] < minimo){
                minimo = this.numeros[i];
            }
        }

        return minimo; 
    }

    public int[] intervalo(int indiceInicio, int indiceFim){

        int tamanho = indiceFim - indiceInicio + 1; 

        int[] novoArray = new int[tamanho]; 

        int j = 0; 
        for(int i = indiceInicio; i <= indiceFim; i++){
            novoArray[j] = numeros[i];
            j++;
    }
    return novoArray;
}


}



