import produto.Camiseta;
import produto.EstampaProdutoDecorator;
import produto.ProdutoCustomizadoDecorator;

public class App {
    public static void main(String[] args) throws Exception {
        
        Camiseta c = new Camiseta();
        //ProdutoDecoretor pd = new ProdutoDecoretor(c);
        EstampaProdutoDecorator camisetaEstampada = new EstampaProdutoDecorator(c);
        //EstampaProdutoDecorator camisetaEstampadaPB = new EstampaProdutoDecorator(camisetaEstampada);
        ProdutoCustomizadoDecorator camisetaCustomizada = new ProdutoCustomizadoDecorator(c);
        
        System.out.println(c.retornaPreco());
        System.out.println(c.retornaNome());
        System.out.println(camisetaEstampada.retornaPreco());
        System.out.println(camisetaEstampada.retornaNome());
       // System.out.println(camisetaEstampadaPB.retornaPreco());
       // System.out.println(camisetaEstampadaPB.retornaNome());
       System.out.println(camisetaCustomizada.retornaPreco());
       System.out.println(camisetaCustomizada.retornaNome());
        
    }
}
