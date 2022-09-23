package br.edu.iftm.strategy.classes;

public class PatoBorracha extends Pato{

    public PatoBorracha(){
        setComportamentoFly(new NaoFlyDeJeitoNenhum());
        setComportamentoQuack(new Squeack());
    }

    @Override
    public void exibir() {
        System.out.println("Eu sou o patro de borracha");
        
    }   
    
}
