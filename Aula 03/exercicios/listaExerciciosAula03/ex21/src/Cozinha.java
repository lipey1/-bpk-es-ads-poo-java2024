public class Cozinha {
     private String tipo;
     private String cor;
     private int quantidadePessoas;

    public Cozinha(String tipo, int quantidadePessoas, String cor) {
        this.tipo = tipo;
        this.quantidadePessoas = quantidadePessoas;
        this.cor = cor;
    }

    public String getTipo(){
        return tipo;
    }
    public int getQuantidadePessoas(){
        return quantidadePessoas;
    }
    public String getCor(){
        return cor;
    }

    public void setTipo(String tipo){
        if(tipo != null && !tipo.trim().isEmpty()){
            System.out.println("Tipo alterado para: " + tipo);
            this.tipo = tipo;
        }else {
            System.out.println("Tipo inválido.");
        }
    }
    public void setQuantidadePessoas(int quantidadePessoas){
        if(quantidadePessoas > 0){
            System.out.println("Quantidade de pessoas alterada para: " + quantidadePessoas);
            this.quantidadePessoas = quantidadePessoas;
        }else {
            System.out.println("Quantidade inválida.");
        }
    }

    public void setCor(String cor){
        if(cor != null &&!cor.trim().isEmpty()){
            System.out.println("Cor alterada para: " + cor);
            this.cor = cor;
        } else {
            System.out.println("Cor inválida.");
        }
    }
    public int cozinhar(int statusCozinha) {
        if (statusCozinha == 0) {
            System.out.println("\nVocê está e sua equipe estão cozinhando para " + quantidadePessoas + " pessoas.");
            statusCozinha = 1;
        } else if (statusCozinha == 1) {
            System.out.println("\nVocês ainda estão cozinhando, mas ainda não terminaram, ACELERA AÍ!!!.");
            statusCozinha = 2;
        } else {
            System.out.println("\nVocê e sua equipe terminaram de cozinhar. Já era hora!");
            statusCozinha = 0;
        }
        return statusCozinha;
    }

    public int limpar(int status) {
        if (status == 0) {
            System.out.println("\nA cozinha está sendo limpa.");
            status = 1;
        } else if (status == 1) {
            System.out.println("\nA cozinha está quase limpa!");
            status = 2;
        } else {
            System.out.println("\nA cozinha está limpa.");
            status = 3;
        }
        return status;
    }
}
