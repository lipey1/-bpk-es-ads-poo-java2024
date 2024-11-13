
// 1 - Crie uma classe chamada Livro com atributos como titulo, autor, e numeroDePaginas. Adicione métodos para abrir o livro e ler uma página.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criação do objeto Livro utilizando o construtor
        Livro meuLivro = new Livro("O Hobbit", "J.R.R. Tolkien", 310);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nNome do livro: " + meuLivro.getTitulo() +
                    "\nAutor: " + meuLivro.getAutor() +
                    "\nNúmero de páginas: " + meuLivro.getNumeroDePaginas() +
                    "\nPágina atual: " + meuLivro.getPaginaAtual() + "\n");

            System.out.println(
                    "O que deseja fazer ?\n1 - Abrir o livro\n2 - Ler uma página\n3 - Alterar autor\n4 - Alterar título\n5 - Alterar número de páginas\n6 - Sair");
            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    meuLivro.abrirLivro();
                    break;
                case 2:
                    meuLivro.lerPagina();
                    break;
                case 3:
                    System.out.println("Qual será o nome do novo autor ?");
                    String novoAutor = sc.next();
                    meuLivro.setAutor(novoAutor);
                    break;
                case 4:
                    System.out.println("Qual será o novo título?");
                    String novoTitulo = sc.next();
                    meuLivro.setTitulo(novoTitulo);
                    break;

                case 5:
                    boolean entradaValida = false;
                    while (!entradaValida) {
                        System.out.println("Qual será o número de páginas ?");
                        if (sc.hasNextInt()) {
                            int numpag = sc.nextInt();
                            sc.nextLine(); 
                            entradaValida = true;
                            meuLivro.setNumeroDePaginas(numpag);
                        } else {
                            System.out.println("Entrada inválida!");
                            sc.nextLine();
                        }
                    }
                    break;

                case 6:
                    sc.close();
                    System.out.println("Saindo...");
                    System.exit(0);
                default:
                    System.out.println("Escolha inválida!\n");
                    break;
            }
        }
    }
}
