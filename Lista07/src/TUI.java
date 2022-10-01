import java.util.Scanner;
public class TUI {
    private float txtDM, txtdm;
    private Scanner scanner;
    private Losango losango;

    public TUI(){
        this.scanner = new Scanner(System.in);
    }

    public void printTUI(){
        System.out.println("Digite o valor da diagonal Maior: ");
        txtDM = scanner.nextFloat();
        System.out.println("Digite o valor da diagonal Menor: ");
        txtdm = scanner.nextFloat();
        this.losango = new Losango(txtDM,txtdm);
        System.out.println(losango);
    }
}
