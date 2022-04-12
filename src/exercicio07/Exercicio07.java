package exercicio07;

class Exercicio07 {
    public static void main(String[] args) {
        Veiculo fusca = new Veiculo("Fusca", 4, 50, 5);
        Veiculo bis = new Veiculo("Bis", 2, 20, 30);

        fusca.abastecer(45);
        bis.abastecer(20);

        fusca.printAutonomia();
        bis.printAutonomia();
    }
}