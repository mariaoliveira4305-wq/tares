public class RegistroBemEstar {

    private Pessoa pessoa;
    private String humor;
    private String observacao;

    public RegistroBemEstar(Pessoa pessoa, String humor, String observacao) {
        this.pessoa = pessoa;
        this.humor = humor;
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return pessoa.exibirInformacoes() +
                "\nHumor: " + humor +
                "\nObservação: " + observacao +
                "\n-------------------------";
    }
}