import java.util.ArrayList;
/**
 * Write a description of class Composicion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Composicion
{
    private ArrayList<Simbolo> elementos;
    
    public Composicion() {
        elementos = new ArrayList<Simbolo>();
    }
    
    public static Composicion stringAComposicion(String valor, Simbolo[] alfabeto) {
        Composicion composicion = new Composicion();
        Simbolo simbolo;
        char caracter;
        int valorAbsoluto;
        int indice;
        
        for (int i = 0; i < valor.length(); i++) {
            caracter = valor.charAt(i);
            indice = Buscar.buscarSimbolo(caracter, alfabeto);
            simbolo = new Simbolo(caracter, alfabeto[indice].getValorAbsoluto());
            
            composicion.insertarSimbolo(simbolo);
        }
        
        return composicion;
    }
    
    public void insertarSimbolo(Simbolo simbolo) {
        elementos.add(simbolo);
    }
    
    public void insertarSimboloInicio(Simbolo simbolo) {
        elementos.add(0, simbolo);
    }
    
    public int getSize() {
        return elementos.size();
    }
    
    public Simbolo getSimboloDe(int i) {
        return elementos.get(i);
    }
    
    @Override
    public String toString() {
        String res = "";
        
        for (Simbolo simbolo : elementos) {
            res += simbolo.getSimbolo();
        }
        
        return res;
    }
}
