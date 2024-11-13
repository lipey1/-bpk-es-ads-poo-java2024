// 20 - Crie uma classe Bicicleta com atributos marca, modelo, e tamanhoRoda. Adicione métodos para pedalar e frear.
public class Bicicleta {
    private String marca;
    private String modelo;
    private int tamanhoRoda;

    public Bicicleta(String marca, String modelo, int tamanhoRoda) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoRoda = tamanhoRoda;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getTamanhoRoda() {
        return tamanhoRoda;
    }

    public void setTamanhoRoda(int tamanho) {
        if (tamanho >= 21 && tamanho <= 30) {
            this.tamanhoRoda = tamanho;
            System.out.println("\nTamanho da roda alterado para: " + tamanhoRoda + "\n");
        } else {
            System.out.println("\nTamanho da roda inválido.\n");
        }
    }

    public void setMarca(String marca) {
        if (marca != null && !marca.trim().isEmpty()) {
            this.marca = marca;
            System.out.println("Marca alterada para: " + marca + "\n");
        } else {
            System.out.println("Marca inválida.\n");
        }
    }

    public void setModelo(String modelo) {
        if (modelo != null && !modelo.trim().isEmpty()) {
            this.modelo = modelo;
            System.out.println("Modelo alterado para: " + modelo + "\n");
        } else {
            System.out.println("Modelo inválido.\n");
        }
    }

    public int pedalar(int velocidade) {
        velocidade += 5;
        if (velocidade > 0 && velocidade <= 30) {
            System.out.println("Você está pedalando mais rápido!\nVelocidade atual: " + velocidade + "km/h\n");
        } else if (velocidade > 30 && velocidade < 50) {
            System.out.println(
                    "Você está pedalando MUITO rápido! Fica esperto\nVelocidade atual: " + velocidade + "km/h\n");
        } else if (velocidade >= 50) {
            System.out.println(
                    "Você esqueceu de revisar os freios e não consegue mais frear!!\nSó te resta acelerar agora...\nVelocidade atual: "
                            + velocidade + "km/h\n");
        }
        return velocidade;
    }

    public int frear(int velocidade) {
        if (velocidade <= 0) {
            System.out.println(
                    "Não da para parar, por que você já está parado, faz sentido pra você ?\nVelocidade atual: "
                            + velocidade + "km/h\n");
        } else if (velocidade == 50) {
            System.out.println(
                    "Os freios estouraram por que você esqueceu de revisar os freios!!!!!\nSó te resta acelerar ainda mais agora...\nVelocidade atual: "
                            + velocidade + "km/h\n");
            return velocidade;
        } else if (velocidade > 50) {
            System.out.println("Só te resta acelerar ainda mais agora...\nVelocidade atual: " + velocidade + "km/h\n");
        } else {
            velocidade -= 5;
            System.out.println("Você freou um pouco.\nVelocidade atual: " + velocidade + "km/h\n");
        }

        return velocidade;
    }
}