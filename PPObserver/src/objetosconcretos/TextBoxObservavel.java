package objetosconcretos;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextField;

import interfaces.Observador;
import interfaces.Observavel;

//ConcreteObservable
public class TextBoxObservavel implements Observavel {

    private List<Observador> observadores = new ArrayList<>();
    private JTextField conteudoJTextField;

    @Override
    public void adicionar(List<Observador> obs) {
        for (Observador o : obs) {
            if(!this.observadores.contains(o)){
                this.observadores.add(o);
            }
        }        
    }

    @Override
    public void notificar() {
        for (Observador o : observadores) {
            o.atualizar(this);
        }        
    }

    @Override
    public void remover(Observador o) {
        if(this.observadores.contains(o)){
            this.observadores.remove(o);
        }        
    }

    public JTextField getConteudoJTextField() {
        return conteudoJTextField;
    }

    public void setConteudoJTextField(JTextField conteudoJTextField) {
        this.conteudoJTextField = conteudoJTextField;
    }
}
