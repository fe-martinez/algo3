package algo3;

public class Tablero {
    static final char PEON = 'p';
    static final char TORRE = 'r';
    static final char CABALLO = 'n';
    static final char ALFIL = 'b';
    static final char REY = 'k';
    static final char DAMA = 'q';

    static final char BLANCO = 'w';
    static final char NEGRO = 'o';
    Pieza[][] piezas;

    public Tablero() {
        this.piezas = ubicarPiezas();
    }

    private Pieza[][] ubicarPiezas() {
        Pieza[][] piezas = new Pieza[8][8];

        for(int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                piezas[i][j] = null;
            }
        }

        for(int i = 0; i < 8; i++){
            piezas[i][1] = new Pieza(BLANCO, PEON);
        }
        piezas[0][0] = new Pieza(BLANCO ,TORRE);
        piezas[1][0] = new Pieza(BLANCO ,CABALLO);
        piezas[2][0] = new Pieza(BLANCO ,ALFIL);
        piezas[3][0] = new Pieza(BLANCO ,DAMA);
        piezas[4][0] = new Pieza(BLANCO ,REY);
        piezas[5][0] = new Pieza(BLANCO ,ALFIL);
        piezas[6][0] = new Pieza(BLANCO ,CABALLO);
        piezas[7][0] = new Pieza(BLANCO ,TORRE);

        for(int i = 0; i < 8; i++){
            piezas[i][6] = new Pieza(NEGRO, PEON);
        }
        piezas[0][7] = new Pieza(NEGRO ,TORRE);
        piezas[1][7] = new Pieza(NEGRO ,CABALLO);
        piezas[2][7] = new Pieza(NEGRO ,ALFIL);
        piezas[3][7] = new Pieza(NEGRO ,DAMA);
        piezas[4][7] = new Pieza(NEGRO ,REY);
        piezas[5][7] = new Pieza(NEGRO ,ALFIL);
        piezas[6][7] = new Pieza(NEGRO ,CABALLO);
        piezas[7][7] = new Pieza(NEGRO ,TORRE);

        return piezas;
    }

    public void mostrarTablero(){
        for(int i = 7; i >= 0; i--){
            for (int j = 7; j >= 0; j--){
                System.out.print('|');
                System.out.print(' ');
                if(piezas[j][i] != null){
                    piezas[j][i].mostrarPieza();
                } else System.out.print(' ');
                System.out.print(' ');
            }
            System.out.print('|');
            System.out.println("");
            System.out.println("--------------------------------");
        }
        System.out.println("");
        System.out.println("");
    }

    public void moverPieza(Coordenada source, Coordenada dest){
        if(this.piezas[source.getX()][source.getY()] == null) {
            System.out.println("No hay pieza en ese casillero!!");
            return;
        }else if(dest.esValida() == false){
            System.out.println("Movimiento no valido!!");
            return;
        }

        Pieza piezaAMover = this.piezas[source.getX()][source.getY()];
        if(piezaAMover.seMueveAsi(source, dest) == false){
            System.out.println("Movimiento no valido!!");
            return;
        }

        piezas[dest.getX()][dest.getY()] = piezaAMover;
        piezas[source.getX()][source.getY()] = null;
    }
}
