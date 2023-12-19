import java.util.ArrayList;

public class Locatario {
    private int apto;
    private String nome;
    private double rg;
    private double cpf;
    private double cep;
    private double telefone;
    private String email;
    private ArrayList<Acompanhantes> listaAc = new ArrayList<Acompanhantes>();
    


    


    public int getApto() {
        return apto;
    }
    public void setApto(int apto) {
        this.apto = apto;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getRg() {
        return rg;
    }
    public void setRg(double rg) {
        this.rg = rg;
    }
    public double getCpf() {
        return cpf;
    }
    public void setCpf(double cpf) {
        this.cpf = cpf;
    }
    public double getCep() {
        return cep;
    }
    public void setCep(double cep) {
        this.cep = cep;
    }
    public double getTelefone() {
        return telefone;
    }
    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public ArrayList<Acompanhantes> getListaAc() {
        return listaAc;
    }
    public void setListaAc(ArrayList<Acompanhantes> listaAc) {
        this.listaAc = listaAc;
    }

    public void addAc(Acompanhantes acompanhante){
        listaAc.add(acompanhante);
    }

    public Acompanhantes puxarDadosAc(int valor) {
        Acompanhantes obterDadosAc = listaAc.get(valor);
        String nome = obterDadosAc.getNomeAc();
        String cpf = obterDadosAc.getParentesco();
        Double rg = obterDadosAc.getRgAc();
        return obterDadosAc;
    }







    
    
}
