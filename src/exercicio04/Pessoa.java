package exercicio04;

class Pessoa {
    private String nome;
    private int idade;
    private String cidadeDeNascimento;

    public Pessoa(String nome, int idade, String cidadeDeNascimento) {
        this.nome = nome;
        this.idade = idade;
        this.cidadeDeNascimento = cidadeDeNascimento;
    }

    void exibirDados() {
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(cidadeDeNascimento);
    }
}
