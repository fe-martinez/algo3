package algo3;

public class Coordenada {
    private int x;
    private int y;

    public Coordenada(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean esValida(){
        if(this.x < 0 || this.x > 7){
            return  false;
        }
        if(this.y < 0 || this.y > 7){
            return false;
        }
        return true;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
