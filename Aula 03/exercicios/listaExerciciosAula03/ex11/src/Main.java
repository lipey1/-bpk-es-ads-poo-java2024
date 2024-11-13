// 11 - Crie uma classe Cidade com atributos nome, populacao, e estado. Adicione métodos para aumentar e diminuir a população.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Cidade cidade = new Cidade("Toledo", 32512, "Paraná");
        while (true) {
            System.out.println("Nome da cidade: " + cidade.getNomeCidade() + "\nEstado: " + cidade.getNomeEstado()
                    + "\nPopulação: " + cidade.getPopulacao());
            System.out.println("");
            System.out.println("O que deseja fazer ? (População atual " + cidade.getPopulacao()
                    + ")\n1 - Aumentar população\n2 - Diminuir população\n3 - Alterar nome da cidade\n4 - Alterar nome do Estado\n5 - Definir população\n6 - Sair");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    while (true) {
                        System.out.println("Quantos habitantes deseja adicionar?");
                        if (sc.hasNextInt()) {
                            int habitantes = sc.nextInt();
                            cidade.aumentarPopulacao(habitantes);
                            break;
                        } else {
                            sc.nextLine();
                            System.out.println("Insira apenas números.");
                        }
                    }
                    break;
                case 2:
                    while (true) {
                        System.out.println("Quantos habitantes deseja remover?");
                        if (sc.hasNextInt()) {
                            int habitantes2 = sc.nextInt();
                            cidade.diminuirPopulacao(habitantes2);
                            break;
                        } else {
                            sc.nextLine();
                            System.out.println("Insira apenas números.");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Novo nome da cidade:");
                    String nomeCidade = sc.next();
                    cidade.setNomeCidade(nomeCidade);
                    break;
                case 4:
                    System.out.println("Novo nome do estado:");
                    String nomeEstado = sc.next();
                    cidade.setNomeEstado(nomeEstado);
                    break;
                case 5:
                    while (true) {
                        System.out.println("Nova população:");
                        if (sc.hasNextInt()) {
                            int populacao = sc.nextInt();
                            cidade.setPopulacao(populacao);
                            break;
                        } else {
                            sc.nextLine();
                            System.out.println("Insira apenas números.");
                        }
                    }
                    break;
                case 6:
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}