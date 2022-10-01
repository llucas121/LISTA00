public class Triangulo {
    private float l1,l2,l3;

    public Triangulo(){
        this.l1 = 2;
        this.l2 = 2;
        this.l3 = 2;
    }

    public Triangulo(float l1, float l2, float l3){
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    @Override
    public String toString(){
        return "Lado 1: "+getL1()+" Lado 2: "+getL2()+" Lado 3: "+getL3();
    }

    public float getL1(){
        return this.l1;
    }
    public void setL1(float l1){
        this.l1 = l1;
    }

    public float getL2(){
        return this.l2;
    }
    public void setL2(float l2){
        this.l2 = l2;
    }

    public float getL3(){
        return this.l3;
    }
    public void setL3(float l3){
        this.l3 = l3;
    }
}
