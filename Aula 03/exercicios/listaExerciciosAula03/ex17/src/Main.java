// 17 -Implemente uma classe Animal com atributos especie, idade, e peso. Adicione métodos para alimentar e dormir.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Animal bicho = new Animal("Baiacu", 1, 250);
        Scanner sc = new Scanner(System.in);
        int sleepingStatus = 0;
        while (true) {
            System.out.println("\nAnimal: " + bicho.getEspecie() + "\nIdade: " + bicho.getIdade() + " anos\nPeso: "
                    + bicho.getPeso() + " gramas\n\n");
            System.out.println("O que você deseja que o " + bicho.getEspecie()
                    + " faça ?\n1 - Comer\n2 - Dormir\n3 - Alterar espécie\n4 - Alterar idade\n5 - Alterar peso\n6 - Sair");
            if (bicho.getPeso() > 1000) {
                System.out.println("\n\nO " + bicho.getEspecie()
                        + " começou a inchar sem controle, e explodiu sozinho no mar. Parabéns, seu monstro!\n\n");
                return;
            }
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (sleepingStatus == 1) {
                        System.out.println(
                                "O " + bicho.getEspecie() + " está dormindo, acorde ele para poder alimentá-lo!\n");
                        break;
                    } else {
                        System.out.println("\n\nO que o " + bicho.getEspecie()
                                + " vai comer ?\n1 - Plástico\n2 - Bichinhos menores\n3 - Cenoura");
                        int foodChoice = sc.nextInt();
                        if (foodChoice != 1 && foodChoice != 2 && foodChoice != 3) {
                            System.out.println("Escolha inválida!\n");
                            break;
                        } else {
                            bicho.alimentar(foodChoice);
                            break;
                        }
                    }
                case 2:
                    sleepingStatus = bicho.dormir(sleepingStatus);
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Insira o nome:");
                    String nome = sc.nextLine();
                    bicho.setEspecie(nome);
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("Insira a idade:");
                    int idade = sc.nextInt();
                    bicho.setIdade(idade);
                    break;
                case 5:
                    sc.nextLine();
                    System.out.println("Insira o peso:");
                    double peso = sc.nextDouble();
                    bicho.setPeso(peso);
                    break;

                case 6:
                    System.exit(0);
                default:
                    break;
            }
        }

    }
}