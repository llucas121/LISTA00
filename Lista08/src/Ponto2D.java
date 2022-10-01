
public class Ponto2D {
    private double x;
    private double y;

    public Ponto2D(){
        super();
    }
    public Ponto2D(double x, double y){
        super();
        setX(x);
        setY(y);
    }

    @Override
    public String toString(){
        return "Ponto [x= " + x + " ,y= "+ y + "]";
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
