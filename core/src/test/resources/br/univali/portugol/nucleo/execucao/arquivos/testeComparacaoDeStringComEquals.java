package programas;

import br.univali.portugol.nucleo.mensagens.ErroExecucao;
import br.univali.portugol.nucleo.Programa;

public class testeComparacaoDeStringComEquals extends Programa
{
    private String umaFrase;
    private String outraFrase;
    private int a;
    private int b;

    public testeComparacaoDeStringComEquals() throws ErroExecucao, InterruptedException
    {
    }

    @Override
    protected void inicializar() throws ErroExecucao, InterruptedException
    {
        umaFrase = "a";
        outraFrase = "a";
        a = 0;
        b = 0;
    }

    @Override
    protected void executar(String[] parametros) throws ErroExecucao, InterruptedException
    {
        if (umaFrase.equals(outraFrase))
        {
            escreva("teste");
        }
        if (!umaFrase.equals(outraFrase))
        {
            escreva("teste");
        }
        if (a == b)
        {
            escreva("teste");
        }
        if (a == b / 2)
        {
            escreva("teste");
        }
        if (a == 10 / 2 * 2)
        {
            escreva("teste");
        }
    }
}
