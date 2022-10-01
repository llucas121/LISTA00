import java.util.Scanner;
public class TUI {
    private int txtQuantidadeDeCavalos;
    private Cavalos cavalos;
    private Scanner scanner;
    private CalculadorDeFerraduras calculadorDeFerraduras;

    public TUI(){
        this.scanner = new Scanner(System.in);
        this.cavalos = new Cavalos();
        this.calculadorDeFerraduras = new CalculadorDeFerraduras();
    }

    public void printTUI(){
        System.out.println("Digite a quantidade de Cavalos: ");
        txtQuantidadeDeCavalos = scanner.nextInt();
        System.out.println("Serao necessarias: "+calculadorDeFerraduras.QuantidadeFerraduras(txtQuantidadeDeCavalos, cavalos)+" ferraduras");
    }
}
