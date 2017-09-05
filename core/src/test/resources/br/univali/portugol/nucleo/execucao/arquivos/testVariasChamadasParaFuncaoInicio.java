package programas;

import br.univali.portugol.nucleo.mensagens.ErroExecucao;
import br.univali.portugol.nucleo.Programa;

public class testVariasChamadasParaFuncaoInicio extends Programa
{

    public testVariasChamadasParaFuncaoInicio() throws ErroExecucao, InterruptedException
    {
    }

    @Override
    protected void executar(String[] parametros) throws ErroExecucao, InterruptedException
    {
        teste();
    }

    private void teste() throws ErroExecucao, InterruptedException
    {
        executar(new String[0]);
    }
}
