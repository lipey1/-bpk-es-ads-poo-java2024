// 20 - Crie uma classe Bicicleta com atributos marca, modelo, e tamanhoRoda. Adicione métodos para pedalar e frear.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Bicicleta bike = new Bicicleta("Shimano", "Mountain Bike", 29);
        int velocidade = 0;
        while (true) {
            System.out.println("\nBicicleta marca: " + bike.getMarca() + "\nModelo: " + bike.getModelo()+ "\nTamanho da roda: Aro " + bike.getTamanhoRoda());
            System.out.println("");
            if (velocidade > 70) {
                System.out.println("Você estava pedalando tão rápido que não conseguiu ver o Scania 113 branco a tempo. Você e o caminhão se tornaram 1.\nVocê morreu! ");
                return;
            }
            System.out.println("O que deseja fazer ?\n1 - Pedalar\n2 - Frear\n3 - Alterar marca\n4 - Alterar modelo\n5 - Alterar tamanho do aro\n6 - Sair");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    velocidade = bike.pedalar(velocidade);
                    break;
                case 2:
                    velocidade = bike.frear(velocidade);
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Digite a nova marca da bicicleta:");
                    String marca = sc.nextLine();
                    bike.setMarca(marca);
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("Digite o novo modelo da bicicleta:");
                    String modelo = sc.nextLine();
                    bike.setModelo(modelo);
                    break;
                case 5:
                    sc.nextLine();
                    while (true) {
                        System.out.println("Digite o novo tamanho do aro (entre 21 e 30):");
                        int aro;
                        if (sc.hasNextInt()) {
                            aro = sc.nextInt();
                            bike.setTamanhoRoda(aro);
                            break;
                        } else {
                            System.out.println("Tamanho do aro inválido. Por favor, tente novamente.");
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
