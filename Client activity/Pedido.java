import java.util.ArrayList;

public class Pedido {
    private Cliente cliente;
    private String data,itens;
    private int quant;
    private ArrayList<Produto> produto = new ArrayList<Produto>();

    public ArrayList getProduto(){
        return produto;
    }

    public void setProduto(ArrayList<Produto> produto) {
        this.produto = produto;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getItens() {
        return itens;
    }

    public void setItens(String itens) {
        this.itens = itens;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public void adi(int getQuant, Produto Produto) {
        for (int v=0; v<getQuant; v++){
            produto.add(Produto);
        }
    }

    /*public float total(int getQuant, float getValor) {
        float soma=0;
        for (Produto Produto:produto){
            
            float mult = getQuant*getValor;
            soma=soma+mult;
        }
        System.out.println(getProduto());
        return getQuant*getValor;
    }*/

        public float total() {
        float soma=0;
        for (Produto Produto:produto){
            
            float mult = Produto.getValor();
            soma=soma+mult;
        }
        System.out.println(getProduto());
        return soma;
    } 





    

}
