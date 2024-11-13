
// 22 - Defina uma classe Empresa com atributos como nome, CNPJ, e numeroFuncionarios. Adicione métodos para contratar e demitir funcionários.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Empresa do marquin", "12.345.678/0001-99", 12032);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nNome da empresa: " + empresa.getNome());
            System.out.println("CNPJ: " + empresa.getCNPJ());
            System.out.println("Número de funcionários: " + empresa.getNumeroFuncionarios());
            System.out.println(
                    "O que deseja fazer?\n1 - Contratar funcionários\n2 - Demitir funcionários\n3 - Alterar nome da empresa\n4 - Alterar CNPJ\n5 - Alterar número de funcionarios\n6 - Sair");
            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Quantos funcionários deseja contratar?");
                    int contratar = sc.nextInt();
                    empresa.contratarFuncionario(contratar);
                    break;
                case 2:
                    System.out.println("Quantos funcionários deseja demitir?");
                    int demitir = sc.nextInt();
                    empresa.demitirFuncionario(demitir);
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Insira o novo nome da empresa:");
                    String nome = sc.nextLine();
                    empresa.setNome(nome);
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("Insira o novo CNPJ:");
                    String cnpj = sc.nextLine();
                    if (cnpj.matches("\\d{14}")) {
                        empresa.setCNPJ(cnpj.substring(0, 2) + "." + cnpj.substring(2, 5) + "." + cnpj.substring(5, 8)
                                + "/" + cnpj.substring(8, 12) + "-" + cnpj.substring(12, 14));
                                break;
                    } else {
                        System.out.println("CNPJ inválido. (14 dígitos)");
                    }
                    break;
                case 5:
                    sc.nextLine();
                    while (true) {
                        System.out.println("Insira o novo número de funcionarios:");
                        int numeroFuncionarios = sc.nextInt();
                        if (numeroFuncionarios >= 0) {
                            empresa.setNumeroFuncionarios(numeroFuncionarios);
                            break;
                        } else {
                            System.out.println("Número de funcionarios inválido!");
                        }
                    }
                    break;
                case 6:
                    System.out.println("Saindo...");
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
