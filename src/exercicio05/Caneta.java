package exercicio05;

class Caneta implements Escrever {
    String ehFeitoDe;
    String escreveCom;

    Caneta() {
        this.ehFeitoDe = "Plástico";
        this.escreveCom = "Tinta";
    }

    @Override
    public void escrever() {
        System.out.printf("Escrevendo com %s.\n", escreveCom);
    }

}