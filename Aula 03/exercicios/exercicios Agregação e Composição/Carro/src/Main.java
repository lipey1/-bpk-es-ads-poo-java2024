import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor(750, false, "V12", 300, 0, TipoCombustivel.GASOLINA);
        Motor motor2 = new Motor(500, false, "V8", 300, 0, TipoCombustivel.DIESEL);
        Motor motor3 = new Motor(300, false, "V6", 300, 0, TipoCombustivel.ELETRICO);

        Carro Fuscao = new Carro("Fusca", motor);
        Carro seila = new Carro("F-150", motor2);
        Carro Tesla = new Carro("Model Y", motor3);
        Scanner sc = new Scanner(System.in);
        int choice;
        while(true){
            System.out.println("O que deseja fazer ?\n");
            System.out.println("1 - Acelerar\n2 - Frear\n3 - Trocar de marcha (perigoso)\n4 - Ligar o carro\n5 - Desligar o carro\n6 - Ligar o turbão\n7 - Reduzir a potência\n8 - Sair");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    if(Fuscao.motor.isLigado() == false){
                        System.out.println("Primeiro você liga o carro né bobão");
                        break;
                    }else {
                        if(Fuscao.motor.getMarchaAtual() == "Neutro") {
                            System.out.println("O carro está na marcha neutra!\nTroque a marcha primeiro.");
                            break;
                        }
                        else {
                            Fuscao.acionarAcelerador(1000);
                            break;
                        }
                    }
                case 2:
                    Fuscao.acionarFreio(1000);
                    break;
                case 3:
                    if(Fuscao.motor.isLigado() == false){
                        System.out.println("Primeiro você liga o carro né bobão");
                    }else {
                        Fuscao.motor.trocarMarcha();
                    }
                    break;
                case 4:
                    Fuscao.ligarCarro();
                    break;
                case 5:
                    Fuscao.desligarCarro();
                    break;
                case 6:
                    if(Fuscao.motor.isLigado() == true){
                        System.out.println("O carro ta ligado seu loco, vai turbinar com ele ligado ? NÃO NÉ");
                    }else{
                        Fuscao.turboBoost(15);
                    }
                    break;
                case 7:
                    if(Fuscao.motor.isLigado() == true){
                        System.out.println("O carro ta ligado seu loco, vai modificar ele como");
                    }else {
                        Fuscao.reduzirPotenciaMotor(15);
                    }
                    break;
                case 8:
                    System.out.println("Saindo...");
                    System.exit(0);
            }

        }
    }
}