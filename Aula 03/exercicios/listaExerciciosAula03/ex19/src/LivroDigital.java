// 19 - Defina uma classe LivroDigital com atributos como titulo, autor, e tamanhoArquivo. Adicione métodos para abrir e fechar o livro.
public class LivroDigital {
    private String titulo;
    private String autor;
    private double tamanhoArquivo;

    public LivroDigital(String titulo, String autor, double tamanhoArquivo) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTitulo(String titulo) {
        if(titulo != null && !titulo.trim().isEmpty()){
            this.titulo = titulo;
            System.out.println("Título do livro alterado para: " + titulo);
        }else {
            System.out.println("Nome inválido.");
        }
    }
    public void setAutor(String autor) {
        if(autor!= null &&!autor.trim().isEmpty()){
            this.autor = autor;
            System.out.println("Autor do livro alterado para: " + autor);
        } else {
            System.out.println("Nome inválido.");
        }
    }
    public void setTamanho(double tamanho){
        if(tamanho <= 0){
            System.out.println("Tamanho inválido.");
        } else {
            this.tamanhoArquivo = tamanho;
            System.out.println("Tamanho do livro alterado para: " + tamanhoArquivo + " KB.");
        }
    }

    public int abrirLivro(int status) {
        if (status == 0) {
            System.out.println("Você abriu o livro " + titulo + " .");
            status = 1;
        } else {
            System.out.println("Livro já está aberto!");
        }
        return status;
    }

    public int fecharLivro(int status){
        if (status == 0) {
            System.out.println("Você fechou o livro " + titulo + ".");
            status = 1;
        } else {
            System.out.println("Livro já está fechado!");
        }
        return status;
    }

}