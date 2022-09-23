package interfaces;

import java.util.List;

//interface observer
public interface Observavel {

    //subcribe
    public void adicionar(List<Observador> observadores);
    //unsubcribe
    public void remover(Observador o);
    //notify
    public void notificar();

    
}
