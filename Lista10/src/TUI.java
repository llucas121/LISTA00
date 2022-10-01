import java.util.Scanner;
public class TUI {
    private int txtEscolha;
    private Scanner scanner;
    private Escolha escolhaUser, EscolhaMaq;

    public TUI(){
        this.scanner = new Scanner(System.in);
    }

    public void printTUI(){
        System.out.println("Pedra-0 Papel-1 Tesoura-2: ");
        txtEscolha = scanner.nextInt();
        this.escolhaUser = new Escolha(txtEscolha);
        this.EscolhaMaq = new Escolha();
    }

    public void solve(){
        if(escolhaUser.getEscolha() == 0){
            if(EscolhaMaq.getEscolha() == 0){
                System.out.println("\nEmpate!");
            }else if(EscolhaMaq.getEscolha() == 1){
                System.out.println("\nVoce perdeu!");
            }else{
                System.out.println("\nVoce ganhou!!!");
            }
        }else if(escolhaUser.getEscolha() == 1){
            if(EscolhaMaq.getEscolha() == 0){
                System.out.println("\nVoce ganhou!!!");
            }else if(EscolhaMaq.getEscolha() == 1){
                System.out.println("\nEmpate!");
            }else{
                System.out.println("\nVoce perdeu!");
            }
        }else{
            if(EscolhaMaq.getEscolha() == 0){
                System.out.println("\nVoce perdeu");
            }else if(EscolhaMaq.getEscolha() == 1){
                System.out.println("\nVoce ganhou!!!");
            }else{
                System.out.println("\nEmpate!");
            }
        }
    }

    public void printResults(){
        System.out.println("Sua escolha: "+escolhaUser+"\tEscolha da maquina: "+EscolhaMaq);
    }

    public void tui(){
        printTUI();
        solve();
        printResults();
    }
}
