import java.util.Scanner; 

public class mainexercicio4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Quantas Strings quer inserir? ");
        int quantidade = input.nextInt();
        input.nextLine(); // Limpar o buffer
        
        exercicio4 ex4 = new exercicio4(quantidade);
        
        // Inserir Strings
        for (int i = 0; i < quantidade; i++) {
            System.out.print("String " + (i + 1) + ": ");
            String texto = input.nextLine();
            ex4.insereStrings(texto);
        }
        
        // Mostrar todas
        System.out.println("todas as strings: ");
        ex4.mostrarStrings();
        
        // (a) Strings sem repetições
        String[] unicas = ex4.stringsSemRepeticoes();
        for (int i = 0; i < unicas.length; i++) {
            System.out.println("  " + unicas[i]);
        }

        // (b) devolve a maior string
        String maior = ex4.maiorString();
        if (maior != null){
            System.out.println("maior: " + maior); 
        }   
        
        // (c) array com as strings que aparecem mais do que uma vez
        String[] repetidas = ex4.stringsRepetidas();
        if (repetidas.length == 0) {
            System.out.println("  Nenhuma String repetida");
        } else {
            for (int i = 0; i < repetidas.length; i++) {
                System.out.println("  " + repetidas[i]);
            }
        }

        // (d) quantas vezes uma string x aparece no array
        System.out.print("\nQue String quer procurar? ");
        String procurar = input.nextLine();
        int vezes = ex4.contarOcorrencias(procurar);
        System.out.println("A String \"" + procurar + "\" aparece " + vezes + " vez(es)");



        input.close();
    }
}

