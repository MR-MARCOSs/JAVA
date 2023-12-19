public class Produto {
    private String nomeProduto;
    private float valor;
    public String getNomeProduto() {
        return nomeProduto;
    }
    public Produto(String nomeProduto, float valor) {
        this.nomeProduto = nomeProduto;
        this.valor = valor;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    
}
