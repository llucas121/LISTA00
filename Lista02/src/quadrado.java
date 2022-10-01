public class quadrado{
    private float lado, altura, area;

    public float getLado(){
        return lado;
    }

    public void setLado(float lado){
        this.lado = lado;
    }

    public float getAltura(){
        return altura;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public float getArea(){
        return area;
    }

    public void setArea(float lado, float altura){
        this.area = this.lado*this.altura;
    }

    public quadrado(){
        this.lado = 2;
        this.altura = 2;
        this.area = altura*lado;
    }

    public quadrado(float lado, float altura){
        this.lado = lado;
        this.altura = altura;
        this.area = altura*lado;
    }
}