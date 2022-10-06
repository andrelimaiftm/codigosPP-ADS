import java.util.Random;

import factorymethod.fabricas.FabricaBicicleta;
import factorymethod.fabricas.FabricaCarro;
import factorymethod.veiculos.Bicicleta;
import factorymethod.veiculos.Carro;
import factorymethod.veiculos.Veiculo;

public class Principal {

    public static void main(String[] args) {

        /*Veiculo v1 = new Carro("Fusca");
        v1.embarqueCliente("Pedro");
        v1.parada();

        Veiculo v2 = new Carro("Celta");
        v2.embarqueCliente("Maria");
        v2.parada();*/
        
        /*FabricaCarro fc = new FabricaCarro();
        FabricaBicicleta fb = new FabricaBicicleta();

        Carro v1 = (Carro) fc.pegaVeiculo("Fusca");
        v1.embarqueCliente("Pedro");
        v1.parada();

        Carro v2 = (Carro) fc.pegaVeiculo("Celta");
        v2.embarqueCliente("Maria");
        v2.parada();

        Bicicleta bicicleta = (Bicicleta) fb.pegaVeiculo("Bicicleta");
        bicicleta.embarqueCliente("Joana");
        bicicleta.parada();*/

        String[] vetorClientes = {"Ana", "Maria", "Pedro", "Joao"};

        for (int i = 0; i < 10; i++) {
            Veiculo v = algoritmoVeiculoAleatorio();
            String nomeCliente = vetorClientes[geraNumeroAleatorio(4)];
            v.embarqueCliente(nomeCliente);
            v.parada();
            System.out.println();
        }       

    }

    public  static Veiculo algoritmoVeiculoAleatorio(){

        FabricaCarro fc = new FabricaCarro();
        FabricaBicicleta fb = new FabricaBicicleta();

        Carro v1 = (Carro) fc.pegaVeiculo("Fusca Verde Neon");
        Carro v2 = (Carro) fc.pegaVeiculo("Celta Preto");
        Bicicleta bicicleta = (Bicicleta) fb.pegaVeiculo("Caloi Estradeira");        

        Veiculo[] vetor = {v1, v2, bicicleta};

        int indiceVetor = geraNumeroAleatorio(3);
        return vetor[indiceVetor];
    }

    public static int geraNumeroAleatorio(int limite){
        Random rand = new Random();
        return rand.nextInt(limite);
    }
}
