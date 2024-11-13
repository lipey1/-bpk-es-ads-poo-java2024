// 12 - Implemente uma classe Filme com atributos titulo, diretor, e duracao. Adicione métodos para iniciar e parar o filme.
public class Filme {
    private String titulo;
    private String diretor;
    private int duracao;

    public Filme(String titulo, String diretor, int duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public String getTitule() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getDuracao() {
        return duracao;
    }
    
    public void setDiretor(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Nome inválido.");
        } else {
            this.titulo = nome;
            System.out.println("Nome do diretor alterado para: " + nome);
        }
    }

    public void setTitule(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Nome inválido.");
        }else {
            this.titulo = nome;
            System.out.println("Nome do filme alterado para: " + titulo);
        }
    }
    public void setDuracao(int duracao) {
        if(duracao < 0){
            System.out.println("Duração inválida.");
        } else {
            this.duracao = duracao;
            System.out.println("Duração do filme alterada para: " + duracao + " segundos.");
        }
    }

    public int iniciarFilme(int statusInicio) {
        System.out.println(
                "Iniciando filme: " + titulo + "\nDiretor: " + diretor + "\nDuracao: " + duracao + " segundos.\n");
        if (statusInicio == 0) {
            System.out.println("O filme iniciou!");
            statusInicio = 1;
        } else
            System.out.println("O filme já iniciou!");

        return statusInicio;
    }

    public int pararFilme(int statusParar) {
        if (statusParar == 0) {
            System.out.println("O filme parou!");
            statusParar = 1;
        } else {
            System.out.println("O filme já parou!");
        }

        return statusParar;
    }

    public int pararFilme2(int statusInicio) {
        if (statusInicio == 1) {
            statusInicio = 0;
        } else {
        }
        return statusInicio;
    }

}
