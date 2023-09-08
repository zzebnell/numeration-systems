
/**
 * Write a description of class SistemaDeNumeracion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class SistemaDeNumeracion
{
    private int base;
    private Simbolo[] alfabeto;
    protected String valorAsociado;
    
    public SistemaDeNumeracion(int base) {
        this.base = base;
        alfabeto = GenerarAlfabeto.generarAlfabeto(base);
    }
    
    public void mostrarAlfabeto() {
        for (Simbolo simbolo : alfabeto) {
            System.out.print(simbolo.getSimbolo() + " ");
        }
    }
    
    public String getValorAsociado() {
        return valorAsociado;
    }
    
    public Simbolo[] getAlfabeto() {
        return alfabeto;
    }
    
    public int getBase() {
        return base;
    }
}
