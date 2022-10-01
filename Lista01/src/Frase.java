public class Frase{
    private String fraseAntiga, fraseNova;

    public Frase(){
        this.fraseAntiga  = "Hello World!";
    }

    public Frase(String frase){
        this.fraseAntiga = frase;
    }

    public String ReplaceFrase(String palavra1, String palavra2){
        return this.fraseAntiga.replace(palavra1, palavra2);
    }

    public String getFraseAntiga(){
        return fraseAntiga;
    }

    public void setFraseAntiga(String frase){
        this.fraseAntiga = frase;
    }

    public String getFraseNova(){
        return fraseNova;
    }

    public void setFraseNova(String frase){
        this.fraseNova = frase;
    }
}