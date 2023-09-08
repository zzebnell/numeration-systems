
/**
 * Write a description of class Suma here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Suma
{
    public static String suma(SistemaDeNumeracion valor1, SistemaDeNumeracion valor2) {
        if (valor1.getBase() != valor2.getBase()) {
            return null;
        }
        
        Composicion res = new Composicion();
        Simbolo[] alfabeto = valor1.getAlfabeto();
        
        int base = alfabeto.length;
        int suma;
        int acarreo = 0;
        int valor;
        int indice;
        char caracter;
        
        String valorAsociado1 = valor1.getValorAsociado();
        String valorAsociado2 = valor2.getValorAsociado();
        
        Composicion compo1 = Composicion.stringAComposicion(valorAsociado1, alfabeto);
        Composicion compo2 = Composicion.stringAComposicion(valorAsociado2, alfabeto);
        
        Simbolo simbolo1;
        Simbolo simbolo2;
        Simbolo simboloRes;
        
        // Operando
        
        for (int i = compo1.getSize() - 1; i >= 0; i--) {
            simbolo1 = compo1.getSimboloDe(i);
            simbolo2 = compo2.getSimboloDe(i);
            
            suma = acarreo + simbolo1.getValorAbsoluto() + simbolo2.getValorAbsoluto();
            
            valor = (suma >= base) ? ((suma - base)) : (suma);
            acarreo = suma / base;
            
            indice = Buscar.buscarValorAbsoluto(valor, alfabeto);
            caracter = alfabeto[indice].getSimbolo();
            valor = alfabeto[indice].getValorAbsoluto();
            
            simboloRes = new Simbolo(caracter, valor);
            res.insertarSimboloInicio(simboloRes);
        }
        
        if (acarreo != 0) {
            res.insertarSimboloInicio(new Simbolo(alfabeto[Buscar.buscarValorAbsoluto(acarreo, alfabeto)].getSimbolo(), acarreo));
        } 
        
        return res.toString();
    }
}
