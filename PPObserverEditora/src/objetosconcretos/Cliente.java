package objetosconcretos;

import interfaces.Observador;
import interfaces.Observavel;

public class Cliente implements Observador {

    private String nome;

    private Revista revista = new Revista();

    public Cliente(String nome){
        this.nome = nome;
    }

    @Override
    public void atualizar(Observavel observavel) {
        //if (observavel instanceof AssinaturaRevista) {
            AssinaturaRevista assinatura = (AssinaturaRevista) observavel;
            this.revista = assinatura.getRevista();
        //}

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Revista getRevista() {
        return revista;
    }

    public void setRevista(Revista revista) {
        this.revista = revista;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", revista=" + revista + "]";
    }

    

}
