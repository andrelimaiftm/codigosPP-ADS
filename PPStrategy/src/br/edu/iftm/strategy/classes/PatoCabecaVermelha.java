package br.edu.iftm.strategy.classes;

public class PatoCabecaVermelha extends Pato{

    public PatoCabecaVermelha(){        
        setComportamentoFly(new FlyComAssas());        
        setComportamentoQuack(new Quack());
    }

    @Override
    public void exibir() {
        System.out.println("Eu sou o verdadeiro Pato da cabeça vermelha");
        
    }
   

    
    
}
