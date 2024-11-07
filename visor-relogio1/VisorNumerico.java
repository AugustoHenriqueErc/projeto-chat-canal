
/**
 * A classe VisorNumerico representa um visor numérico digital que pode
 * guardar values de zero até um dado limite. O limite pode ser especificado
 * ao criar o visor. Os valores variam de zero (inclusivo) até limite-1.
 * Se for usado, p. ex., como um visor de segundos em um relógio digital, o
 * limite seria 60, fazendo com que o visor mostrasse valores de 0 a 59.
 * Quando incrementado, o visor automaticamente volta para zero ao atingir
 * o limite.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 2016.02.29
 * Traduzido por Daniel Conrado (nome original: NumberDisplay)
 */
public class VisorNumerico
{
    private int limite;
    private int valor;

    /**
     * Construtor de objetos da classe VisorNumerico.
     * Configura o limite até o qual o visor gira.
     */
    public VisorNumerico(int limiteGiro)
    {
        limite = limiteGiro;
        valor = 0;
    }

    /**
     * Retorna o valor atual.
     */
    public int getValor()
    {
        return valor;
    }

    /**
     * Retorna o valor de exibição (ou seja, o valor atual como uma String de dois
     * dígitos. Se o valor é menor que dez, ele será preenchido com um zero à
     * esquerda).
     */
    public String getValorExibição()
    {
        if(valor < 10) {
            return "0" + valor;
        }
        else {
            return "" + valor;
        }
    }

    /**
     * Configura o valor do visor para o novo valor especificado. Se o novo
     * valor é menor que zero ou acima do limite, ele não faz nada.
     */
    public void setValor(int valorSubstituto)
    {
        if((valorSubstituto >= 0) && (valorSubstituto < limite)) {
            valor = valorSubstituto;
        }
    }

    /**
     * Incrementa o valor do visor por um, girando para zero caso o
     * limite é alcançado.
     */
    public void incrementar()
    {
        valor = (valor + 1) % limite;
    }
}
