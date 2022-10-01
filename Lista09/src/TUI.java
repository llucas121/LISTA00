import java.util.Scanner;
public class TUI {
    private float txtL1, txtL2, txtL3;
    private Scanner scanner;
    private Triangulo triangulo;
    private Checker checker;

    public TUI(){
        this.scanner = new Scanner(System.in);
        this.checker = new Checker();
    }

    public void printTUI(){
        System.out.println("Digite o valor do lado 1: ");
        txtL1 = scanner.nextFloat();
        System.out.println("Digite o valor do lado 2: ");
        txtL2 = scanner.nextFloat();
        System.out.println("Digite o valor do lado 3: ");
        txtL3 = scanner.nextFloat();
        this.triangulo = new Triangulo(txtL1, txtL2, txtL3);
        System.out.println(triangulo);
        checker.CheckerTriangulo(triangulo);
    }
}
