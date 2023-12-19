public class Cliente {

    private String nome;
    private int cep;
    private double cpf;

    

    public Cliente(String nome, int cep, double cpf) {
        this.nome = nome;
        this.cep = cep;
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCep() {
        return cep;
    }
    public void setCep(int cep) {
        this.cep = cep;
    }
    public double getCpf() {
        return cpf;
    }
    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    
}
