package exercicio02;

class Triangulo {
    double base;
    double altura;

    Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularArea() {
        return (base * altura) / 2;
    }
}