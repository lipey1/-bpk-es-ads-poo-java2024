
// 6 - Crie uma classe Computador com atributos como processador, memoriaRAM, e armazenamento. Adicione métodos para ligar e desligar o computador.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Computador comp = new Computador("Intel Core i7 6700k", 16, 512);
        int status = 0;
        while (true) {
            System.out.println("\nEspecificações:\nProcessador: " + comp.getCpu() + "\nMemória RAM: "
                    + comp.getMemoriaRAM() + " GB\nArmazenamento: " + comp.getStorage() + " GB\n");
            System.out.println(
                    "O que deseja fazer ?\n1 - Ligar o computador\n2 - Desligar o computador\n3 - Mudar processador\n4 - Alterar armazenamento\n5 - Alterar RAM\n6 - Sair");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    status = comp.ligar(status);
                    break;
                case 2:
                    status = comp.desligar(status);
                    break;
                case 3:
                    System.out.println("Insira o nome do novo processador");
                    sc.nextLine();
                    String cpu = sc.nextLine();
                    comp.setCpu(cpu);
                    break;
                case 4:
                    int storage;
                    while (true) {
                        System.out.println("Qual será o tamanho de armazenamento ? (em GB): ");
                        if (sc.hasNextInt()) {
                            storage = sc.nextInt();
                            comp.setStorage(storage);
                            break;
                        } else {
                            sc.nextLine();
                            System.out.println("Insira apenas números.");
                        }
                    }
                    break;
                case 5:
                    int ram;
                    while (true) {
                        System.out.println("Quanto GB's de memória ? ");
                        if (sc.hasNextInt()) {
                            ram = sc.nextInt();
                            comp.setRam(ram);
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
