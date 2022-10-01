import java.util.Scanner;
public class TUI {
    private float txtPeso;
    private Scanner scanner;
    private Pessoa pessoa;
    private int txtPlaneta;

    public TUI(){
        this.scanner = new Scanner(System.in);
    }

    public void printTUI(){
        System.out.println("Digite seu peso: ");
        setTxtPeso(scanner.nextFloat());
        setPessoa(new Pessoa(txtPeso));
        System.out.println("Escolha um planeta:\t1-Mercurio 2-Venus 3-Marte 4-Jupiter 5-Saturno 6-Urano");
        setTxtPlaneta(scanner.nextInt());
    }

    public void solve(){
        switch(txtPlaneta){
            case 1:System.out.println("Seu novo peso: "+(pessoa.getPeso()/10)*0.37);break;
            case 2:System.out.println("Seu novo peso: "+(pessoa.getPeso()/10)*0.88);break;
            case 3:System.out.println("Seu novo peso: "+(pessoa.getPeso()/10)*0.38);break;
            case 4:System.out.println("Seu novo peso: "+(pessoa.getPeso()/10)*2.64);break;
            case 5:System.out.println("Seu novo peso: "+(pessoa.getPeso()/10)*1.15);break;
            case 6:System.out.println("Seu novo peso: "+(pessoa.getPeso()/10)*1.17);break;
            default:System.out.println("ERROR!\tPor favor digite um dos planetas listados"+(pessoa.getPeso()/10)*1.17);break;
        }
    }

    public void tui(){
        printTUI();
        solve();
    }

    public void setPessoa(Pessoa pessoa){
        this.pessoa = pessoa;
    }
    public Pessoa Pessoa(){
        return pessoa;
    }

    public void setTxtPeso(float x){
        this.txtPeso = x;
    }
    public float getTxtPeso(){
        return txtPeso;
    }
    public void setTxtPlaneta(int x){
        this.txtPlaneta = x;
    }
    public int getTxtPlaneta(){
        return txtPlaneta;
    }
}
