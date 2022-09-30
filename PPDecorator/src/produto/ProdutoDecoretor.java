package produto;

public class ProdutoDecoretor implements Produto {

    protected Produto produto;   

    public ProdutoDecoretor(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String retornaNome() {        
        return this.produto.retornaNome();
    }

    @Override
    public Double retornaPreco() {        
        return this.produto.retornaPreco();
    }
    
}
