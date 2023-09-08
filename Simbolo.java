
/**
 * Write a description of class Simbolo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Simbolo
{
    private char simbolo;
    private int valorAbsoluto;
    
    public Simbolo(char simbolo, int valorAbsoluto) {
        this.simbolo = simbolo;
        this.valorAbsoluto = valorAbsoluto;
    }
    
    public char getSimbolo() {
        return simbolo;
    }
    
    public int getValorAbsoluto() {
        return valorAbsoluto;
    }
}
