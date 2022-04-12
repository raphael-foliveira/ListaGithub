package exercicio05;

class PenaMosquito implements Escrever {
    String ehFeitoDe;
    String escreveCom;

    PenaMosquito() {
        this.ehFeitoDe = "Metal";
        this.escreveCom = "Nanquim";
    }

    @Override
    public void escrever() {
        System.out.printf("Escrevendo com %s.\n", escreveCom);
    }
}