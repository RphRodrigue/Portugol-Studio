package programas;

import br.univali.portugol.nucleo.mensagens.ErroExecucao;
import br.univali.portugol.nucleo.Programa;

public class testeMatrizPorReferencia extends Programa
{

    
    public testeMatrizPorReferencia() throws ErroExecucao, InterruptedException
    {
        
    }

    @Override
    protected void executar(String[] parametros) throws ErroExecucao, InterruptedException
    {  
        int m[][] = new int[1][1];
        int v[] = new int[1];
        teste(m, v);
    }

    private void teste(int matriz[][], int vetor[]) throws ErroExecucao, InterruptedException
    {  
        
    }
    
}
