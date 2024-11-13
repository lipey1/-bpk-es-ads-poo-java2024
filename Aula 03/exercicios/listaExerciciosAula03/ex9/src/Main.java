
// 9 - Defina uma classe Produto com atributos como nome, preco, e quantidadeEstoque. Adicione métodos para aumentar e diminuir o estoque.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Produto prod = new Produto("Batata", 5.84, 189);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Nome: " + prod.getNome() + "\nPreço: R$" + prod.getPreco() + "\nQuantidade em estoque: "
                    + prod.getQtdEstoque() + " unidades\n");
            System.out.println(
                    "O que deseja fazer ?\n1 - Aumentar estoque\n2 - Diminuir estoque\n3 - Renomear produto\n4 - Alterar preço\n5 - Alterar quantidade em estoque\n6 - Sair");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Quantas unidades deseja adicionar ao estoque?");
                    int qtd = sc.nextInt();
                    prod.aumentarEstoque(qtd);
                    break;
                case 2:
                    System.out.println("Quantas unidades deseja remover do estoque ?");
                    int qtdRemove = sc.nextInt();
                    prod.diminuirEstoque(qtdRemove);
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Insira o nome:");
                    String nome = sc.nextLine();
                    prod.setNome(nome);
                    break;
                case 4:
                    while (true) {
                        System.out.println("Insira o novo preço: ");
                        if (sc.hasNextDouble()) {
                            double preco = sc.nextDouble();
                            prod.setPreco(preco);
                            break;
                        } else {
                            sc.nextLine();
                            System.out.println("Insira apenas números.");
                        }
                    }
                    break;
                case 5:
                    while (true) {
                        System.out.println("Insira a nova quantidade em estoque: ");
                        if (sc.hasNextInt()) {
                            int qtdEstoque = sc.nextInt();
                            prod.setQtdEstoque(qtdEstoque);
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
