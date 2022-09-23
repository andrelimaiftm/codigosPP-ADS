package objetosconcretos;


import javax.swing.JLabel;

import interfaces.Observador;
import interfaces.Observavel;

//ConcreteObserver
public class LabelObservador implements Observador{

    private JLabel conteudoLabel = new JLabel();

    @Override
    public void atualizar(Observavel observavel) {
        if(observavel instanceof TextBoxObservavel){
            this.conteudoLabel.setText(
                ((TextBoxObservavel) observavel).getConteudoJTextField().getText()
            );
        }        
    }

    public JLabel getConteudoLabel() {
        return conteudoLabel;
    }

    public void setConteudoLabel(JLabel conteudoLabel) {
        this.conteudoLabel = conteudoLabel;
    }   
    
}
