// 14 - Crie uma classe Jogo com atributos nome, genero, e preco. Adicione métodos para iniciar e pausar o jogo.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Jogo jogo = new Jogo("Red Dead Redemption 2", "Aventura/Ação", 119.99);
        Scanner sc = new Scanner(System.in);

        int statusInicio = 0;
        int statusPause = 0;
        while (true) {
            System.out.println("\nJogo: " + jogo.getNome() + "\nGênero: " + jogo.getGenero() + "\nPreço: R$" + jogo.getPreco());
            System.out.println("");
            System.out.println(
                    "O que você deseja fazer ?\n1 - Iniciar o jogo\n2 - Pausar/Despausar o jogo\n3 - Alterar nome do jogo\n4 - Alterar gênero\n5 - Alterar preço\n6 - Sair");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    statusInicio = jogo.iniciarJogo(statusInicio);
                    break;
                case 2:
                    if (statusInicio == 0) {
                        System.out.println("Você precisa iniciar o jogo primeiro!");
                        break;
                    }
                    statusPause = jogo.pausarJogo(statusPause);
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Insira o nome do jogo:");
                    String novoNome = sc.nextLine();
                    jogo.setNome(novoNome);
                    break;
                case 4:
                    System.out.println("Insira o nome do gênero:");
                    sc.nextLine();
                    String novoGenero = sc.nextLine();
                    jogo.setGenero(novoGenero);
                    break;
                case 5:
                    double novoPreco;
                    while (true) {
                        System.out.println("Insira o novo preço:");
                        if (sc.hasNextDouble()) {
                            novoPreco = sc.nextDouble();
                            jogo.setPreco(novoPreco);
                            break;
                        } else {
                            System.out.println("Valor inválido. Tente novamente.");
                            sc.nextLine();
                        }
                    }
                    break;
                case 6:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
