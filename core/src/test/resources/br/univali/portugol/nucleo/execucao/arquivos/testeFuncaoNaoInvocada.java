package programas;

import br.univali.portugol.nucleo.mensagens.ErroExecucao;
import br.univali.portugol.nucleo.Programa;

public class testeFuncaoNaoInvocada extends Programa
{
    public testeFuncaoNaoInvocada() throws ErroExecucao, InterruptedException
    {
        
    }

    @Override
    protected void executar(String[] parametros) throws ErroExecucao, InterruptedException
    {  
        int x = 0;
        escreva(x);
    }
    
    
}
