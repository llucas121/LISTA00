import java.util.ArrayList;

public class Elevador {
    private ArrayList<Pessoa> elevador;
    private int andarAtual, totalAndares, capacidadeTotal, capacidadeAtual;
    private double pesoMaximo, pesoAtual;

    public Elevador(){
        this.andarAtual = 0;
        this.totalAndares  = 3;
        this.capacidadeTotal = 7;
        this.capacidadeAtual = 0;
        this.pesoMaximo = 300.0;
        this.pesoAtual = 0;
        this.elevador = new ArrayList<Pessoa>(capacidadeTotal);
    }
    public Elevador(int totalAndares, int capacidadeTotal, double pesoMaximo){
        this.andarAtual = 0;
        this.totalAndares  = totalAndares;
        this.capacidadeTotal = capacidadeTotal;
        this.capacidadeAtual = 0;
        this.pesoMaximo = pesoMaximo;
        this.pesoAtual = 0;
        this.elevador = new ArrayList<Pessoa>(capacidadeTotal);
    }

    public void entra(Pessoa pessoa){
        if(getCapacidadeAtual() <= getCapacidadeTotal()){
            elevador.add(pessoa);
            setCapacidadeAtual(getCapacidadeAtual()+1);
            setPesoAtual(getPesoAtual()+pessoa.getPeso());
        }else{
            System.out.println("Numero de pessoas maximas atingido, nao foi possivel entrar");
        }
    }

    public void sair(int idx){
        if(getCapacidadeAtual() > 0){
            elevador.remove(idx);
            setPesoAtual(getPesoAtual() - elevador.get(idx).getPeso());
            setCapacidadeAtual(getCapacidadeAtual()-1);
        }else{
            System.out.println("Nao a ninguem para remover");
        }
    }

    public void sobe(){
        if(getAndarAtual() < getTotalAndares()){
            if(getPesoAtual() <= getPesoMaximo()){
                setAndarAtual(getAndarAtual()+1);
            }else{
                System.out.println("Nao eh possivel subir! Peso maximo atingido");
            }
        }else{
            System.out.println("Nao eh possivel subir! ultimo andar alcancado");
        }
    }

    public void desce(){
        if(getAndarAtual() > 0){
            if(getPesoAtual() <= getPesoMaximo()){
                setAndarAtual(getAndarAtual()-1);
            }else{
                System.out.println("Nao eh possivel descer! Peso maximo atingido");
            }
        }else{
            System.out.println("Nao eh possivel descer! Tterreo alcancado!");
        }
    }

    public String toString(){
        return "Andar atual: "+getAndarAtual()+" Capacidade atual: "+getCapacidadeAtual()+
        " Andar Maximo: "+getTotalAndares()+" Capacidade total: "+getCapacidadeTotal()+" Peso atual: "+
        getPesoAtual()+" Peso maximo: "+getPesoMaximo();
    }

    //get e set do array
    public ArrayList<Pessoa> getElevador() {
        return elevador;
    }
    public void setElevador(ArrayList<Pessoa> elevador) {
        this.elevador = elevador;
    }
    //get e set do anddar atual
    public int getAndarAtual() {
        return andarAtual;
    }
    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }
    //get e set do total de andares
    public int getTotalAndares() {
        return totalAndares;
    }
    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }
    //get set da capacidade total
    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }
    public void setCapacidadeTotal(int capacidadeTotal) {
        this.capacidadeTotal = capacidadeTotal;
    }
    //get e set da capacidade atual
    public int getCapacidadeAtual() {
        return capacidadeAtual;
    }
    public void setCapacidadeAtual(int capacidadeAtual) {
        this.capacidadeAtual = capacidadeAtual;
    }
    //get e set do peso maximo
    public double getPesoMaximo() {
        return pesoMaximo;
    }
    public void setPesoMaximo(double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }
    //get e set do peso atual
    public double getPesoAtual() {
        return pesoAtual;
    }
    public void setPesoAtual(double pesoAtual) {
        this.pesoAtual = pesoAtual;
    }
}
