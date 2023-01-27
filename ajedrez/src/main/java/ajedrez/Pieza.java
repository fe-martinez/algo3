package ajedrez;

public abstract class Pieza {
	public int x;
	public int y;
	public boolean esBlanca;
	
	public Pieza(int x, int y, boolean esBlanca) {
		this.x = x;
		this.y = y;
		this.esBlanca = esBlanca;
	}
	
	
}
