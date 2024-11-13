// 19 - Defina uma classe LivroDigital com atributos como titulo, autor, e tamanhoArquivo. Adicione métodos para abrir e fechar o livro.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        LivroDigital livro = new LivroDigital("O Senhor dos Anéis - As Duas Torres", "J. K. Rowling", 58423);
        Scanner sc = new Scanner(System.in);
        int statusA = 0;
        int statusB = 0;
        while (true) {
            System.out.println("\nLivro: " + livro.getTitulo() + "\nAutor: " + livro.getAutor()
                    + "\nTamanho do arquivo: " + livro.getTamanhoArquivo() + " KB\n\n");
            System.out.println(
                    "O que deseja fazer ?\n1 - Abrir livro\n2 - Fechar livro\n3 - Alterar nome do livro\n4 - Alterar nome do autor\n5 - Editar tamanho do arquivo\n6 - Sair");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    statusA = livro.abrirLivro(statusA);
                    statusB = 0;
                    break;
                case 2:
                    statusB = livro.fecharLivro(statusB);
                    statusA = 0;
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Novo nome do livro: ");
                    String novoTitulo = sc.nextLine();
                    livro.setTitulo(novoTitulo);
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("Novo nome do autor: ");
                    String novoAutor = sc.nextLine();
                    livro.setAutor(novoAutor);
                    break;
                case 5:
                    while (true) {
                        sc.nextLine();
                        System.out.println("Novo tamanho do arquivo (KB): ");
                        double novoTamanho;
                        if (sc.hasNextDouble()) {
                            novoTamanho = sc.nextDouble();
                            livro.setTamanho(novoTamanho);
                            break;
                        } else {
                            System.out.println("Tamanho inválido!\n");
                        }
                    }
                    break;
                case 6:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Escolha inválida!\n");
                    break;
            }
        }
    }
}