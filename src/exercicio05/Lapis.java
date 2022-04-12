package exercicio05;

class Lapis implements Escrever {
    String ehFeitoDe;
    String escreveCom;

    Lapis() {
        this.ehFeitoDe = "Madeira";
        this.escreveCom = "Grafite";
    }

    @Override
    public void escrever() {
        System.out.printf("Escrevendo com %s.\n", escreveCom);
    }
}