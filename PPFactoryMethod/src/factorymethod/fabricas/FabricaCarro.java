package factorymethod.fabricas;

import factorymethod.veiculos.Carro;
import factorymethod.veiculos.Veiculo;

public class FabricaCarro extends FabricaVeiculos {

    @Override
    public Veiculo pegaVeiculo(String nomeVeiculo) {
        return new Carro(nomeVeiculo);
    }

    
    
}
