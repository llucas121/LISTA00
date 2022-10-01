public class App {
    public static void main(String[] args) throws Exception {
        Elevador e =  new Elevador(2, 3, 300.0);
        System.out.println(e);
        e.entra(new Pessoa(70));
        System.out.println(e);
        e.sobe();
        e.entra(new Pessoa(85));
        System.out.println(e);
        e.sair(0);
        System.out.println(e);
        e.desce();
        System.out.println(e);
    }
}