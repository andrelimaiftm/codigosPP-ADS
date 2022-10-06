package exemplofabrica;

public class Carro {

    private String modelo;
    private String cor;
    private Double preço;

    public Carro(){
        
    }

    public Carro(String modelo, String cor, double preco) {
        this.modelo = modelo;
        this.cor = cor;
        this.preço = preco;
    }

    public Carro fabricaCarro(String modelo, String cor, double preco){
        Carro c = new Carro(modelo, cor, preco);
        return c;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getPreço() {
        return preço;
    }

    public void setPreço(Double preço) {
        this.preço = preço;
    }

    @Override
    public String toString() {
        return "Carro [modelo=" + modelo + ", cor=" + cor + ", preço=" + preço + "]";
    }

    
    public static void main(String[] args) {

        Carro carro = new Carro();

        Carro c1 = carro.fabricaCarro("Fusca", "preto", 40000.00);
        Carro c2 = carro.fabricaCarro("Celta", "vermelho", 40000.00);
        Carro c3 = carro.fabricaCarro("A4", "branco", 200000.00);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }  
}
