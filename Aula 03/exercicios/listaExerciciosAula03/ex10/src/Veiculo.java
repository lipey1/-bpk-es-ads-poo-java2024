// 10 - Crie uma classe Veiculo com atributos tipo, placa, e cor. Adicione métodos para abastecer e lavar o veículo.
public class Veiculo {
    private String tipo;
    private String placa;
    private String cor;

    public Veiculo(String tipo, String placa, String cor) {
        this.tipo = tipo;
        this.placa = placa;
        this.cor = cor;
    }

    public String getTipo(){
        return tipo;
    }
    public String getPlaca(){
        return placa;
    }
    public String getCor(){
        return cor;
    }
    public void setTipo(String tipo){
        if(tipo != null && !tipo.trim().isEmpty()){
            System.out.println("Tipo alterado para: " + tipo);
            this.tipo = tipo;
        } else {
            System.out.println("Tipo inválido.");
        }
    }
    public void setPlaca(String placa){
        if(placa != null && !placa.trim().isEmpty()){
            System.out.println("Placa alterada para: " + placa);
            this.placa = placa;
        } else {
            System.out.println("Placa inválida.");
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

    public int abastecer(int status){
        if (status == 0) {
            System.out.println("O veículo está sendo abastecido.");
            status = 1;
        } else if (status == 1) {
            System.out.println("O veículo está quase abastecido!");
            status = 2;
        } else {
            System.out.println("O veículo foi abastecido!");
            status = 3;
        }
        return status;
    }
    public int lavar(int status){
        if(status == 0){
            System.out.println("O veículo está sendo lavado.");
            status = 1;
        } else if (status == 1){
            System.out.println("O veículo está quase limpo!");
            status = 2;
        } else {
            System.out.println("O veículo foi limpo!");
            status = 3;
        }
        return status;
    }
}