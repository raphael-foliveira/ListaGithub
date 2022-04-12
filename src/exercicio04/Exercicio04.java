package exercicio04;

class Exercicio04 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Pessoa", 30, "Salvador");
        Cliente cliente = new Cliente("Cliente", 25, "Feira de Santana", "0293485093845");
        Funcionario funcionario = new Funcionario("Funcionario", 40, "Ilhéus", "98427598347589");

        pessoa.exibirDados();
        cliente.exibirDados();
        funcionario.exibirDados();
    }
}