import java.time.LocalDate;
import java.util.Scanner;

public class mainExercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Criar objeto com array de 5 datas
        exercicio2 ex2 = new exercicio2();
        
        // Inserir algumas datas
        System.out.println("Vamos inserir datas:");
        
        for (int i = 0; i < 3; i++) {
            System.out.print("\nDia: ");
            int dia = input.nextInt();
            System.out.print("Mês: ");
            int mes = input.nextInt();
            System.out.print("Ano: ");
            int ano = input.nextInt();
            
            // Criar a data
            LocalDate data = LocalDate.of(ano, mes, dia);
            
            // Inserir no array
            ex2.insereData(data);
        }
        
        // (c) Mostrar todas as datas
        System.out.println("\n" + ex2.toString());
        
        // (b) Testar a data mais próxima
        System.out.print("\nIntroduza uma data para verificar a mais próxima:");
        System.out.print("\nDia: ");
        int dia = input.nextInt();
        System.out.print("Mês: ");
        int mes = input.nextInt();
        System.out.print("Ano: ");
        int ano = input.nextInt();
        
        LocalDate dataTest = LocalDate.of(ano, mes, dia);
        LocalDate proxima = ex2.dataMaisProxima(dataTest);
        
        if (proxima != null) {
            System.out.println("\nA data mais próxima é: " + proxima);
        } else {
            System.out.println("\nNão há datas no array!");
        }
        
        input.close();
    }
}
