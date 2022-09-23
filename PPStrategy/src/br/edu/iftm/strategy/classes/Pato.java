package br.edu.iftm.strategy.classes;

import br.edu.iftm.strategy.interfaces.ComportamentoQuack;
import br.edu.iftm.strategy.interfaces.ComportamentoVoo;

public abstract class Pato {

    ComportamentoQuack comportamentoQuack;
    ComportamentoVoo comportamentoFly;

    public Pato(){}  

    public void setComportamentoQuack(ComportamentoQuack comportamentoQuack) {
        this.comportamentoQuack = comportamentoQuack;
    }

    public void setComportamentoFly(ComportamentoVoo comportamentoFly) {
        this.comportamentoFly = comportamentoFly;
    }

    public  void performaceQuack(){
        this.comportamentoQuack.quack();
    }

    public void performaceFly(){
        this.comportamentoFly.fly();
    }

    public abstract void exibir();

    public void nadar(){
        System.out.println("Todos os patos usam o surf!!!");
    }
    
}
