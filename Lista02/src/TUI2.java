import java.util.Scanner;
public class TUI2 {
    private Scanner scanner;
    private quadrado quadra;
    private float txtBase, txtAltura;

    public TUI2(){
        this.scanner = new Scanner(System.in);
    }

    public void printTUI(){
        System.out.println("Digite valor da base do quadrado: ");
        txtBase = scanner.nextFloat();
        System.out.println("Digite valor da altura do quadrado: ");
        txtAltura = scanner.nextFloat();
        quadra = new quadrado(txtBase, txtAltura);
        System.out.println("Quadrado:\nBase: "+quadra.getLado()+" Altura: "+quadra.getAltura()+" Area: "+quadra.getArea());
    }
}
