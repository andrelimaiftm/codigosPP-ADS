import java.util.List;

public class Pedido {

    private List<Item> itens;
    private String pais;
    private String estado;
    private String cidade;
    private CaculadorTaxa taxaCal;

    public double obterTotalPedido(){
        double total = 0;

        for (Item item : itens) {
            double subtotal = item.getPreco() * item.getQuantidade();
            total += subtotal * taxaCal.obterTaxaImposto(
                pais,estado, item.getProduto());
        }
        return total;

    }


    public List<Item> getItens() {
        return itens;
    }

    public String getPais() {
        return pais;
    }   

}
