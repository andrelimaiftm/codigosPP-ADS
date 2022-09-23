package br.edu.iftm.strategy.classes;

public class PatoSelvagem extends Pato{

    public PatoSelvagem(){
        setComportamentoFly(new FlyComAssas());
        setComportamentoQuack(new Quack());
    }

    @Override
    public void exibir() {
        System.out.println("Eu sou verdadeiro Pato Selvagem");
        
    }   
    
}
