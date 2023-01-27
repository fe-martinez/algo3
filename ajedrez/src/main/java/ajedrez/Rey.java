package ajedrez;

public class Rey extends Pieza implements PiezaInt {

	public Rey(int x, int y, boolean esBlanca) {
		super(x, y, esBlanca);
		// TODO Auto-generated constructor stub
	}

	public void mover(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	public void mostrar() {
		if(esBlanca) {
			System.out.print('K');
		} else {
			System.out.print('k');
		}
	}

}
