
// 3 - Implemente uma classe Pessoa com atributos nome, idade, e altura. Adicione um método que imprime uma apresentação da pessoa.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa("Marcos", 18, 178);
        while (true) {
            System.out.println(
                    "O que deseja fazer ?\n1 - Iniciar apresentação\n2 - Alterar nome\n3 - Alterar idade\n4 - Alterar altura\n5 - Sair");
            int escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    pessoa.apresentacao();
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Insira o novo nome");
                    String nome = sc.nextLine();
                    pessoa.setNome(nome);
                    break;
                case 3:
                    int idade;
                    while (true) {
                        System.out.println("Insira a nova idade");
                        if (sc.hasNextInt()) {
                            idade = sc.nextInt();
                            pessoa.setIdade(idade);
                            sc.nextLine();
                            break;
                        } else {
                            sc.nextLine();
                            System.out.println("Idade inválida.");
                        }
                    }
                    break;
                case 4:
                    int altura;
                    while (true) {
                        System.out.println("Insira a nova altura");
                        if (sc.hasNextInt()) {
                            altura = sc.nextInt();
                            pessoa.setAltura(altura);
                            sc.nextLine();
                            break;
                        } else {
                            System.out.println("Altura inválida.");
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Escolha inválida!\n");
            }
        }

    }
}
