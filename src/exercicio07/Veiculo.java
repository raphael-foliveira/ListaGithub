package exercicio07;

class Veiculo {
    String nome;
    int numeroDeRodas;
    int capacidadeDoTanque;
    int combustivelNoTanque;
    double consumo;

    Veiculo(String nome, int numeroDeRodas, int capacidadeDoTanque, double consumo) {
        this.nome = nome;
        this.numeroDeRodas = numeroDeRodas;
        this.capacidadeDoTanque = capacidadeDoTanque;
        this.combustivelNoTanque = 0;
        this.consumo = consumo;
    }

    void abastecer(int litros) {
        if (combustivelNoTanque + litros > capacidadeDoTanque) {
            int excesso = combustivelNoTanque + litros - capacidadeDoTanque;
            System.out.printf("Completando o tanque... (sobram %d litros)\n", excesso);
            combustivelNoTanque = capacidadeDoTanque;
        } else {
            System.out.printf("Adicionando %d litros ao tanque...\n");
            combustivelNoTanque += litros;
        }
    }

    void printAutonomia() {
        System.out.printf("Autonomia: %.1fKm.\n", calcularAutonomia());
    }

    double calcularAutonomia() {
        double autonomia = combustivelNoTanque * consumo;
        return autonomia;
    }
}