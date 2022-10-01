public class Calcular_dias {
    private Pessoa pessoa;
    private final int DIAS_EM_UM_ANO = 365;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public int TotalDias(Pessoa pessoa){
        return DIAS_EM_UM_ANO * pessoa.getIdade();
    }
}
