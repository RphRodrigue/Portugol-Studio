package programas;

import br.univali.portugol.nucleo.mensagens.ErroExecucao;
import br.univali.portugol.nucleo.Programa;

public class testVariaveisGlobaisInicializadasComExpressoes extends Programa
{
    private String c;
    private int i;
    private boolean l;
    private double r;

    public testVariaveisGlobaisInicializadasComExpressoes() throws ErroExecucao, InterruptedException
    {
    }

    @Override
    protected void inicializar() throws ErroExecucao, InterruptedException
    {
        c = concatena("teste", " concatenacao");
        i = ((10 + 2 * 4 / 1) << 1);
        l = true && true || false;
        r = 53.23 + 0.01;
    }
    
    @Override
    protected void executar(String[] parametros) throws ErroExecucao, InterruptedException
    {
    }
}
