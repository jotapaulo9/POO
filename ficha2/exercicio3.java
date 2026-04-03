public class exercicio3 {
    private int[] numeros; 

    public exercicio3(int[] array){
        numeros = array;
    }
    
    public void ordCrescente(){
        for (int i = 0; i < numeros.length; i++){
            for(int j = 0; j < numeros.length - i - 1; j++){
                if(numeros[j] > numeros[j+1]){
                    
                int temp = numeros[j];
                numeros[j] = numeros[j + 1];
                numeros[j + 1] = temp;


                }
            }
        }
    }
   
   
    public int procuraBinaria(int elemento){
        int inicio = 0; 
        int fim = numeros.length - 1;

        while(inicio <= fim){
            int meio = (inicio + fim)/2; 

            if(numeros[meio] == elemento){
                return meio;
            }else if (elemento < numeros[meio]){
                fim = meio - 1; 
            } 
            else {
                inicio = meio + 1; 
            }           
        }
       return -1;
    }
    
    public void mostrarArray() {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }
}
