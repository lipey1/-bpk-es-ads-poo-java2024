
// 5 - Defina uma classe Cachorro com atributos nome, raca, e idade. Adicione métodos para latir e correr.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Cachorro dog = new Cachorro("Rato", "Chihuahua", 3);
        Scanner sc = new Scanner(System.in);
        int statusLatindo = 0;
        int statusCorrendo = 0;
        while (true) {
            System.out.println(
                    "\nNome: " + dog.getNome() + "\nRaça: " + dog.getRaca() + "\nIdade: " + dog.getIdade() + "\n");
            System.out.println(
                    "O que deseja fazer ?\n1 - Mandar o cachorro latir\n2 - Mandar o cachorro correr\n3 - Renomear o cachorro\n4 - Mudar a raça do cachorro\n5 - Alterar idade\n6 - Sair");
            int escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    statusLatindo = dog.latir(statusLatindo);
                    break;
                case 2:
                    statusCorrendo = dog.correr(statusCorrendo);
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Insira o novo nome: ");
                    String nome = sc.nextLine();
                    dog.setNome(nome);
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("Insira o nome da raça: ");
                    String raca = sc.nextLine();
                    dog.setRaca(raca);
                case 5:
                    int idade;
                    while (true) {
                        System.out.println("Insira a nova idade: ");
                        if(sc.hasNextInt()){
                            idade = sc.nextInt();
                            dog.setIdade(idade);
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
                    System.out.println("Insira uma opção válida!");
            }
        }
    }
}
