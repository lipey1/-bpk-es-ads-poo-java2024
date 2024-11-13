// 17 -Implemente uma classe Animal com atributos especie, idade, e peso. Adicione métodos para alimentar e dormir.
public class Animal {
    private String especie;
    private int idade;
    private double peso;

    public Animal(String especie, int idade, double peso) {
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }
    public int getIdade(){
        return idade;
    }
    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
            System.out.println("Peso alterado para: " + peso + " gramas.");
        } else {
            System.out.println("Peso inválido.");
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

    public void setEspecie(String nome) {
        if (nome!= null &&!nome.trim().isEmpty()) {
            this.especie = nome;
            System.out.println("Nome do animal alterado para: " + especie);
        } else {
            System.out.println("Nome inválido.");
        }
    }


    public void alimentar(int foodChoice) {
        if (idade < 1) {
            System.out.println("\n\nO " + especie + " não tem idade suficiente para alimentar.\n");
            return;
        }
        if (foodChoice == 1) {
            System.out.println("\n\nO " + especie + " comeu um pedaço de plástico e morreu engasgado. Parabéns, desalmado!");
            System.exit(0);
        } else if (foodChoice == 2) {
            peso += 50;
            System.out.println("\n\nO " + especie + " comeu um bichinho menor e ganhou " + 50 + " gramas.");
            if (peso >= 300 && peso <= 400) {
                idade += 1;
                System.out.println("\nO " + especie + " envelheceu 1 ano!\n");
            } else if( peso >= 550){
                idade += 1;
                System.out.println("\nO " + especie + " envelheceu 1 ano!\n");
            }
            return;
        } else {
            peso += 32;
            System.out.println(
                    "\n\nO " + especie + " achou uma cenoura no caminho da toca, e comeu\n+ " + 32 + " gramas.");
            if (peso >= 300) {
                idade += 1;
                System.out.println("\nO " + especie + " envelheceu 1 ano!\n");
            }
            return;
        }
    }

    public int dormir(int status) {
        if (status == 0) {
            System.out.println("\n\nO " + especie + " está dormindo.\n");
            status = 1;
        } else {
            System.out.println("\n\nO " + especie + " acordou!\n");
            status = 0;
        }

        return status;
    }

}