package produto;

public class EstampaProdutoDecorator extends ProdutoDecoretor{

    public EstampaProdutoDecorator(Produto produto) {
        super(produto);        
    }

    public String retornaNome(){
        return this.produto.retornaNome() + " estampada";
    }

    public Double retornaPreco(){
        return this.produto.retornaPreco() + 10.0;
    }
    
}
