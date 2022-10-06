package factorymethod.veiculos;

public class Carro implements Veiculo{

    private String nome;

    public Carro(String nomeCarro){
        this.nome = nomeCarro;
    }

    @Override
    public void embarqueCliente(String nomeCliente) {
        System.out.println(this.nome + " esta buscando " + nomeCliente);
        
    }

    @Override
    public void parada() {
        System.out.println(this.nome + " parou");
        
    }

    @Override
    public String toString() {
        return "Carro [nome=" + nome + "]";
    }    
    
}
