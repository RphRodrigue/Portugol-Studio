package programas;

import br.univali.portugol.nucleo.mensagens.ErroExecucao;
import br.univali.portugol.nucleo.Programa;

public class testVariaveisGlobaisInicializadasComValoresSimples extends Programa
{
    private int i;
    private String c;
    private boolean l;
    private char ch;
    private double r;

    public testVariaveisGlobaisInicializadasComValoresSimples() throws ErroExecucao, InterruptedException
    {
        
    }

    @Override
    protected void inicializar() throws ErroExecucao, InterruptedException
    {
        i = 10;
        c = "teste";
        l = true;
        ch = 'a';
        r = 53.23;
    }

    @Override
    protected void executar(String[] parametros) throws ErroExecucao, InterruptedException
    {
    }
}
