
// 8 - Crie uma classe Professor com atributos nome, disciplina, e salario. Adicione métodos para dar aula e corrigir provas.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Professor professor = new Professor("Roberval", "Matemática", 3000);
        while (true) {
            System.out.println("Nome do professor(a): " + professor.getNome() + "\nDisciplina: "
                    + professor.getDisciplina() + "\nSalário: R$" + professor.getSalario());
            System.out.println(
                    "O que você deseja que o professor faça ?\n1 - Dar aula\n2 - Corrigir provas\n3 - Alterar nome do professor\n4 - Alterar a disciplina\n5 - Ajustar salário\n6 - Sair");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    professor.darAula();
                    break;
                case 2:
                    professor.corrigirProvas();
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Insira o nome:");
                    String nome = sc.nextLine();
                    professor.setNome(nome);
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("Insira o nome:");
                    String disciplina = sc.nextLine();
                    professor.setDiscplina(disciplina);
                    break;
                case 5:
                    double salario;
                    while (true) {
                        System.out.println("Insira o número da matrícula");
                        if (sc.hasNextInt()) {
                            salario = sc.nextInt();
                            professor.setSalario(salario);
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
