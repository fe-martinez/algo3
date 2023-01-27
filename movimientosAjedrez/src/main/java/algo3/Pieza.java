package algo3;

public class Pieza {
    static final char PEON = 'p';
    static final char TORRE = 'r';
    static final char CABALLO = 'n';
    static final char ALFIL = 'b';
    static final char REY = 'k';
    static final char DAMA = 'q';

    static final char BLANCO = 'w';
    static final char NEGRO = 'o';

    private char equipo;
    public char tipoPieza;

    public Pieza(char equipo, char tipoPieza) {
        this.equipo = equipo;
        this.tipoPieza = tipoPieza;
    }

    public boolean seMueveAsi(Coordenada origen, Coordenada destino){
        int dif_x = destino.getX() - origen.getX();
        int dif_y = destino.getY() - origen.getY();

        //Pone en positivo las diferencias
        if(dif_y < 0){
            dif_y = -dif_y;
        }
        if(dif_x < 0){
            dif_x = -dif_x;
        }

        switch (this.tipoPieza) {
            case PEON:
                return(dif_y == 1 && dif_x == 0);
            case TORRE:
                return((dif_y == 0 && dif_x != 0) || (dif_y != 0 && dif_x == 0));
            case ALFIL:
                return (dif_y == dif_x);
            case CABALLO:
                return((dif_y == 2 && dif_x == 1) || (dif_y == 1 && dif_x == 2));
            case DAMA:
                return((dif_y == 0) || (dif_x == 0) || (dif_y == dif_x));
            case REY:
                return ((dif_y == 1) || (dif_x == 1));
        }
        return false;
    }

    public void mostrarPieza(){
        char piezaImprimir = this.tipoPieza;
        if(this.equipo == BLANCO){
            piezaImprimir = Character.toUpperCase(piezaImprimir);
        }
        System.out.print(piezaImprimir);
    }
}
