// 2 - Defina uma classe Celular com atributos como marca, modelo, e capacidadeBateria. Adicione métodos para ligar e desligar o celular.
public class Celular {
    private String marca;
    private String modelo;
    private int capacidadeBateria;
    int status = 0;

    public Celular(String marca, String modelo, int capacidadeBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeBateria = capacidadeBateria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca != null && !marca.trim().isEmpty()) {
            this.marca = marca;
        } else {
            System.out.println("Nome inválido!");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo != null && !modelo.trim().isEmpty()) {
            System.out.println("Nome alterado para: " + modelo);
            this.modelo = modelo;
        } else {
            System.out.println("Nome inválido!");
        }
    }

    public int getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public void setCapacidadeBateria(int capacidadeBateria) {
        if(capacidadeBateria > 0){
            this.capacidadeBateria = capacidadeBateria;
        }
        else {
            System.out.println("Número inválido!");
        }
    }

    public int getStatus() {
        return status;
    }

    public int ligar(int status) {
        if (status == 0) {
            System.out.println("\nVocê ligou o celular.\n");
            status = 1;
        } else {
            System.out.println("\nO celular já está ligado!\n");
        }
        return status;
    }

    public int desligar(int status) {
        if (status != 0) {
            System.out.println("\nVocê desligou o celular\n");
            status = 0;
        } else {
            System.out.println("\nO celular já está desligado!\n");
        }
        return status;
    }
}