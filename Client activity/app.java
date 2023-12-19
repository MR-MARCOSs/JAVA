import java.util.ArrayList;

public class app {
    public static void main(String[] args) {
        
        Produto coca = new Produto("coca", 8);
        Produto salgado = new Produto("Coxinha", 4);
        
        Pedido pedido1 = new Pedido();
        pedido1.adi(3, coca);
        pedido1.adi(1, salgado);

        pedido1.setCliente(new Cliente("Juan", 0, 0));

        float preco = pedido1.total();
         
        ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
        pedidos.add(pedido1);

        for(int i=0; i<pedidos.size(); i++) {
            System.out.println(pedidos);
            Pedido p = (Pedido) pedidos.get(i);
            
            System.out.println("O pedido do " + p.getCliente().getNome() + " deu R$" + preco + "");


        }
        


    }
}
