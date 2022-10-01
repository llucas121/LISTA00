import java.util.Scanner;
public class TUI {
    private float txtCateto1, txtCateto2;
    private Scanner scanner;
    private Triangulo triangulo;

    public TUI(){
        this.scanner = new Scanner(System.in);
    }

    public void printTUI(){
        System.out.println("Digite o valor do primeiro cateto: ");
        txtCateto1 = scanner.nextFloat();
        System.out.println("Digite o valor do segundo cateto: ");
        txtCateto2 = scanner.nextFloat();
        this.triangulo = new Triangulo(txtCateto1, txtCateto2);
        System.out.println("Triangulo:\nCateto a: "+triangulo.getCateto1()+" Cateto b: "+triangulo.getCateto2()+" Hipotenusa: "+triangulo.getHipotenusa());
    }
}
