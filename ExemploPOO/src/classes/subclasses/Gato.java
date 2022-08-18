package classes.subclasses;
import classes.superclasse.Animal;

public class Gato extends Animal {

    private Boolean estaMalHumorado;

    public Gato(){}

    public Gato(String nome, char genero, 
        Integer idade, Double peso, String color,
         Boolean estaMalHumorado) {
        super(nome, genero, idade, peso, color);
        this.estaMalHumorado = estaMalHumorado;
    }
    
    public void miar(){
        System.out.println("Mrrrrow! meeaOOOW… RaaaAAAAH!");
    }

    public Boolean getEstaMalHumorado() {
        return estaMalHumorado;
    }

    public void setEstaMalHumorado(Boolean estaMalHumorado) {
        this.estaMalHumorado = estaMalHumorado;
    }

    @Override
    public void emitirsom() {
        miar();
        
    }

    
    
}
