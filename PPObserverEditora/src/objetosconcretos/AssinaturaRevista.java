package objetosconcretos;

import java.util.ArrayList;
import java.util.List;

import interfaces.Observador;
import interfaces.Observavel;

public class AssinaturaRevista  implements Observavel{

    private List<Observador> lista = new ArrayList<>();
    private Revista revista = new Revista();

    @Override
    public void adicionar(Observador observador) {
        if(!lista.contains(observador)){
            this.lista.add(observador);
        }
        
    }

    @Override
    public void notificar() {
        for (Observador o : lista) {
            o.atualizar(this);
        }
        
    }

    @Override
    public void remover(Observador o) {
        if(lista.contains(o)){
            lista.remove(o);
        }
        
    }

    public Revista getRevista() {
        return revista;
    }

    public void setRevista(Revista revista) {
        this.revista = revista;
    }

    
    
}
