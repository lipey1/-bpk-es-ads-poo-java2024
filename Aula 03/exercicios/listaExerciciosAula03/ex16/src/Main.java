// 16 - Crie uma classe Loja com atributos nome, endereco, e telefone. Adicione métodos para abrir e fechar a loja.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Loja loja = new Loja("Lojinha do marquinhos", "Jardim Gisela, Rua 13 de Maio 152, próximo ao barracão","(45) 99941-6812");
        System.out.println("Nome da loja: " + loja.getNome() + "\nEndereço: " + loja.getEndereco() + "\nTelefone: "+ loja.getTelefone());
        System.out.println("");

        int statusA = 0;
        int statusB = 0;

        while (true) {
            System.out.println("\nNome da loja: " + loja.getNome() + "\nEndereço: " + loja.getEndereco() + "\nTelefone: "+ loja.getTelefone());
            System.out.println("");
            System.out.println("O que deseja fazer ?\n1 - Abrir a loja\n2 - Fechar a loja\n3 - Alterar nome da loja\n4 - Alterar endereço\n5 - Alterar telefone\n6 - Sair");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    statusA = loja.abrirLoja(statusA);
                    statusB = 0;
                    break;
                case 2:
                    statusB = loja.fecharLoja(statusB);
                    statusA = 0;
                    break;
                case 3:
                    System.out.print("Novo nome da loja: ");
                    String novoNome = sc.next();
                    loja.setNome(novoNome);
                    break;
                case 4:
                    System.out.print("Novo endereço: ");
                    String novoEndereco = sc.next();
                    loja.setEndereco(novoEndereco);
                    break;
                case 5:
                    sc.nextLine();
                    while (true){
                        System.out.println("Novo telefone:");
                        String novoTelefone = sc.next();
                        if(novoTelefone.matches("\\d{13}")){ // \\d representa um numérico, e {13} espera um numero de 13 digitos COM o 9 a mais, considerando apenas numeros do brasil e DDD com 2 digitos
                            loja.setTelefone("(+" + novoTelefone.substring(0, 2) + ") " + novoTelefone.substring(2, 4) + " " + novoTelefone.substring(4, 9) + "-" + novoTelefone.substring(9, 13));
                            break;
                        } else {
                            System.out.println("\nTelefone inválido! Informe um número de 13 dígitos.\n");
                        }
                    } 
                case 6:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("\nOpção inválida!\n\n");
                    break;
            }
        }

    }
}
