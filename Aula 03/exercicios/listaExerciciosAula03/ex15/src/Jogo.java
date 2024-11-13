// 15 - Crie uma classe Jogo com atributos nome, genero, e preco. Adicione métodos para iniciar e pausar o jogo.
public class Jogo {
    private String nome;
    private String genero;
    private double preco;

    public Jogo(String nome, String genero, double preco) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
            System.out.println("Nome do jogo alterado para: " + nome);
        } else {
            System.out.println("Nome inválido.");
        }
    }

    public void setGenero(String genero) {
        if (genero != null && !genero.trim().isEmpty()) {
            this.genero = genero;
            System.out.println("Gênero do jogo alterado para: " + genero);
        } else {
            System.out.println("Gênero inválido.");
        }
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
            System.out.println("Preço inválido.");
        } else {
            this.preco = preco;
            System.out.println("Preço alterado para R$" + preco);
        }
    }

    public int iniciarJogo(int status) {
        if (status == 0) {
            System.out.println("\nVocê iniciou o jogo " + nome);
            status = 1;
        } else {
            System.out.println("\nVocê já está jogando!");
        }
        return status;
    }

    public int pausarJogo(int status) {
        if (status == 0) {
            System.out.println("Você pausou o jogo " + nome);
            status = 1;
        } else {
            System.out.println("Você despausou o jogo " + nome);
            status = 0;
        }
        return status;
    }
}