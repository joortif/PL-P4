package clases;

public class AutomataFinitoMatriz extends AutomataFinito{

    private int[][] matriz;

    public AutomataFinitoMatriz(int num, int alfabeto) {
        super(num, alfabeto);
    }

    public AutomataFinitoMatriz(int num, int alfabeto, boolean[] finales){
        super(num, alfabeto, finales);
    }

    @Override
    public int transicion(int estado, int letra) {
        return 0;
    }

}
