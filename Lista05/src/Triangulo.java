public class Triangulo {
    private float cateto1, cateto2, hipotenusa;

    public Triangulo(){
        this.cateto1 = 2;
        this.cateto2 = 2;
        setHipotenusa(this.cateto1, this.cateto2);
    }

    public Triangulo(float cateto1, float cateto2){
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
        setHipotenusa(this.cateto1, this.cateto2);
    }

    public float getCateto1(){
        return this.cateto1;
    }
    public void setCateto1(float cateto1){
        this.cateto1 = cateto1;
    }

    public float getCateto2(){
        return this.cateto2;
    }
    public void setCateto2(float cateto2){
        this.cateto2 = cateto2;
    }

    public float getHipotenusa(){
        return this.hipotenusa;
    }
    public void setHipotenusa(float cateto1, float cateto2){
        this.hipotenusa = (cateto1*cateto1)+(cateto2*cateto2);
    }
}
