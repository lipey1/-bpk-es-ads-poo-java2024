public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Marcão do grau", "A lenda do homi das carça erguida");

        livro.adicionarPagina(1, "Era uma vez um homem.");
        livro.adicionarPagina(2, "Um homem com as carça erguida.");
        livro.adicionarPagina(3, "Os locais tinham medo dele.");
        livro.adicionarPagina(4, "Pois havia uma lenda.");
        livro.adicionarPagina(5, "A lenda do homi das carça erguida.");
        livro.adicionarPagina(6, "Fim. ?");

        System.out.println("Título do livro: " + livro.getTitulo() + "\nAutor: " + livro.getAutor());
        livro.exibirPaginas();
    }
}
