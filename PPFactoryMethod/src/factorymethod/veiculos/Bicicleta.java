package factorymethod.veiculos;

public class Bicicleta  implements Veiculo{

    private String nome;

    public Bicicleta(String nomeBicicleta){
        this.nome = nomeBicicleta;
    }

    @Override
    public void embarqueCliente(String nomeCliente) {
        System.out.println(this.nome + " esta procurando o cliente " + nomeCliente);
        
    }

    @Override
    public void parada() {
        System.out.println(this.nome + " parou");
        
    } 
    
    
}
