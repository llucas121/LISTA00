import java.util.Scanner;
public class TUI {
    private Scanner scanner;
    private String txtFrase, txtPalavraAntiga, txtPalavraNova;
    private Frase frase;

    public TUI(){
        this.scanner = new Scanner(System.in);
    }

    public void printTUI(){
        System.out.println("Digite uma frase: ");
        this.txtFrase = scanner.nextLine();
        System.out.println("Escolha uma palavra desta frase: ");
        this.txtPalavraAntiga = scanner.nextLine();
        System.out.println("Digite a palavra nova para substituir a palavra anterior: ");
        this.txtPalavraNova = scanner.nextLine();
        this.frase = new Frase(txtFrase);
        frase.setFraseAntiga(txtFrase);
        frase.setFraseNova(frase.ReplaceFrase(txtPalavraAntiga, txtPalavraNova));
        System.out.println("Frase antiga: "+frase.getFraseAntiga()+"\nFrase Nova: "+frase.getFraseNova());
    }
}
