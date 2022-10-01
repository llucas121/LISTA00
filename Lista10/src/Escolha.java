public class Escolha {
    private int escolha;

    public static int RandInt(int min, int max){
        java.util.Random rand = new java.util.Random();
        int randomNum = rand.nextInt((max-min)+1)+min;
        return randomNum;
    }

    public Escolha(){
        this.escolha = RandInt(0,2);
    }

    public Escolha(int x){
        this.escolha = x;
    }

    @Override
    public String toString(){
        if(getEscolha() == 0){
            return "Pedra!";
        }else if(getEscolha() == 1){
            return "Papel!";
        }else{
            return "Tesoura";
        }
    }

    public int getEscolha(){
        return this.escolha;
    }
    public void setEscolha(int x){
        this.escolha = x;
    }
}
