public class exercicio4 {
    private String[] strings; 
    private int numStrings; 

        public exercicio4(int tamanho){
            strings = new String[tamanho];
            numStrings = 0; 
        }

        public void insereStrings(String texto){
            if (numStrings <= strings.length){
                strings[numStrings] = texto;
                numStrings++;
            }
        }
        // (a) Strings sem repetições
        public String[] stringsSemRepeticoes() {
            int contador = 0;
        
            for (int i = 0; i < numStrings; i++) {
                boolean jaContado = false;
            
            for (int j = 0; j < i; j++) {
                if (strings[i].equals(strings[j])) {
                    jaContado = true;
                    break;
                }
            }
            
            if (!jaContado) {
                contador++;
            }
        }
        
        // PASSO 2: Criar array com o tamanho exato
        String[] semRepeticoes = new String[contador];
        
        // PASSO 3: Preencher o array
        int posicao = 0;
        
        for (int i = 0; i < numStrings; i++) {
            boolean jaAdicionado = false;
            
            for (int j = 0; j < posicao; j++) {
                if (strings[i].equals(semRepeticoes[j])) {
                    jaAdicionado = true;
                    break;
                }
            }
            
            if (!jaAdicionado) {
                semRepeticoes[posicao] = strings[i];
                posicao++;
            }
        }
        
        return semRepeticoes;
    }
       
    
        public void mostrarStrings() {
        System.out.println("Strings no array:");
        for (int i = 0; i < numStrings; i++) {
            System.out.println("  " + strings[i]);
        }
    }
    public String maiorString(){

        if(numStrings == 0){
            return null; 
        }

        String maior = strings[0]; 

        for (int i = 1; i < numStrings; i++){
            if(strings[i].length() > maior.length()){
                maior = strings[i];
            }
                
        }
        return maior;
    }
    public String[] stringsRepetidas() {
        int contador = 0;
        
        for (int i = 0; i < numStrings; i++) {
            int ocorrencias = 0;
            
            for (int j = 0; j < numStrings; j++) {
                if (strings[i].equals(strings[j])) {
                    ocorrencias++;
                }
            }
            
            if (ocorrencias > 1) {
                boolean jaContado = false;
                
                for (int k = 0; k < i; k++) {
                    if (strings[i].equals(strings[k])) {
                        jaContado = true;
                        break;
                    }
                }
                
                if (!jaContado) {
                    contador++;
                }
            }
        }
        
        String[] repetidas = new String[contador];
        int posicao = 0;
        
        for (int i = 0; i < numStrings; i++) {
            int ocorrencias = 0;
            
            for (int j = 0; j < numStrings; j++) {
                if (strings[i].equals(strings[j])) {
                    ocorrencias++;
                }
            }
            
            if (ocorrencias > 1) {
                boolean jaAdicionado = false;
                
                for (int k = 0; k < posicao; k++) {
                    if (strings[i].equals(repetidas[k])) {
                        jaAdicionado = true;
                        break;
                    }
                }
                
                if (!jaAdicionado) {
                    repetidas[posicao] = strings[i];
                    posicao++;
                }
            }
        }
        
        return repetidas;
    }
    public int contarOcorrencias(String texto) {
        int contador = 0;
        
        for (int i = 0; i < numStrings; i++) {
            if (strings[i].equals(texto)) {
                contador++;
            }
        }
        
        return contador;
    }
    
}
