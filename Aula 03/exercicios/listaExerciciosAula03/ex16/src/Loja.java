// 16 - Crie uma classe Loja com atributos nome, endereco, e telefone. Adicione métodos para abrir e fechar a loja.
public class Loja {
    private String nome;
    private String endereco;
    private String telefone;

    public Loja(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
            System.out.println("Nome da loja alterado para: " + nome);
        } else {
            System.out.println("Nome inválido.");
        }

    }

    public void setEndereco(String endereco) {
        if (endereco != null && !endereco.trim().isEmpty()) {
            this.endereco = endereco;
            System.out.println("Endereço da loja alterado para: " + endereco);
        } else {
            System.out.println("Endereço inválido.");
        }
    }

    public void setTelefone(String telefone) {
        if (telefone != null && !telefone.trim().isEmpty()) {
            this.telefone = telefone;
            System.out.println("Telefone da loja alterado para: " + telefone);
        } else {
            System.out.println("Telefone inválido.");
        }
    }

    public int abrirLoja(int status) {
        if (status == 0) {
            status = 1;
            System.out.println("Você abriu a loja!");
        } else {
            System.out.println("A loja já está aberta!");
        }
        return status;
    }

    public int fecharLoja(int status) {
        if (status == 0) {
            status = 1;
            System.out.println("Você fechou a loja!");
        } else {
            System.out.println("A loja já está fechada!");
        }
        return status;
    }
}