public class Motor {
    private int cilindradas;
    private String modelo;
    private TipoCombustivel tipoCombustivel;
    private int rpm;
    private int potencia;
    private boolean ligado;
    private String marchaAtual  =  "Neutro";


    public Motor(int cilindradasl, boolean ligado, String modelo, int potencia, int rpm, TipoCombustivel tipoCombustivel) {
        this.cilindradas = cilindradasl;
        this.ligado = ligado;
        this.modelo = modelo;
        this.potencia = potencia;
        this.rpm = rpm;
        this.tipoCombustivel = tipoCombustivel;
    }

    public void trocarMarcha(){
        if(this.marchaAtual == "Neutro"){
            this.marchaAtual = "Primeira marcha";
            System.out.println("Você engatou a primeira marcha.");
            System.out.println("Marcha atual: " + this.marchaAtual);
        } else if (this.marchaAtual == "Primeira marcha"){
            this.marchaAtual = "Segunda marcha";
            System.out.println("Você engatou a segunda marcha.");
            System.out.println("Marcha atual: " + this.marchaAtual);
        } else if (this.marchaAtual == "Segunda marcha"){
            this.marchaAtual = "Terceira marcha";
            System.out.println("Você engatou a segunda marcha.");
            System.out.println("Marcha atual: " + this.marchaAtual);
        } else {
            if(this.marchaAtual == "Quarta marcha"){
                System.out.println("Você já está na última marcha!");
            } else {
            this.marchaAtual = "Quarta marcha";
            System.out.println("Você engatou a última marcha.");
            System.out.println("Marcha atual: " + this.marchaAtual);
            System.out.println("Ao passar para a quarta marcha, você acaba quebrando o câmbio da marcha!!");
            }
        }
    }

    public void acelerar(int incrementoRpm){
        if(this.rpm >= 8000){
            this.rpm = 8000;
            System.out.println("Tu acelerou mais do que devia, o acelerador travou e você bateu em um caminhão. Você morreu!");
            System.exit(0);
        }else {
            System.out.println("Você acelerou o RPM em " + incrementoRpm + " rotações");
            this.rpm += incrementoRpm;
            System.out.println("RPM atual: " + this.rpm);
        }
    }
    public void reduzirRpm(int decrementoRpm){
        if(this.rpm <= 0){
            System.out.println("O carro ta parado seu nóia");
        } else {
            System.out.println("Você reduziu o RPM em " + decrementoRpm + " rotações");
            this.rpm -= decrementoRpm;
            System.out.println("RPM atual: " + this.rpm);
        }
    }

    public void aumentarPotencia(int incremento){
        if(incremento > 20){
            System.out.println("Calma aí meu patrão, máximo de 20 cavalos por turbinada!");
        } else {
            if(this.potencia >= 2000){
                System.out.println("Não vai rolar");
            } else {
                System.out.println("Você aumentou a potência em " + incremento + " cavalos !");
                this.potencia += incremento;
                System.out.println("Pôtencia atual: " + this.potencia);
            }
        }
    }

    public void reduzirPotencia(int decremento){
        if(this.potencia <= 15){
            System.out.println("Pra diminuiur mais que isso só tirando o motor, seu jumento");
            this.potencia = 15;
        }
        System.out.println("Você diminuiu a potência em " + decremento + " cavalos !");
        this.potencia -= decremento;
        System.out.println("Pôtencia atual: " + this.potencia);
    }

    public void ligar(){
        if(this.ligado == true){
            System.out.println("O carro já está ligado!\n");
        }else{
        this.ligado = true;
        }
    }

    public void desligar(){
        if(this.ligado == false){
            System.out.println("O carro já está desligado!\n");
        } else{
            this.ligado = false;
        }
    }
    public String getMarchaAtual(){
        return this.marchaAtual;
    }

    public int getCilindradasl() {
        return cilindradas;
    }

    public void setCilindradasl(int cilindradasl) {
        this.cilindradas = cilindradasl;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
}
