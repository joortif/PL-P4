package clases;

/*
Sus objetos son autómatas finitos con un número "numEstados" de estados
indexados desde 0 hasta numEstados-1. Fijamos que el estado 0 sea siempre el inicial.
Utilizamos un entero "tamAlfabeto” para representar el número de caracteres del alfabeto. Los caracteres serán también enteros indexados desde 0 en adelante.
Podemos representar los estados finales con un vector de booleanos o un Set de enteros. Se puede utilizar otro atributo para indicar el estado actual
*/

public abstract class AutomataFinito {
    private int tamAlfabeto;
    private int numEstados;
    private boolean[] finales;

    public AutomataFinito(int num, int alfabeto){
        this.tamAlfabeto = alfabeto;
        this.numEstados = num;
        this.finales = new boolean[numEstados];
    }

    public AutomataFinito(int num, int alfabeto, boolean[] finales){
        this.tamAlfabeto = alfabeto;
        this.numEstados = num;
        this.finales = finales;
    }
    public void setFinales(boolean[] estadosFinales){
        this.finales = estadosFinales;
    }

    public int getNumEstados(){
        return this.numEstados;
    }
    public boolean[] getFinales(){
        return this.finales;
    }
    public boolean esEstadoFinal(int estado){
        return this.finales[estado];
    }
    public void marcarFinal(int estado){
        this.finales[estado] = true;
    }
    public abstract int transicion(int estado, int letra);
    public int cierreTransicion(int estado, int[] cadena){
        for (int j : cadena) {
            if (estado == -1) {
                break;
            }
            estado = transicion(estado, j);
        }
        return estado;
    }
    public boolean perteneceLenguaje(int[] cadena){
        int estado = cierreTransicion(0, cadena);
        if (estado != -1){
            return esEstadoFinal(estado);
        } else {
            return false;
        }
    }






}
