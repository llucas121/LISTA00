import java.util.Scanner;
public class TUI {
    private float txtvalor;
    private Scanner scanner;
    private Salario salarioMinimo, salarioFunc;

    public TUI(){
        this.scanner = new Scanner(System.in);
        this.salarioMinimo = new Salario();
    }

    public void printTUI(){
        System.out.println("Digite o valor do seu Salario ");
        txtvalor = scanner.nextFloat();
        this.salarioFunc = new Salario(txtvalor);
        System.out.println("Voce possui: "+salarioFunc.getValor()/salarioMinimo.getValor()+" sslarios minimos!");
    }
}
