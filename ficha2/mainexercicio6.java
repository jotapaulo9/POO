

public class mainexercicio6 {
    public static void main(){
    int[][] matriz = {{1, 1, 2}, 
                      {3, 5, 8}, 
                      {13, 21, 34}};

        exercicio6 ex6 = new exercicio6(matriz, matriz.length, matriz[0].length);

        // Chamamos o método do exercício a)
        ex6.leMatriz(matriz);


        // Chamamos o método do exercício b)
    int[][] matriz2 = {{2,2,2},  
                      {2,2,2}, 
                      {2,2,2}};
                           
        System.out.println("Segue a matriz que irá ser somada com a original: ");
        ex6.leMatriz(matriz2);
        int[][] matrizSoma = ex6.somaMatrizes(matriz2);
        System.out.println("O resultado da soma entre a matriz original e esta é: ");
        ex6.leMatriz(matrizSoma); 


        // Chamamos o método do exercício c)
        System.out.println("Verifiquemos se o resultado da Soma é igual à matriz original");
            if(ex6.equalsMat(matrizSoma)){
            System.out.println("As matrizes são iguais!");
                } else {
                System.out.println("As matrizes são diferentes!");
        }

        // Chamamos o método do exercício d)
        int[][] matrizOposta = ex6.criaOposta();
        System.out.println("Segue se a matriz oposta à matriz original:");
        ex6.leMatriz(matrizOposta);

    }
}
