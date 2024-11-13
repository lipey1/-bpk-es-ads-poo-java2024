
// 14 - Defina uma classe Time com atributos como nome, tecnico, e numeroDeJogadores. Adicione métodos para adicionar e remover jogadores.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Time time = new Time("São Paulo", "Rogério Ceni", 12);
        while (true) {
            System.out.println("\nTime: " + time.getNome() + "\nTécnico: " + time.getTecnico()
                    + "\nQuantidade de jogadores: " + time.getQtdJogadores());
            System.out.println("");
            System.out.println(
                    "O que deseja fazer ?\n1 - Adicionar jogadores\n2 - Remover jogadores\n3 - Alterar nome do time\n4 - Alterar técnico\n5 - Alterar quantidade de jogadores\n6 - Sair");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Quantos jogadores deseja adicionar ?");
                    int qtdJogadores = sc.nextInt();
                    time.adicionarJogador(qtdJogadores);
                    break;
                case 2:
                    System.out.println("Quantos jogadores deseja remover?");
                    int qtdJogadoresRemover = sc.nextInt();
                    time.removerJogador(qtdJogadoresRemover);
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Insira o novo nome do time:");
                    String nome = sc.nextLine();
                    time.setNome(nome);
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("Insira o novo nome do técnico:");
                    String tecnico = sc.nextLine();
                    time.setNomeTecnico(tecnico);
                    break;
                case 5:
                    sc.nextLine();
                    System.out.println("Insira a nova quantidade de jogadores:");
                    int qtdJogadoresNovo = sc.nextInt();
                    time.setNumeroDeJogadores(qtdJogadoresNovo);
                    break;
                case 6:
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}