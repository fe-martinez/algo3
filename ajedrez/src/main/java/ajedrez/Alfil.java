package ajedrez;

public class Alfil extends Pieza implements PiezaInt {
	public Alfil(int x, int y, boolean esBlanca) {
		super(x, y, esBlanca);
		// TODO Auto-generated constructor stub
	}

	public void mover(int i, int j) {
		if(Math.abs(this.x - i) == Math.abs(this.y - j)) {
			this.x = i;
			this.y = j;
		}

	}

	public void mostrar() {
		if(esBlanca) {
			System.out.print('B');
		} else {
			System.out.print('b');
		}

	}

}
