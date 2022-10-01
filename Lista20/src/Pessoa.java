public class Pessoa {
    private static int contadorID = 0;
    private int ID;
    private double peso;

    public Pessoa(){
        this.peso = 70.0;
        ID = geraId();
    }
    public Pessoa(double peso){
        this.peso = peso;
        ID = geraId();
    }

    public double getID() {
        return ID;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    private int geraId(){
        contadorID += 1;
        return contadorID;
    }

}
