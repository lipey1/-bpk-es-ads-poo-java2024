import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Aluno aluno = new Aluno("Marcos", 312314, "Engenharia de Software");
        Scanner sc = new Scanner(System.in);
        float n1, n2, n3;
        while (true) {
            System.out.println("Nome do aluno(a): " + aluno.getNome() + " - " + aluno.getMatricula() + "\nCurso - "
                    + aluno.getCurso() + " .\n");
            System.out.println(
                    "O que deseja fazer ?\n1 - Calcular a média do aluno\n2 - Alterar nome do aluno\n3 - Alterar curso\n4 - Editar número da matrícula\n5 - Sair");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Insira a primeira nota: ");
                    n1 = sc.nextFloat();
                    System.out.println("Insira a segunda nota: ");
                    n2 = sc.nextFloat();
                    System.out.println("Insira a terceira nota: ");
                    n3 = sc.nextFloat();

                    String notaFormatada = String.format("%.1f", aluno.calcularMedia(n1, n2, n3));
                    System.out.println("A média total do aluno " + aluno.getNome() + " - " + aluno.getMatricula()
                            + " é: " + notaFormatada + "\n");
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Insira o nome:");
                    String nome = sc.nextLine();
                    aluno.setNome(nome);
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Insira o nome do curso: ");
                    String curso = sc.nextLine();
                    aluno.setCurso(curso);
                    break;
                case 4:
                    int matricula;
                    while (true) {
                        System.out.println("Insira o número da matrícula");
                        if (sc.hasNextInt()) {
                            matricula = sc.nextInt();
                            aluno.setMatricula(matricula);
                            break;
                        } else {
                            sc.nextLine();
                            System.out.println("Insira apenas números.");
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Escolha inválida!");
                    break;
            }

        }
    }
}
