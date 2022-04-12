package exercicio02;

class Exercicio02 {
    public static void main(String[] args) {
        Triangulo tr1 = new Triangulo(10, 15);
        Triangulo tr2 = new Triangulo(8, 10);
        Triangulo tr3 = new Triangulo(50, 15);

        System.out.println(tr1.calcularArea());
        System.out.println(tr2.calcularArea());
        System.out.println(tr3.calcularArea());
    }
}