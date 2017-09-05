package programas;

import br.univali.portugol.nucleo.mensagens.ErroExecucao;
import br.univali.portugol.nucleo.Programa;

public class testeGeracaoPontosDeParada extends Programa
{

    public testeGeracaoPontosDeParada() throws ErroExecucao, InterruptedException
    {

    }

    @Override
    protected void executar(String[] parametros) throws ErroExecucao, InterruptedException
    {
        realizarParada(6, 20);
        int a = 2;
        
        realizarParada(7, 20);
        int b = 4;
        
        realizarParada(8, 16);
        int m[][] = new int[2][2];
        
        realizarParada(9, 16);
        int v[] = new int[3];
        
        realizarParada(10, 15);
        String c[] = new String[]{"a", "b"};
        
        realizarParada(11, 15);
        String matriz[][] = new String[][]{{"a", "b"}};
        
        realizarParada(13, 26);
        for(int x = 0; x < 10; x = x + 1)
        {
            realizarParada(14, 12);
            a = 10;
        }
    }

}
