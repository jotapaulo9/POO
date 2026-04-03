import java.util.Scanner;

public class mainexercicio3 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);



        System.out.print("quantos numeros queres introduzir: ");
        int quantidade = input.nextInt();

        int meuArray[] = new int[quantidade];
        System.out.println("Introduza os números:");
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            meuArray[i] = input.nextInt();
        }
        exercicio3 ex3 = new exercicio3(meuArray);
        
        // (a) Ordenar o array
        ex3.ordCrescente();
        System.out.println("\nArray ordenado:");
        ex3.mostrarArray();
        
        // (b) Procurar um elemento
        System.out.print("\nQue número quer procurar? ");
        int numProcurar = input.nextInt();
        
        int posicao = ex3.procuraBinaria(numProcurar);
        
        if (posicao != -1) {
            System.out.println("Número " + numProcurar + " encontrado na posição " + posicao);
        } else {
            System.out.println("Número " + numProcurar + " NÃO encontrado no array");
        }
        
        input.close();
    }
}

