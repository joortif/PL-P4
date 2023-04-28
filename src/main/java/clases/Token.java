package clases;

public class Token {

    private String idToken;
    private int[] lexema;

    public Token(String id, int[] lexema){
        this.idToken = id;
        this.lexema = lexema;
    }

    public String getId() {
        return idToken;
    }

    public int[] getLexema() {
        return lexema;
    }
}
