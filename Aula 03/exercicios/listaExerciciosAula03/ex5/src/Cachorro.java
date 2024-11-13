// 5 - Defina uma classe Cachorro com atributos nome, raca, e idade. Adicione métodos para latir e correr.
public class Cachorro {
    private String nome;
    private String raca;
    private int idade;

    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public int latir(int status) {
        if (status == 0) {
            System.out.println("O " + nome + " está latindo!");
            status = 1;
        } else {
            System.out.println("O " + nome + " parou de latir!");
            status = 0;
        }
        return status;
    }

    public int correr(int status) {
        if (status == 0) {
            System.out.println("O " + nome + " começou a correr!");
            status = 1;
        } else {
            System.out.println("O " + nome + " está parado!");
            status = 0;
        }
        return status;
    }

    public void setRaca(String raca) {
        if (raca != null && !nome.trim().isEmpty()) {
            this.raca = raca;
            System.out.println("Raça alterada para: " + raca);
        } else {
            System.out.println("Raça inválida.");
        }
    }

    public void setIdade(int idade) {
        if (idade > 0 && idade < 35) {
            this.idade = idade;
            System.out.println("Idade alterada para: " + idade + " anos.");
        } else {
            System.out.println("Idade inválida.");
        }
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            System.out.println("Nome alterado para: " + nome);
            this.nome = nome;
        } else {
            System.out.println("Nome inválido.");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public int getIdade() {
        return idade;
    }

}
