public class Pessoa {
    private float peso;

    public Pessoa(){
        super();
        this.peso = 70;
    }

    public Pessoa(float x){
        super();
        this.peso = x;
    }

    @Override
    public String toString(){
        return ""+this.peso;
    }

    public float getPeso(){
        return this.peso;
    }
    public void setPeso(float x){
        this.peso = x;
    }
}
