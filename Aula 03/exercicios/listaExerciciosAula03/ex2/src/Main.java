
// 2 - Defina uma classe Celular com atributos como marca, modelo, e capacidadeBateria. Adicione métodos para ligar e desligar o celular.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Celular pocket = new Celular("Samgung", "Pocket", 1500);
        Scanner sc = new Scanner(System.in);
        int status = 0;
        while (true) {
            System.out.println(
                    "Marca: " + pocket.getMarca() + "\nModelo: " + pocket.getModelo() + "\nCapacidade da bateria: "
                            + pocket.getCapacidadeBateria() + "\n");
            System.out.println(
                    "O que deseja fazer ?\n1 - Ligar o celular\n2 - Desligar o celular\n3 - Alterar marca\n4 - Alterar modelo\n5 - Alterar capacidade da bateria\n6 - Sair");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    status = pocket.ligar(status);
                    break;
                case 2:
                    status = pocket.desligar(status);
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Digite o novo nome da marca do celular");
                    String marcaNova = sc.nextLine();
                    pocket.setMarca(marcaNova);
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("Digite o nome do novo modelo");
                    String modelo = sc.nextLine();
                    pocket.setModelo(modelo);
                    break;
                case 5:
                    System.out.println("Qual será a nova capacidade ?");
                    int capacidade;
                    while (true) {
                        if (sc.hasNextInt()) {
                            capacidade = sc.nextInt();
                            sc.nextLine();
                            pocket.setCapacidadeBateria(capacidade);
                            break;
                        } else {
                            System.out.println("Insira um número!");
                            sc.nextLine();
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
