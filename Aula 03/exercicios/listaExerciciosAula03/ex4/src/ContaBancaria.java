// 4 - Crie uma classe ContaBancaria com atributos como numeroConta e saldo. Adicione métodos para depositar e sacar dinheiro.
public class ContaBancaria {
    private int numeroConta;
    private float saldo;

    public ContaBancaria(int numeroConta, float saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void depositar(float valorDeposito) {
        this.saldo += valorDeposito;
        System.out.println("Depósito realizado com sucesso.\nNovo saldo: " + this.saldo);
    }

    public void sacar(float valorSaque) {
        if (valorSaque > this.saldo) {
            System.out.println("Sem saldo!\n");
        } else {
            this.saldo -= valorSaque;
            System.out.println("Saque realizado com sucesso.\nNovo saldo: " + this.saldo);
        }
    }

    public float getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
}