public class Losango {
    private float diagonalMaior, diagonalMenor, area;

    public Losango(){
        this.diagonalMaior = 4;
        this.diagonalMenor = 2;
        setArea(this.diagonalMaior, this.diagonalMenor);
    }

    public Losango(float DM, float dm){
        this.diagonalMaior = DM;
        this.diagonalMenor = dm;
        setArea(this.diagonalMaior, this.diagonalMenor);
    }

    @Override
    public String toString(){
        return "Diagonal maior: "+getDiagonalMaior()+" Diagonal menor: "+getDiagonalMenor()+" Area: "+getArea();
    }

    public float getDiagonalMaior(){
        return this.diagonalMaior;
    }
    public void setDiagonalMaior(float DM){
        this.diagonalMaior = DM;
    }

    public float getDiagonalMenor(){
        return this.diagonalMenor;
    }
    public void setDiagonalMenor(float dm){
        this.diagonalMenor = dm;
    }

    public float getArea(){
        return this.area;
    }
    public void setArea(float DM, float dm){
        this.area = (DM*dm)/2;
    }
}
