package clases;

public class AutomataFinitoMatriz extends AutomataFinito{

    private int[][] matriz;

    public AutomataFinitoMatriz(int num, int alfabeto, int[][] matriz) {
        super(num, alfabeto);
        this.matriz = matriz;
    }

    public AutomataFinitoMatriz(int num, int alfabeto, boolean[] finales){
        super(num, alfabeto, finales);
    }

    @Override
    public int transicion(int estado, int letra) {
        return matriz[estado][letra];
    }

}
