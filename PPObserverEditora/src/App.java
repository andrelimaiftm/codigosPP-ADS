import objetosconcretos.AssinaturaRevista;
import objetosconcretos.Cliente;
import objetosconcretos.Revista;

public class App {
    public static void main(String[] args) throws Exception {
        
        Revista revista1 = new Revista(
            "Java Magazine",
             15,
              "Java mudará o mundo");

        Revista revista2 = new Revista(
            "Pequenas empresas grandes negocios",
             1,
              "Franquinha da kopenhagen, enriqueça com apenas uma franquia");

        Cliente c1 = new Cliente("André");
        Cliente c2 = new Cliente("Maria");

        //observavel concreto
        AssinaturaRevista assinatura = new AssinaturaRevista();
        
        //adicionado os objetos observadores
        assinatura.adicionar(c1);
        assinatura.adicionar(c2);

        //atualizando o objeto revista
        assinatura.setRevista(revista1);

        //observalvel concreto notifica todos os ser observadores
        assinatura.notificar();

        //imprimindo o objeto cliente para verificar se objeto revista foi atualizado
        System.out.println(c1.getRevista());
        System.out.println(c2.getRevista());
        
        //removendo objeto observador da lista de observadores
        assinatura.remover(c1);

        //atualizando o objeto revista novamente 
        assinatura.setRevista(revista2);

        //observalvel concreto notifica todos os ser observadores
        assinatura.notificar();

        //imprimindo o objeto cliente para verificar se objeto revista foi atualizado 
        System.out.println(c1.getRevista());
        System.out.println(c2.getRevista());
    }
}
