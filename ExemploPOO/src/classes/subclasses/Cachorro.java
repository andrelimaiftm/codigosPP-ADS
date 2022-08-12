package classes.subclasses;
import classes.superclasse.Animal;

public class Cachorro  extends Animal{

    private Humano melhorAmigo;

    public Cachorro(String nome, char genero, Integer idade, Double peso, String color) {
        super(nome, genero, idade, peso, color);
    }    
    
}
