import classes.subclasses.Cachorro;
import classes.subclasses.Gato;
import classes.subclasses.Humano;
import classes.subclasses.Racao;
import classes.subclasses.Salsicha;

public class App {
    
    public static void main(String[] args) {
        
        Gato g1 = new Gato("Manda Chuva", 'M', 2, 9.0, "",false,5);
        System.out.println(g1.getNome());
        g1.setNome("Batatinha");
        System.out.println(g1.getNome());

        Humano kennes = new Humano("Kennes");

        Cachorro c1 = new Cachorro("Sofi", 'M', 2, 15.0, "zebrada", kennes, "srd");
        g1.miar();
        c1.latir();
        //g1.comer("rato");

        kennes.darCarinho(c1);

        Salsicha s = new Salsicha();
        g1.alimentar(s);
        System.out.println(g1.getEnergia());

        Racao r = new Racao();
        g1.alimentar(r);
        System.out.println(g1.getEnergia());

    }
}
