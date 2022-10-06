package factorymethod.fabricas;

import factorymethod.veiculos.Veiculo;

//Creator
public abstract class FabricaVeiculos {

    /*public Veiculo pegaVeiculo(String nomeVeiculo){
        if(nomeVeiculo.equals("Fusca")){
            return new Carro("Fusca");
        }
        return null;
    }*/

    //metodo fabrica
    public abstract Veiculo pegaVeiculo(String nomeVeiculo);

    public Veiculo embarqueCliente(String nomeCliente, String nomeVeiculo){
        Veiculo carro = this.pegaVeiculo(nomeVeiculo);
        carro.embarqueCliente(nomeCliente);
        return carro;

    }
    
}
