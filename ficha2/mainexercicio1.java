import java.util.Scanner;

public class mainexercicio1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("quantos números? ");
        int quantidade = input.nextInt();
        
        int[] meuArray = new int[quantidade];
        
        System.out.println("introduza os " + quantidade + " números:");
        for (int i = 0; i < quantidade; i++) {
            System.out.print("numero " + (i + 1) + ": ");
            meuArray[i] = input.nextInt();
        }

        exercicio1 tp2_ex1 = new exercicio1();
        
        tp2_ex1.recebeArray(meuArray, quantidade);
        
        tp2_ex1.mostrarArray();

        // alinea b)



        // aliena C) 
        System.out.print("\nIndice inicial: ");
        int inicio = input.nextInt();
        System.out.print("Indice final: ");
        int fim = input.nextInt();


        int[] arrayParcial = tp2_ex1.intervalo(inicio, fim);

        System.out.print("Array entre indices " + inicio + " e " + fim + ": ");
            for (int i = 0; i < arrayParcial.length; i++) {
        System.out.print(arrayParcial[i] + " ");
        }
        System.out.println();

        input.close();
    }

}
    
