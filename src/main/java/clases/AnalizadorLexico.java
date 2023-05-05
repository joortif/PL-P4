package clases;

import java.util.ArrayList;
import java.util.Arrays;
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
    public boolean hasMoreTokens(){
        boolean tiene = false;
        for (int i=posActual; i< cadena.length; i++){
            if (automata.transicion(i,cadena[i])== -1){
                break;
            } else if (automata.esEstadoFinal(i)){
                tiene = true;
                break;
            }
        }
        return tiene;
    }

    public Token nextToken(){
        int pos = posActual;
        int ultFinal=-1;
        int posUltFinal=0;
        Token token = null;

        while (pos < cadena.length){
            posUltFinal = automata.transicion(posUltFinal, cadena[posUltFinal]);
            if (posUltFinal == -1){
                break;
            }
            if (automata.esEstadoFinal(posUltFinal)){
                ultFinal = posUltFinal;
                posUltFinal = pos;
            }
            pos++;
        }
        if (ultFinal != -1){
            token = new Token(tokens.get(ultFinal), Arrays.copyOfRange(cadena, posActual, pos));
            historico.add(token);
            posActual = pos+1;
        }
        return token;
    }

    public void reset(){
        historico.clear();
        posActual = 0;
    }

    public void nuevaCadena(int[] cadena){
        this.reset();
        this.cadena = cadena;
    }

    public List<Token> finalizarAnalisis(){
        return this.historico;
    }

    public List<Token> getHistorico(){
        return historico;
    }


}
