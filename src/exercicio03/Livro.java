package exercicio03;

class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;

    Livro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public String getTitulo() {
        return titulo;
    }
}