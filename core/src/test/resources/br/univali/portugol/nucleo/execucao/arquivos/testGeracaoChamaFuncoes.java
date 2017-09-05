package programas;

import br.univali.portugol.nucleo.mensagens.ErroExecucao;
import br.univali.portugol.nucleo.Programa;

public class testGeracaoChamaFuncoes extends Programa
{

    public testGeracaoChamaFuncoes() throws ErroExecucao, InterruptedException
    {
    }

    @Override
    protected void executar(String[] parametros) throws ErroExecucao, InterruptedException
    {
        int x = 1;
        do
        {
            teste(x);
        }
        while (x < 10);
        
        testeRetorno(1);
    }

    private void teste(int a) throws ErroExecucao, InterruptedException
    {
        escreva(testeRetorno(a));
    }

    private boolean testeRetorno(int a) throws ErroExecucao, InterruptedException
    {
        return a % 2 == 0;
    }
}
