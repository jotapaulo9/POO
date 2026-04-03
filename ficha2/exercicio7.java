import java.util.Random;

public class exercicio7 {
    private int[] chave;
    private int keySize;

    Random random = new Random();

    public exercicio7(int[] chave, int keySize){
        this.chave = chave;
        this.keySize = keySize;
    }

    // Verifica se um número já existe num array (até à posição 'limite')
    private boolean jaExiste(int[] array, int limite, int num){
        int i = 0;
        while(i < limite){
            if(array[i] == num){
                return true;
            }
            i++;
        }
        return false;
    }

    // Gera a chave sem números repetidos
    public void geraChave(){
        // Gera 5 números únicos de 1-50
        int i = 0;
        while(i < 5){
            int num = random.nextInt(50) + 1;
            if(!jaExiste(chave, i, num)){
                chave[i] = num;
                i++;
            }
        }

        // Gera 2 estrelas únicas de 1-9
        int j = 5;
        while(j < keySize){
            int num = random.nextInt(9) + 1;
            if(!jaExiste(chave, j, num)){
                chave[j] = num;
                j++;
            }
        }
    }

    // Lê e imprime a chave
    public void leChave(int[] chave){
        for(int i = 0; i < 5; i++){
            if(chave[i] != 0)
                System.out.print("Número " + (i+1) + ": " + chave[i] + "  ");
        }
        System.out.println("");
        for(int i = 5; i < keySize; i++){
            if(chave[i] != 0)
                System.out.print("Estrela " + (i - 4) + ": " + chave[i] + "  ");
        }
        System.out.println("");
    }

    // compara a aposta com a chave, independentemente da ordem
    // retorna 0 = nenhum acerto, 1 = algum acerto, 2 = es o rei
    public int keyCompare(int[] chaveAposta){
        int acertos = 0;

        // Compara os 5 números 
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(chaveAposta[i] == chave[j]){
                    acertos++;
                    break;
                }
            }
        }

        // Compara as 2 estrelas 
        for(int i = 5; i < keySize; i++){
            for(int j = 5; j < keySize; j++){
                if(chaveAposta[i] == chave[j]){
                    acertos++;
                    break;
                }
            }
        }

        if(acertos == 0){
            return 0;           // Nenhum acerto
        } else if(acertos == keySize){
            return 2;           // Jackpot
        } else {
            return 1;           // Algum acerto
        }
    }

    // Devolve array com apenas os valores coincidentes
    public int[] getAcertos(int[] chaveAposta){
        int[] acertos = new int[keySize];

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(chaveAposta[i] == chave[j]){
                    acertos[i] = chaveAposta[i];
                    break;
                }
            }
        }

        for(int i = 5; i < keySize; i++){
            for(int j = 5; j < keySize; j++){
                if(chaveAposta[i] == chave[j]){
                    acertos[i] = chaveAposta[i];
                    break;
                }
            }
        }

        return acertos;
    }

    // Imprime a chave com indentação (para o jackpot)
    // nao entendi isto la muito bem
    public void leChaveIndentada(int[] chave, int espacos){
        String indent = " ".repeat(espacos);
        System.out.print(indent);
        for(int i = 0; i < 5; i++){
            System.out.print("Número " + (i+1) + ": " + chave[i] + "  ");
        }
        System.out.println("");
        System.out.print(indent);
        for(int i = 5; i < keySize; i++){
            System.out.print("Estrela " + (i - 4) + ": " + chave[i] + "  ");
        }
        System.out.println("");
    }
}
