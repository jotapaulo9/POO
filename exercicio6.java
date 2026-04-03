public class exercicio6 {
    
    private int[][] matriz; 
    private int linhas; 
    private int colunas; 

    public exercicio6 (int[][] matriz, int linhas, int colunas){
        this.matriz = matriz; 
        this.linhas = linhas;
        this.colunas = colunas; 
    }
        
    public void leMatriz(int[][] matriz){
        for(int l = 0; l < linhas; l++){
            for (int c = 0; c < colunas; c++){
                System.out.println(matriz[l][c] + " ");
            }
        }
        System.out.println("");
    }

    public int[][] somaMatrizes(int[][] matriz2){
        int matrizsoma[][] = new int[linhas][colunas]; 
            for(int l = 0; l < linhas; l++){
                for (int c = 0; c < colunas; c++){
                    matrizsoma[l][c] = matriz[l][c] + matriz2[l][c]; 
            }
        }
    return matrizsoma; 
    }

    public boolean equalsMat(int[][] matrizComp){
        int l = 0;
        int c = 0;
        boolean flag = true;
        
        for( l = 0; l < linhas; l++){
            for( c = 0; c < colunas; c++){
                if (matriz[l][c] != matrizComp[l][c]){
                    flag = false;
                }
            }
        }
        return flag;
    }

    public int[][] criaOposta(){
        int[][] matrizOposta = new int[linhas][colunas]; 
            for(int l = 0; l < linhas; l++){
                for(int c = 0; c < colunas; c++){
                    matrizOposta[l][c] = matriz[l][c] * (-1); 
                }

    }
    return matrizOposta; 
    }
}  

