package produto;

public class ProdutoCustomizadoDecorator extends ProdutoDecoretor{

    public ProdutoCustomizadoDecorator(Produto produto) {
        super(produto);        
    }

    public String retornaNome(){
        return this.produto.retornaNome() + " customizada";
    }

    public Double retornaPreco(){
        return this.produto.retornaPreco() + 50.0;
    }
    
}
