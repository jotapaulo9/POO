import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class exercicio2 {
    private LocalDate[] datas;
    private int numDatas; // Controla quantas datas já foram inseridas
    
    // Construtor - inicializa o array
    public exercicio2() {
        datas = new LocalDate[5];
        numDatas = 0;
    }
    
    // (a) Inserir uma nova data
    public void insereData(LocalDate data) {
        if (numDatas < datas.length) {
            datas[numDatas] = data;
            numDatas++;
        } else {
            System.out.println("Array cheio! Não é possível inserir mais datas.");
        }
    }
    
    // (b) Determinar a data mais próxima (em termos de calendário)
    public LocalDate dataMaisProxima(LocalDate data) {
        // Verificar se há datas no array
        if (numDatas == 0) {
            System.out.println("Não há datas no array!");
            return null;
        }
        
        // Começar com a primeira data como a mais próxima
        LocalDate maisProxima = datas[0];
        long menorDiferenca = Math.abs(ChronoUnit.DAYS.between(data, datas[0]));
        
        // Percorrer as restantes datas
        for (int i = 1; i < numDatas; i++) {
            long diferenca = Math.abs(ChronoUnit.DAYS.between(data, datas[i]));
            
            // Se encontrarmos uma data mais próxima
            if (diferenca < menorDiferenca) {
                menorDiferenca = diferenca;
                maisProxima = datas[i];
            }
        }
        
        return maisProxima;
    }
    
    // (c) Devolver uma String com todas as datas
    public String toString() {
        String resultado = "Datas no array:\n";
        for (int i = 0; i < numDatas; i++) {
            resultado += datas[i] + "\n";
        }
        return resultado;
    }
}

