package classes.subclasses;
import classes.superclasse.Animal;
import interfaces.QuatroPatas;
import interfaces.RespiradoresOxigenio;

public class Cachorro  extends Animal implements QuatroPatas, RespiradoresOxigenio{

    private Humano melhorAmigo;
    private String raca;

    public Cachorro(String nome, char genero, Integer idade, Double peso, String cor, Humano melhorAmigo, String raca) {
        super(nome, genero, idade, peso, cor);
        this.melhorAmigo = melhorAmigo;
        this.raca = raca;

    }

    public void latir(){
        System.out.println("Au Auuuuuu Au Au");
    }

    public Humano getMelhorAmigo() {
        return melhorAmigo;
    }

    public void setMelhorAmigo(Humano melhorAmigo) {
        this.melhorAmigo = melhorAmigo;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void emitirsom() {
        latir();        
    }

    @Override
    public void tomarBanho() {
        // TODO Auto-generated method stub
        
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
