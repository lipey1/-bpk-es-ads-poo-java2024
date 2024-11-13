public class Empresa {
    private String nome;
    private String CNPJ;
    private int numeroFuncionarios;

    public Empresa(String nome, String CNPJ, int numeroFuncionarios) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public String getNome() {
        return nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setCNPJ(String cnpj) {
        if(cnpj != null && !cnpj.trim().isEmpty()){
            this.CNPJ = cnpj;
            System.out.println("\nCNPJ alterado para: " + cnpj);
        }else {
            System.out.println("\nCNPJ inválido.");
        }
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
            System.out.println("\nNome da empresa alterado para: " + nome);
        } else {
            System.out.println("\nNome inválido.");
        }
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        if (numeroFuncionarios >= 0) {
            this.numeroFuncionarios = numeroFuncionarios;
            System.out.println("\nNúmero de funcionários alterado para: " + numeroFuncionarios + " funcionários.");
        } else {
            System.out.println("\nNúmero inválido de funcionários.");
        }
    }

    public void contratarFuncionario(int quantidade) {
        if (quantidade > 0) {
            numeroFuncionarios += quantidade;
            System.out.println("\nForam contratados " + quantidade + " funcionários. Total de funcionários: "
                    + numeroFuncionarios);
        } else {
            System.out.println("\nNúmero inválido de funcionários para contratar.");
        }
    }

    public void demitirFuncionario(int quantidade) {
        if (quantidade > 0 && quantidade <= numeroFuncionarios) {
            numeroFuncionarios -= quantidade;
            System.out.println(
                    "\nForam demitidos " + quantidade + " funcionários. Total de funcionários: " + numeroFuncionarios);
        } else {
            System.out.println("\nNúmero inválido de funcionários para demitir.");
        }
    }
}
