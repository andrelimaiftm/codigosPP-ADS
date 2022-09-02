package classes.subclasses;
import classes.superclasse.Animal;
import interfaces.Comida;
import interfaces.QuatroPatas;
import interfaces.RespiradoresOxigenio;

public class Gato extends Animal implements QuatroPatas, RespiradoresOxigenio {

    private Boolean estaMalHumorado;

    private int energia;

    public Gato(){}

    public Gato(String nome, char genero, 
        Integer idade, Double peso, String color,
         Boolean estaMalHumorado, int energia) {
        super(nome, genero, idade, peso, color);
        this.estaMalHumorado = estaMalHumorado;
        this.energia = energia;
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
    
    public void alimentar(Comida c){
        this.energia += c.getNutriente();
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }     
}
