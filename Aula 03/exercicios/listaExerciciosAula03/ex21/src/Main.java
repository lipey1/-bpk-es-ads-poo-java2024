// 21 - Implemente uma classe Cozinha com atributos tipo, quantidadePessoas, e cor. Adicione métodos para cozinhar e limpar.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Cozinha cozinha = new Cozinha("Moderna", 52, "Branca");
        Scanner sc = new Scanner(System.in);
        int statusLimpeza = 0;
        int statusCozinha = 0;

        while (true) {
            System.out.println("Tipo da cozinha: " + cozinha.getTipo() + "\nQuantidade de pessoas: "
                    + cozinha.getQuantidadePessoas() + "\nCor predominante: " + cozinha.getCor() + "\n");
            System.out.println(
                    "O que deseja fazer ?\n1 - Cozinhar\n2 - Limpar a cozinha\n3 - Alterar tipo de cozinha\n4 - Alterar quantidade de pessoas\n5 - Alterar cor predominante\n6 - Sair");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    statusCozinha = cozinha.cozinhar(statusCozinha);
                    statusLimpeza = 0;
                    break;
                case 2:
                    statusLimpeza = cozinha.limpar(statusLimpeza);
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Novo tipo de cozinha: ");
                    String novoTipo = sc.nextLine();
                    cozinha.setTipo(novoTipo);
                    break;
                case 4:
                    while (true) {
                        sc.nextLine();
                        System.out.println("Nova quantidade de pessoas: ");
                        if (sc.hasNextInt()) {
                            int novaQuantidadePessoas = sc.nextInt();
                            cozinha.setQuantidadePessoas(novaQuantidadePessoas);
                            break;
                        } else {
                            System.out.println("Número inválido.");
                        }
                    }
                    break;
                case 5:
                    sc.nextLine();
                    System.out.println("Nova cor predominante: ");
                    String novaCor = sc.nextLine();
                    cozinha.setCor(novaCor);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
