package ajedrez;

public class Dama extends Pieza implements PiezaInt{

	public Dama(int x, int y, boolean esBlanca) {
		super(x, y, esBlanca);
		// TODO Auto-generated constructor stub
	}

	public void mover(int i, int j) {
		if(Math.abs(this.x - i) == Math.abs(this.y - j)) {
			this.x = i;
			this.y = j;
		} else if(i == this.x) {
			this.y = j;
		} else if(j == this.y) {
			this.x = i;
		}
	}

	public void mostrar() {
		if(esBlanca) {
			System.out.print('Q');
		} else {
			System.out.print('q');
		}		
	}

}
