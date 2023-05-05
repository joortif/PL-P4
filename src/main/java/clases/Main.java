package clases;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args){
        /*
        * Tabla del autómata determinista calculado a partir del determinista de las diapositivas. Se obtienen 9 estados
        * (del 0 al 8) y 6 estados finales. Cada estado del determinista que tenga al menos un estado final del no determinista
        * será final en el determinista. De esta forma se crea la matriz del autómata y sus estados finales.
        * */
        int matriz[][]={{1,2,3},{4,5,-1},{-1,5,-1},{-1,-1,3},{6,7,-1},{-1,5,-1},{6,5,-1},{-1,8,-1},{-1,5,-1}};
        int tamAlfabeto=3;
        int numEstados=9;
        boolean finales[]={false,true,true,true,false,true,false,true,true};


        String palabra="";

        /*
         * Equivalencias de estados finales con los tokens que "cantan". Se obtiene de la tabla al calcular la
         * tabla del autómata determinista.
         */
        Map<Integer, String> equivTokens = new HashMap<>();
        equivTokens.put(1, "cero"); //6 estados finales
        equivTokens.put(2, "uno");
        equivTokens.put(3, "cuatro");
        equivTokens.put(5, "tres");
        equivTokens.put(7, "tres");
        equivTokens.put(8, "dos");
    }
}
