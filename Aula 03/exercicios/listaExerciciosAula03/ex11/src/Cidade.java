// 11 - Crie uma classe Cidade com atributos nome, populacao, e estado. Adicione métodos para aumentar e diminuir a população.
public class Cidade {
    private String cidade;
    private String estado;
    private int populacao;

    public Cidade(String nome, int populacao, String estado) {
        this.cidade = nome;
        this.populacao = populacao;
        this.estado = estado;
    }

    public int getPopulacao() {
        return populacao;
    }
    public String getNomeCidade() {
        return cidade;
    }
    public String getNomeEstado() {
        return estado;
    }
    public void setNomeCidade(String nomeCidade) {
        if(nomeCidade == null || nomeCidade.trim().isEmpty()){
            System.out.println("Nome inválido.");
        } else {
            System.out.println("Nome da Cidade: " + nomeCidade);
            this.cidade = nomeCidade;
        }
    }

    public void setNomeEstado(String nome) {
        if(nome == null || nome.trim().isEmpty()){
            System.out.println("Nome inválido.");
        } else {
            System.out.println("Nome do Estado: " + nome);
            this.estado = nome;
        }
    }
    public void setPopulacao(int populacao) {
        if(populacao < 0){
            System.out.println("Número inválido.");
        }else {
            System.out.println("População atual: " + populacao + " habitantes"); 
            this.populacao = populacao;
        }
    }

    public void aumentarPopulacao(int quantidade) {
        System.out.println("Você aumentou a população  da cidade em " + populacao + " pessoas.");
        this.populacao += quantidade;
    }

    public void diminuirPopulacao(int quantidade) {
        if (quantidade >= populacao) {
            System.out.println("Você zerou a população da cidade, tendo agora 0 pessoas.");
            populacao = 0;
        } else {
            System.out.println("Você diminuiu a população em " + populacao + " pessoas.");
            this.populacao -= quantidade;
        }
    }
}