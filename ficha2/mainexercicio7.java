import java.util.Scanner;

public class mainexercicio7 {
    public static void main(String[] args){

        int[] chave = new int[7];
        int[] chaveAposta = new int[7];
        Scanner input = new Scanner(System.in);

        exercicio7 ex7 = new exercicio7(chave, 7);

        ex7.geraChave();

        System.out.println("Faça a sua aposta: ");
        System.out.println("Introduza 5 números de 1-50");
        for(int i = 0; i < 5; i++){
            System.out.print("Número " + (i+1) + ": ");
            chaveAposta[i] = input.nextInt();
        }
        System.out.println("Introduza 2 estrelas de 1-9");
        for(int i = 5; i < 7; i++){
            System.out.print("Estrela " + (i - 4) + ": ");
            chaveAposta[i] = input.nextInt();
        }

        int result = ex7.keyCompare(chaveAposta);

        System.out.println("\n--- os teus numeros ---");
        ex7.leChave(chaveAposta);

        System.out.println("\n--- numeros da sorte ---");
        ex7.leChave(chave);
        System.out.println("");

        if(result == 0){
            System.out.println("Não acertou nenhum número. Boa sorte para a próxima!");

        } else if(result == 1){
            System.out.println("Acertou os seguintes números/estrelas:");
            // Mostra apenas os acertos (sem modificar chaveAposta)
            int[] acertos = ex7.getAcertos(chaveAposta);
            ex7.leChave(acertos);

        } else {
            // JACKPOT: imprime a chave 50 vezes, cada vez 2 colunas mais à direita
            System.out.println("          ! ! ! JackPot ! ! !");
            System.out.println("");
            for(int j = 0; j < 50; j++){
                // Cada iteração desloca 2 colunas (espaços) mais à direita
                ex7.leChaveIndentada(chave, j * 2);
            }
        }

        input.close();
    }
}