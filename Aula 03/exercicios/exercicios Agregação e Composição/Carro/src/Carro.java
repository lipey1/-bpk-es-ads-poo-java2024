public class Carro {
    private String modelo;
    protected Motor motor;

    public Carro(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
    }

    public void ligarCarro(){
        if(this.motor.isLigado()){
            System.out.println("Já está ligado!");
        }else {
            this.motor.ligar();
            System.out.println("Você ligou o carro.");
        }
    }
    public void desligarCarro(){
        if(this.motor.isLigado()){
            this.motor.desligar();
            System.out.println("Você desligou o carro.");
        }else {
            System.out.println("Já está desligado.");
        }
    }
    public void turboBoost(int incremento){
        System.out.println("Você mexeu no carro e deu bom!\n");
        this.motor.aumentarPotencia(incremento);
    }
    public void reduzirPotenciaMotor(int decremento){
        this.motor.reduzirPotencia(decremento);
    }

    public void acionarAcelerador(int incrementoRpm){
        if(this.motor.getMarchaAtual() == "Neutro" ||  this.motor.getMarchaAtual() == "Primeira marcha" && this.motor.getRpm() >= 3000){
            System.out.println("Cê vai quebrar o carro se continuar assim doidão, passa a marcha!");
        } else {
            this.motor.acelerar(incrementoRpm);
            System.out.println("Rpm atual: " + this.motor.getRpm());
        }
    }
    public void acionarFreio(int decrementoRpm){
        if(this.motor.getRpm() == 0){
            System.out.println("O carro ta parado locao");
        }else {
            this.motor.reduzirRpm(decrementoRpm);
            System.out.println("Você diminuiu a velocidade\n");
            System.out.println("Rpm atual: " + this.motor.getRpm());
        }
    }
}