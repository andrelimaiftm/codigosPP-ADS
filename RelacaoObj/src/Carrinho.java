
public class Carrinho {

    public double obterTotalPedido(Pedido pedido){
        double total = 0;
        for (Item item : pedido.getItens()) {
            total += item.getPreco() + item.getQuantidade();
        }
        total += total * obterTaxaImposto(pedido.getPais());
        return total;
    }

    public double obterTaxaImposto(String pais){
        if(pais.equals("US")){
            return 0.07;
        }else if(pais.equals("EU")){
            return 0.20;
        }else{
            return 0;
        }
    }

    
    
}
