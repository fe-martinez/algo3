package ajedrez;

public class Torre extends Pieza implements PiezaInt{
	
	public Torre(int x, int y, boolean esBlanca) {
		super(x, y, esBlanca);
	}

	public void mover(int i, int j) {
		if(i == this.x) {
			this.y = j;
		} else if(j == this.y) {
			this.x = i;
		}
	}

	public void mostrar() {
		if(esBlanca) {
			System.out.print('R');
		} else {
			System.out.print('r');
		}
		
	}
}