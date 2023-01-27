package algo3;

public class Main {
    public static void main(String[] args) {
        Tablero tablero = new Tablero();
        tablero.mostrarTablero();
        //El sistema de coordenadas necesita ""pulir""
        tablero.moverPieza(new Coordenada(2,0), new Coordenada(5, 3));
        tablero.mostrarTablero();
        tablero.moverPieza(new Coordenada(3,1), new Coordenada(3, 2));
        tablero.mostrarTablero();
    }
}