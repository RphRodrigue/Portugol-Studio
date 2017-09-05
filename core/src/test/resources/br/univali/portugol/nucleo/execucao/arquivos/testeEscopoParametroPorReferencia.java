package programas;

import br.univali.portugol.nucleo.mensagens.ErroExecucao;
import br.univali.portugol.nucleo.Programa;

public class testeEscopoParametroPorReferencia extends Programa
{
    private final int[] REFS_INT = new int[4];

    private final int INDICE_I_0 = 0;
    private final int INDICE_M_1 = 1;
    private final int INDICE_M_2 = 2;
    private final int INDICE_M_3 = 3;
   
    public testeEscopoParametroPorReferencia() throws ErroExecucao, InterruptedException
    {
        
    }

    @Override
    protected void inicializar() throws ErroExecucao, InterruptedException
    {
        REFS_INT[INDICE_I_0] = -1;
    }
    
    

    @Override
    protected void executar(String[] parametros) throws ErroExecucao, InterruptedException
    {  
        REFS_INT[INDICE_M_1] = 0;
        teste(INDICE_I_0);
        teste(INDICE_M_1);
    }
    
    private void teste(int a)  throws ErroExecucao, InterruptedException                               
    {                                                      
        
        if (true)
        {
            REFS_INT[INDICE_M_2] = 2;
            teste_escopo(INDICE_M_2);
        }
        
        if (true)
        {
            REFS_INT[INDICE_M_3] = 9;
            teste_escopo(INDICE_M_3);
        }
        
        teste_escopo(a);
    }

    private void teste_escopo(int a)  throws ErroExecucao, InterruptedException
    {
        teste(a);
    }
}
