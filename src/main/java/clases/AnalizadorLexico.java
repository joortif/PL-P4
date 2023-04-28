package clases;

import java.util.List;
import java.util.Map;

public class AnalizadorLexico {

    private int[] cadena;
    private AutomataFinito automata;
    private int posActual;
    private Map<Integer, String> tokens;
    private List<Token> historico;

    public AnalizadorLexico() {
    }

    public Token nextToken(){
        return ;
    }
}
