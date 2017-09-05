package br.univali.portugol.nucleo.analise.sintatica.tradutores;

import br.univali.portugol.nucleo.analise.sintatica.AnalisadorSintatico;
import br.univali.portugol.nucleo.analise.sintatica.erros.ErroParsingNaoTratado;
import br.univali.portugol.nucleo.mensagens.ErroSintatico;
import java.util.Stack;
import org.antlr.runtime.EarlyExitException;

/**
 * Tradutor para erros de parsing do tipo {@link EarlyExitException}.
 * 
 * TODO: adicionar nesta documentação a descrição e exemplos de quando este tipo 
 * de erro é gerado pelo ANTLR.
 * 
 * 
 * @author Luiz Fernando Noschang
 * @version 1.0
 * 
 * @see AnalisadorSintatico
 */
public final class TradutorEarlyExitException
{
    /**
     * 
     * @param erro               o erro de parsing gerado pelo ANTLR, sem nenhum tratamento.
     * @param tokens             a lista de tokens envolvidos no erro.
     * @param pilhaContexto      a pilha de contexto do analisador sintático.
     * @param mensagemPadrao     a mensagem de erro padrão para este tipo de erro.
     * @return                   o erro sintático traduzido.
     * @since 1.0
     */    
    public ErroSintatico traduzirErroParsing(EarlyExitException erro, String[] tokens, Stack<String> pilhaContexto, String mensagemPadrao, String codigoFonte) 
    {
        int linha = erro.line;
        int coluna = erro.charPositionInLine;
        String contextAtual = pilhaContexto.pop();
        
        return new ErroParsingNaoTratado(erro, mensagemPadrao, contextAtual);
    }
}
