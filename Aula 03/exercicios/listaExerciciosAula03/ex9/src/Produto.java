// 9 - Defina uma classe Produto com atributos como nome, preco, e quantidadeEstoque. Adicione métodos para aumentar e diminuir o estoque.
public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void setQtdEstoque(int qtd){
        if(qtd < 0){
            System.out.println("Valor inválido.");
        } else {
            this.quantidadeEstoque = qtd;
            System.out.println("Estoque alterado para: " + qtd  + " unidades.");
        }
    }

    public void setPreco(double preco){
        if(preco < 0){
            System.out.println("Preço inválido");
        } else {
            this.preco = preco;
            System.out.println("Preço alterado para: R$" + preco);
        }
    }

    public void setNome(String nome){
        if(nome != null && !nome.trim().isEmpty()){
            this.nome = nome;
            System.out.println("Nome do produto alterado para: " + nome);
        } else {
            System.out.println("Nome inválido.");
        }
    }

    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public int getQtdEstoque(){
        return quantidadeEstoque;
    } 

    public void aumentarEstoque(int quantidade) {
        String precoFormatado = String.format("%.2f", preco * quantidade);
        quantidadeEstoque += quantidade;
        String precoTotalFormatado = String.format("%.2f", quantidadeEstoque * preco);
        System.out.println("Você aumentou a quantidade do produto " + nome + " em estoque em " + quantidade + " unidades, no valor de " + precoFormatado);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque + "\nValor em estoque: " + precoTotalFormatado);
    }

    public void diminuirEstoque(int quantidade) {
        String precoFormatado;
        String precoTotalFormatado;
        if (quantidade > quantidadeEstoque) {
            quantidadeEstoque = 0;
            precoFormatado = String.format("%.2f", preco * quantidade);
            precoTotalFormatado = "0.00";
            System.out.println("O estoque está vazio!");
        } else {
            quantidadeEstoque -= quantidade;
            precoFormatado = String.format("%.2f", preco * quantidade);
            precoTotalFormatado = String.format("%.2f", quantidadeEstoque * preco);
        }
        System.out.println("Você diminuiu a quantidade do produto " + nome + " em estoque em " + quantidade+ " unidades, no valor de R$ " + precoFormatado);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque + "\nValor em estoque: R$ " + precoTotalFormatado);
    }
}