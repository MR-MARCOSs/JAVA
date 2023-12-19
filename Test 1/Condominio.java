import java.util.ArrayList;

public class Condominio {
    private ArrayList<Integer> disponiveis = new ArrayList<Integer>();
    private ArrayList<Locatario> naoDisponiveis = new ArrayList<Locatario>();
    private Locatario locatario;
    private Acompanhantes acompanhantes;


    public ArrayList<Integer> getDisponiveis() {
        return disponiveis;
    }
    public void setDisponiveis(ArrayList<Integer> disponiveis) {
        this.disponiveis = disponiveis;
    }
    public Locatario getLocatario() {
        return locatario;
    }
    public void setLocatario(Locatario locatario) {
        this.locatario = locatario;
    }
    public Acompanhantes getAcompanhantes() {
        return acompanhantes;
    }
    public void setAcompanhantes(Acompanhantes acompanhantes) {
        this.acompanhantes = acompanhantes;
    }

    public void addLocatario(Locatario locatario) {
        naoDisponiveis.add(locatario);
    }

    

    public Locatario puxarDados(int valor) {
        
        Locatario obterDados = naoDisponiveis.get(valor);
        int apto = obterDados.getApto();
        String nome = obterDados.getNome();
        Double cpf = obterDados.getCpf();
        Double rg = obterDados.getRg();
        return obterDados;
        

        
    }
    public ArrayList<Locatario> getNaoDisponiveis() {
        return naoDisponiveis;
    }
    public void setNaoDisponiveis(ArrayList<Locatario> naoDisponiveis) {
        this.naoDisponiveis = naoDisponiveis;
    }
    public void teste(){
        for (Locatario Locatario : naoDisponiveis)
        System.out.println(Locatario.getApto());
    }



    
    
    
}
