import java.util.Scanner;
/** Terminal User Interface */
public class TUI {
    private String txtNome;
    private int txtIdade;
    private Scanner scanner;

    Pessoa pessoa;
    Calcular_dias cd;
    private int totalDias;

    public TUI(){
        this.scanner = new Scanner(System.in);
        this.pessoa = new Pessoa();
        this.cd = new Calcular_dias();
        this.totalDias = 0;
    }

    public void printTUI(){
        System.out.println("\nDigite o nome da pessoa: ");
        this.txtNome = scanner.nextLine();
        System.out.println("\nDigite a idade da pessoa: ");
        this.txtIdade = scanner.nextInt();
    }

    public void Solve(){
        pessoa.setNome(txtNome);
        pessoa.setIdade(txtIdade);
        totalDias = cd.TotalDias(pessoa);
    }

    public void printResults(){
        System.out.println(pessoa.getNome() + ", voce ja viveu: "+ this.totalDias + " dias!\n");
    }

    public void tui(){
        printTUI();
        Solve();
        printResults();
    }
}
