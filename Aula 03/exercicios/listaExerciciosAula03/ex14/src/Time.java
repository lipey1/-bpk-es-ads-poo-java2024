// 14 - Defina uma classe Time com atributos como nome, tecnico, e numeroDeJogadores. Adicione métodos para adicionar e remover jogadores.
public class Time {
    private String nome;
    private String tecnico;
    private int numeroDeJogadores;

    public Time(String nome, String tecnico, int numeroDeJogadores) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.numeroDeJogadores = numeroDeJogadores;
    }
    public int getQtdJogadores() {
        return numeroDeJogadores;
    }
    public String getTecnico() {
        return tecnico;
    }
    public String getNome() {
        return nome;
    }

    public void setNumeroDeJogadores(int numeroDeJogadores) {
        if(numeroDeJogadores >= 0 && numeroDeJogadores <= 13){
            this.numeroDeJogadores = numeroDeJogadores;
            System.out.println("\nNúmero de jogadores alterado para: " + numeroDeJogadores);
        } else {
            System.out.println("\nNúmero inválido. (1-13)");
        }
    }
    
    public void setNomeTecnico(String nome){
        if(nome != null && !nome.trim().isEmpty()){
            this.tecnico = nome;
            System.out.println("\nNome do técnico alterado para: " + nome);
        } else {
            System.out.println("\nNome inválido.");
        }
    }
    
    public void setNome(String nome) {
        if(nome != null && !nome.trim().isEmpty()){
            this.nome = nome;
            System.out.println("\nNome do time alterado para: " + nome);
            System.out.println("");
        } else {
            System.out.println("\nNome inválido.");
        }
    }

    public void adicionarJogador(int qtdJogadores) {
        if (numeroDeJogadores + qtdJogadores > 12) {
            System.out.println("\nVocê não pode adicionar mais jogadores, o time possui um máximo de 12 jogadores.");
            System.out.println("");
        } else {
            numeroDeJogadores += qtdJogadores;
            System.out.println("\nVocê adicionou " + qtdJogadores + " jogadores no time " + nome);
            System.out.println("");
        }
    }

    public void removerJogador(int qtdJogadores) {
        if (qtdJogadores > numeroDeJogadores) {
            numeroDeJogadores = 0;
            System.out.println("\nVocê removeu todos os jogadores do time " + nome);
            System.out.println("");
        } else {
            numeroDeJogadores -= qtdJogadores;
            System.out.println("\nVocê removeu " + qtdJogadores + " jogadores do time " + nome);
            System.out.println("");
        }
    }
}