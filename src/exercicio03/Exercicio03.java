package exercicio03;

class Exercicio03 {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Livro1", "Autor1", 100);
        Livro livro2 = new Livro("Livro2", "Autor2", 200);
        Livro livro3 = new Livro("Livro3", "Autor3", 300);
        livro1.getAutor();
        livro2.getAutor();
        livro3.getAutor();
    }

}