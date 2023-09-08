
/**
 * Write a description of class BuscarSimbolo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Buscar
{
    public static int buscarSimbolo(char simbolo, Simbolo[] alfabeto) {
        int indice = -1;
        int k = 0;
        
        while (k < alfabeto.length && indice == -1) {
            if (alfabeto[k].getSimbolo() == simbolo) {
                indice = k;
            }
            k++;
        }
        
        return indice;
    }
    
    public static int buscarValorAbsoluto(int valorAbsoluto, Simbolo[] alfabeto) {
        int indice = -1;
        int k = 0;
        
        while (k < alfabeto.length && indice == -1) {
            if (alfabeto[k].getValorAbsoluto() == valorAbsoluto) {
                indice = k;
            }
            k++;
        }
        
        return indice;
    }
}
