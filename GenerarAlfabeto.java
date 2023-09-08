
/**
 * Write a description of class GenerarAlfabeto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GenerarAlfabeto
{
    public static Simbolo[] generarAlfabeto(int base) {
        int k = 0;
        int valorAbsoluto;
        char simbolo;
        Simbolo[] alfabeto = new Simbolo[base];
        
        for (int i = 0; i < base; i++) {
            if (i <= 9) {
                simbolo = (char) ('0' + i);
            } else {
                simbolo = (char) ('A' + k);
                k++;
            }
            
            valorAbsoluto = i;
            
            alfabeto[i] = new Simbolo(simbolo, valorAbsoluto);
        }
        
        return alfabeto;
    }
}
