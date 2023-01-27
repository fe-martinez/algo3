package ajedrez;

public class Peon extends Pieza implements PiezaInt{
	
	public Peon(int x, int y, boolean esBlanca) {
		super(x, y, esBlanca);
	}

	public void mover(int i, int j) {
		if(esBlanca) {
			if(i == this.x && j == this.y + 1) {
				this.y = j;
			}
		} else {
			if(i == this.x && j == this.y - 1) {
				this.y = j;
			}
		}
	}

	public void mostrar() {
		if(esBlanca) {
			System.out.print('A');
		} else {
			System.out.print('a');
		}
		
	}
}
