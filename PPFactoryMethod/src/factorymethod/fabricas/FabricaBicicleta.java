package factorymethod.fabricas;

import factorymethod.veiculos.Bicicleta;
import factorymethod.veiculos.Veiculo;

public class FabricaBicicleta extends FabricaVeiculos{

    @Override
    public Veiculo pegaVeiculo(String nomeVeiculo) {
        return new Bicicleta(nomeVeiculo);
    }
    
}
