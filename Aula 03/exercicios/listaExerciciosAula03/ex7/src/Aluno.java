// 7 - Implemente uma classe Aluno com atributos nome, matricula, e curso. Adicione um método para calcular a média de notas.
public class Aluno {
    private String nome;
    private String curso;
    private int matricula;

    public Aluno(String nome, int matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public double calcularMedia(float nota1, float nota2, float nota3) {
        float media = (nota1 + nota2 + nota3) / 3;
        return media;
    }

    public void setNome(String nome){
        if(nome != null && !nome.trim().isEmpty()){
            this.nome = nome;
            System.out.println("Nome do aluno alterado para: " + nome);
        } else {
            System.out.println("Nome inválido.");
        }
    }
    public void setCurso(String curso){
        if(curso != null && !curso.trim().isEmpty()){
            System.out.println("Curso alterado para: " + curso);
            this.curso = curso;
        } else {
            System.out.println("Nome inválido.");
        }
    }
    public void setMatricula(int matricula){
        if(matricula > 0){
            this.matricula = matricula;
            System.out.println("Matrícula alterada para: " + matricula);
        } else {
            System.out.println("Matrícula inválida.");
        }
    }










    public String getNome(){
        return nome;
    }
    public String getCurso(){
        return curso;
    }
    public int getMatricula(){
        return matricula;
    }
}