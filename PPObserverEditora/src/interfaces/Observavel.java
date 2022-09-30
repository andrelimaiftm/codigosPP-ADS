package interfaces;

//interface observable
public interface Observavel {

    //subcribe
    public void adicionar( Observador observador);
    //unsubcribe
    public void remover(Observador o);
    //notify
    public void notificar();

    
}
