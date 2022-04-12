package exercicio04;

class Cliente extends Pessoa {

    private String cpf;

    public Cliente(String nome, int idade, String cidadeDeNascimento, String cpf) {
        super(nome, idade, cidadeDeNascimento);
        this.cpf = cpf;
    }

    @Override
    void exibirDados() {
        super.exibirDados();
        System.out.println(cpf);
    }
}