package produto;

public class Camiseta implements Produto{

    private String nome = "Camiseta";
    private Double preco = 49.90;

    @Override
    public String retornaNome() {        
        return this.nome;
    }

    @Override
    public Double retornaPreco() {        
        return this.preco;
    }
    
}
