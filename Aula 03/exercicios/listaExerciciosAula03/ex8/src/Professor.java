// 8 - Crie uma classe Professor com atributos nome, disciplina, e salario. Adicione métodos para dar aula e corrigir provas.
public class Professor {
    private String nome;
    private String disciplina;
    private double salario;

    public Professor(String nome, String disciplina, double salario) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public void darAula() {
        System.out.println("O professor(a) " + nome + " está dando aula de " + disciplina + ".");
    }

    public void corrigirProvas() {
        System.out.println("O professor(a) " + nome + " está corrigindo provas de " + disciplina + ".");
    }

    public void setSalario(double salario){
        if(salario < 1412){
            System.out.println("O salário deve ser maior ou igual a um salário mínimo!");
        } else {
            this.salario = salario;
            System.out.println("Salário alterado para: R$" + salario);
        }
    }

    public void setDiscplina(String disciplina){
        if(disciplina != null && !disciplina.trim().isEmpty()){
            this.disciplina = disciplina;
            System.out.println("Nome da disciplina alterado para: " + disciplina);
        } else {
            System.out.println("Nome inválido");
        }
    }

    public void setNome(String nome){
        if(nome != null && !nome.trim().isEmpty()){
            System.out.println("Insira o nome: ");
            this.nome = nome;
        } else {
            System.out.println("Nome inválido.");
        }
    }

    public String getNome(){
        return nome;
    }
    public String getDisciplina(){
        return disciplina;
    }
    public double getSalario(){
        return salario;
    }    
}