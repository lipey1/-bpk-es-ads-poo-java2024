// 6 - Crie uma classe Computador com atributos como processador, memoriaRAM, e armazenamento. Adicione métodos para ligar e desligar o computador.
public class Computador {
    private String processador;
    private int storage;
    private int memoriaRAM;

    public Computador(String processador, int memoriaRAM, int storage) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.storage = storage;
    }
    public int ligar(int status){
        if(status == 0){
            System.out.println("Você ligou o computador!");
            status = 1;
        } else {
            System.out.println("O computador já está ligado!");   
        }
        return status;
    }

    public int desligar(int status){
        if (status != 0){
            System.out.println("Você desligou o computador!");
            status = 0;
        } else {
            System.out.println("O computador já está desligado!");
        }
        return status;
    }

    public void setRam(int ram){
        if(ram < 0 || ram > 500 || ram % 2 != 0){
            System.out.println("Insira um valor válido.");
        } else {
            this.memoriaRAM = ram;
            System.out.println("Memória RAM alterada para: " + ram + " GB");
        }
    }

    public void setStorage(int storage){
        if(storage <= 0){
            System.out.println("Lembre-se que a medida é em Gigabytes, Tente novamente!");
        } else {
            this.storage = storage;
            System.out.println("Armazenamento alterado para: " + storage);
        }
    }

    public void setCpu(String cpu){
        if(cpu != null && !cpu.trim().isEmpty()){
            this.processador = cpu;
            System.out.println("Processador alterado para: " + cpu);
        } else {
            System.out.println("Processador inválido.");
        }
    }

    public String getCpu(){
        return processador;
    }
    public int getStorage(){
        return storage;
    }
    public int getMemoriaRAM(){
        return memoriaRAM;
    }
}