import java.util.Scanner;

public class TUI {
    private Ponto2D p1, p2;
    private double txtXCoord, txtYCoord;
    private Scanner scanner;
    private double distanciaEntrePontos;


    public TUI(){
        setScanner (new Scanner(System.in));
    }

    private void printTUI(){
        System.out.println("\nDigite a coordenada X do ponto 1: ");
        setTxtXCoord(scanner.nextDouble());
        System.out.println("\nDigite a coordenada Y do ponto 1: ");
        setTxtYCoord(scanner.nextDouble());
        setP1(new Ponto2D(getTxtXCoord(), getTxtYCoord()));

        System.out.println("\nDigite a coordenada X do ponto 2: ");
        setTxtXCoord(scanner.nextDouble());
        System.out.println("\nDigite a coordenada Y do ponto 2: ");
        setTxtYCoord(scanner.nextDouble());
        setP2(new Ponto2D(getTxtXCoord(), getTxtYCoord()));
    }

    private void solve(){
        setDistanciaEntrePontos(GeometryUtils.distanciaEntrePontos(p1,p2));
    }

    private void printResults(){
        System.out.println("Considerando o ponto p1 " + p1);
        System.out.println("e o ponto p2 " + p2);
        System.out.println("A distancia entre eles é: "+ getDistanciaEntrePontos());
    }

    public void tui(){
        printTUI();
        solve();
        printResults();
    }

    public double getTxtXCoord() {
        return txtXCoord;
    }

    public void setTxtXCoord(double txtXCoord) {
        this.txtXCoord = txtXCoord;
    }

    public double getTxtYCoord() {
        return txtYCoord;
    }

    public void setTxtYCoord(double txtYCoord) {
        this.txtYCoord = txtYCoord;
    }

    public Ponto2D getP1() {
        return p1;
    }

    public void setP1(Ponto2D p1) {
        this.p1 = p1;
    }

    public Ponto2D getP2() {
        return p2;
    }

    public void setP2(Ponto2D p2) {
        this.p2 = p2;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public double getDistanciaEntrePontos() {
        return distanciaEntrePontos;
    }

    public void setDistanciaEntrePontos(double distanciaEntrePontos) {
        this.distanciaEntrePontos = distanciaEntrePontos;
    }
}