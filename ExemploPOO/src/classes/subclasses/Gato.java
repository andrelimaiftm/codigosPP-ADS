package classes.subclasses;
import classes.superclasse.Animal;
import interfaces.QuatroPatas;
import interfaces.RespiradoresOxigenio;

public class Gato extends Animal implements QuatroPatas, RespiradoresOxigenio {

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

    @Override
    public void tomarBanho() {
        System.out.println("labendo o pelo");
        
    }

    @Override
    public void respirar() {
        System.out.println(this.nome + " está respirando.");
        
    }

    @Override
    public void correr(String destino) {
        System.out.println(this.nome + " está correndo "+ destino);
        
    } 

    
    
}
