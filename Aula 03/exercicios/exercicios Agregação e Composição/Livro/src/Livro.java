import java.util.ArrayList;

public class Livro {
    private String titulo;
    private String autor;
    private ArrayList<Pagina> paginas;

    public Livro(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = new ArrayList<>();
    }
    public void adicionarPagina(int numero, String conteudo){
        Pagina pg = new Pagina(numero, conteudo);
        this.paginas.add(pg);
    }

    public void exibirPaginas(){
        if(this.paginas == null || this.paginas.isEmpty()){
            System.out.println("Não há nada ainda!");
        } else {
            for (Pagina pg : paginas){
                System.out.println("Página " + pg.getNumero() + ": " + pg.getConteudo());
            }
        }
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }
}
