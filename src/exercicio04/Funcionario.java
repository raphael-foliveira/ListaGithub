package exercicio04;

class Funcionario extends Pessoa {

    private String numeroDeMatricula;

    public Funcionario(String nome, int idade, String cidadeDeNascimento, String numeroDeMatricula) {
        super(nome, idade, cidadeDeNascimento);
        this.numeroDeMatricula = numeroDeMatricula;
    }

    @Override
    void exibirDados() {
        super.exibirDados();
        System.out.println(numeroDeMatricula);
    }

}