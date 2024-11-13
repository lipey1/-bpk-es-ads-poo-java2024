// 12 - Implemente uma classe Filme com atributos titulo, diretor, e duracao. Adicione métodos para iniciar e parar o filme.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Filme melhorDaTrilogia = new Filme("O senhor dos anéis\nO retorno do rei", "J.K. Rowling", 1920000);
        int status1 = 0; // filme ta parado
        int status2 = 0; // filme ta rodando
        while (true) {
            System.out.println("Filme: " + melhorDaTrilogia.getTitule() + "\nDiretor: " + melhorDaTrilogia.getDiretor() + "\nDuração: " + melhorDaTrilogia.getDuracao() + " minutos");
            System.out.println("O que deseja fazer ?\n1 - Iniciar o filme\n2 - Parar o filme\n3 - Alterar nome do filme\n4 - Alterar diretor\n5 - Alterar duração\n6 - Sair");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    status1 = melhorDaTrilogia.iniciarFilme(status1);
                    break;
                case 2:
                    if (status1 == 0) {
                        System.out.println("O filme precisa iniciar primeiro para poder parar!");
                    } else {
                        status2 = melhorDaTrilogia.pararFilme(status2);
                        status1 = melhorDaTrilogia.pararFilme2(status1);
                    }
                    break;
                case 3:
                    System.out.println("Novo nome do filme: ");
                    String nome = sc.next();
                    melhorDaTrilogia.setTitule(nome);
                    break;
                case 4:
                    System.out.println("Novo nome do diretor: ");
                    String novoDiretor = sc.next();
                    melhorDaTrilogia.setDiretor(novoDiretor);
                    break;
                case 5:
                    while(true){
                        System.out.println("Nova duração (em minutos): ");
                        int duracao = sc.nextInt();
                        if(sc.hasNextInt()){
                            melhorDaTrilogia.setDuracao(duracao);
                            break;
                        }
                        System.out.println("Duração inválida. Insira um número entre 1 e 1920000.");
                    }
                case 6:
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}
