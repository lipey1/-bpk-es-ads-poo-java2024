// 3 - Implemente uma classe Pessoa com atributos nome, idade, e altura. Adicione um método que imprime uma apresentação da pessoa.
public class Pessoa {
    private String nome;
    private int idade;
    private int altura;

    public Pessoa(String nome, int idade, int altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void apresentacao() {
        System.out.println("\nOlá! Eu me chamo " + nome + ", tenho " + idade + " anos, e " + altura + " cm de altura.\n");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido.");
        }
    }

    public void setIdade(int idade) {
        if (idade > 0 && idade < 110) {
            System.out.println("Idade definida para: " + idade);
            this.idade = idade;
        } else {
            System.out.println("Idade inválida.");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setAltura(int altura) {
        if (altura > 350 || altura < 0) {
            System.out.println("Altura inválida.");
        } else {
            System.out.println("Altura definida para: " + altura);
            this.altura = altura;
        }
    }

    public int getAltura() {
        return altura;
    }
}