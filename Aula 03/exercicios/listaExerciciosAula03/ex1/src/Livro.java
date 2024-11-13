public class Livro {
    // Encapsulando os atributos
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int paginaAtual = 0;

    public Livro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }
    // Métodos de acesso (getters)
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }
    public int getPaginaAtual() {
        return paginaAtual;
    }
    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.trim().isEmpty()) {
            this.titulo = titulo;
        } else {
            System.out.println("Título inválido.");
        }
    }
    public void setAutor(String autor) {
        if (autor != null && !autor.trim().isEmpty()) {
            this.autor = autor;
        } else {
            System.out.println("Autor inválido.");
        }
    }
    public void setNumeroDePaginas(int numeroDePaginas) {
        if (numeroDePaginas > 0) {
            this.numeroDePaginas = numeroDePaginas;
        } else {
            System.out.println("Número de páginas inválido.");
        }
    }

    public void setPaginaAtual(int paginaAtual) {
        if (paginaAtual >= 0 && paginaAtual <= numeroDePaginas) {
            this.paginaAtual = paginaAtual;
        } else {
            System.out.println("Número inválido.");
        }
    }
    public void abrirLivro() {
        System.out.println("O livro \"" + titulo + "\" foi aberto.");
    }

    public void lerPagina() {
        if (paginaAtual < numeroDePaginas) {
            paginaAtual++;
            System.out.println("Lendo a página " + paginaAtual + " de " + numeroDePaginas + ".");
        } else {
            System.out.println("Você já leu todas as páginas.");
        }
    }
}