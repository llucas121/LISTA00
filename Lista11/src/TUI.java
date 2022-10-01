import java.util.Scanner;
public class TUI {
    private float txtNota;
    private Scanner scanner;
    private Prova p1, p2, p3;;

    public TUI(){
        this.scanner = new Scanner(System.in);
    }

    public void printTUI(){
        System.out.println("Digite a primeira nota");
        txtNota = scanner.nextFloat();
        setP1(new Prova(txtNota));
        System.out.println("Digite a segunda nota");
        txtNota = scanner.nextFloat();
        setP2(new Prova(txtNota));
    }

    public void solve(){
        if(((p1.getNota()+p2.getNota())/2 >= 5) && (p1.getNota() > 3 && p2.getNota() > 3)){
            System.out.println("Aprovado!!!\tNota 1: "+p1+" Nota 2: "+p2+" Media: "+(p1.getNota()+p2.getNota())/2);
        }else{
            System.out.println("Digite o valor da terceira nota: ");
            txtNota = scanner.nextFloat();
            setP3(new Prova(txtNota));
            if(p1.getNota() > p2.getNota()){
                if(((p1.getNota()+p3.getNota())/2 > 5) && (p1.getNota() > 3 && p3.getNota() > 3)){
                    System.out.println("Aprovado!!!\tNota 1: "+p1+" Nota 2: "+p3+" Media: "+(p1.getNota()+p3.getNota())/2);
                }else{
                    System.out.println("Reprovado!!!\tNota 1: "+p1+" Nota 2: "+p3+" Media: "+(p1.getNota()+p3.getNota())/2);
                }
            }else{
                if(((p2.getNota()+p3.getNota())/2 > 5) && (p2.getNota() > 3 && p3.getNota() > 3)){
                    System.out.println("Aprovado!!!\tNota 1: "+p2+" Nota 2: "+p3+" Media: "+(p2.getNota()+p3.getNota())/2);
                }else{
                    System.out.println("Reprovado!!!\tNota 1: "+p2+" Nota 2: "+p3+" Media: "+(p2.getNota()+p3.getNota())/2);
                }
            }
        }
    }

    public void tui(){
        printTUI();
        solve();
    }

    public void setP1(Prova nota){
        this.p1 = nota;
    }
    public Prova P1(){
        return p1;
    }

    public void setP2(Prova nota){
        this.p2 = nota;
    }
    public Prova P2(){
        return p2;
    }
    public void setP3(Prova nota){
        this.p3 = nota;
    }
    public Prova P3(){
        return p3;
    }
}
