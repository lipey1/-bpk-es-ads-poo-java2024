// 4 - Crie uma classe ContaBancaria com atributos como numeroConta e saldo. Adicione métodos para depositar e sacar dinheiro.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        ContaBancaria conta = new ContaBancaria(3214152, 0);
        Scanner sc = new Scanner(System.in);
        
        float valorSaque;
        float valorDeposito;
        
        System.out.println("Detalhes da conta: " + conta.getNumeroConta() + "\nSaldo: " + conta.getSaldo() + "\n");
        while (true) {
            System.out.println("O que deseja fazer ?\n1 - Depositar\n2 - Sacar\n3 - Sair");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Qual seria o valor do depósito ?");
                    valorDeposito = sc.nextFloat();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.println("Qual seria o valor do saque ?\nR$");
                    valorSaque = sc.nextFloat();
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}
