public class App {
    public static void main(String[] args) throws Exception {
        
        //vamos criar um novo retangulo
        Retangulo r = new Retangulo();
        Quadrado q = new Quadrado();

        //definindo a largura e altura do retangulo   
         r.setLargura(5);
         r.setAltura(10);

         q.setAltura(10);
         q.setLargura(10);
        // o usuário sabe que r é um retângulo
        // e assume que ele pode definir largura e altura
       // como para a classe base(Retangulo)

        System.out.println(r.getArea());
        System.out.println(q.getArea());
    }

    
}
