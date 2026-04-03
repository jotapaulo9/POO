public class exercicio5 {
    private int[][] pauta;
    private int alunos;
    private int ucs;

    // Construtor de Classe
    public exercicio5(int[][] pauta,int alunos, int ucs){
        this.pauta = pauta;
        this.alunos = alunos;
        this.ucs = ucs;
    }

    // Define ou altera uma nota 
    public void setNota(int aluno, int uc, int nota){
        this.pauta[aluno][uc] = nota;
    }

    // soma as notas de um determinado aluno 
    public int somaNotasAluno(int aluno){
        int soma = 0;
        for (int uc = 0; uc < ucs; uc++){
            soma += pauta[aluno][uc];
        }
        return soma;
    }

    // soma as notas de uma determinada cadeira 
        public int somaNotasUc(int uc){
            int soma = 0;
            for (int aluno = 0; aluno < alunos; aluno++){
                soma += pauta[aluno][uc];
            }
            return soma;
    }
        
    public double calculaMediaAluno(int mediaDoAluno, int numUcs){
        double soma = somaNotasAluno(mediaDoAluno);
        double media = soma / numUcs;
        return media;
    }

    //basicamente igual ao anterior 
    public double calculaMediaUc(int mediaDaUc, int numAlunos){
        double soma = somaNotasUc(mediaDaUc);
        double media = soma / numAlunos;
        return media;

    }

    public int getMaiorNota(){
        int maiorNota = pauta[0][0]; 
         for(int aluno = 0; aluno < alunos; aluno++){
            for(int uc = 0; uc < ucs; uc++){
                maiorNota = Math.max(maiorNota, pauta[aluno][uc]);
            }
        }
        return maiorNota;
    }
    
    public int getMenorNota(){
        int menorNota = pauta[0][0]; 
         for(int aluno = 0; aluno < alunos; aluno++){
            for(int uc = 0; uc < ucs; uc++){
                menorNota = Math.min(menorNota, pauta[aluno][uc]);
            }
        }
        return menorNota;
    }

    public void aprovados(double notaMinima, int[] notasAprovadas){
        int i = 0;
        for(int aluno = 0; aluno < alunos; aluno++){
            for(int uc = 0; uc < ucs; uc++){
                if(pauta[aluno][uc] > notaMinima){
                    notasAprovadas[i] = pauta[aluno][uc];
                    i++;
                } 
            }
        }
    }

    public String pautaToString(String todasAsNotas){
        int i = 1;
            for(int aluno = 0; aluno < alunos; aluno++){
                for(int uc = 0; uc < ucs; uc++){
                    todasAsNotas += "Nota " + i + ": " + pauta[aluno][uc] + "; ";
                    i++;
                }
            }
        return todasAsNotas;
    }
        // Este método vai retornar o índice da cadeira com a média mais alta
    public int mediaMaisAlta(){
        int media = 0;
        int maxMedia = 0;
        int indexCadeira = 0;
        for(int uc = 0; uc < ucs; uc++){
            media = 0;
            for(int aluno = 0; aluno < alunos; aluno++){
                media += pauta[aluno][uc];
            }
            maxMedia = Math.max(maxMedia, media);
            if(maxMedia == media){
                indexCadeira = uc;
            }
        }
        return indexCadeira;
    }
}




