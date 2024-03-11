package juegocartas;

public enum NombreCarta {
    AS,
    DOS,
    TRES,
    CUATRO,
    CINCO,
    SEIS,
    SIETE,
    OCHO,
    NUEVE,
    DIEZ,
    JACK,
    QUEEN,
    KING;
    
    // Método para obtener el siguiente nombre de carta circularmente
    public NombreCarta siguiente() {
        int ordinal = (this.ordinal() + 1) % values().length;
        return values()[ordinal];
    }
}
