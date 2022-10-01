public class Prova {
    private float nota;

    public Prova(){
        super();
        this.nota = 5;
    }

    public Prova(float x){
        super();
        this.nota = x;
    }

    @Override
    public String toString(){
        return ""+this.nota;
    }

    public float getNota(){
        return this.nota;
    }
    public void setNota(float x){
        this.nota = x;
    }
}
