public class Retangulo {

    protected int largura;
    protected int altura;

    public int getLargura() {
        return largura;
    }
    public void setLargura(int largura) {
        this.largura = largura;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getArea(){
        return altura*largura;
    }
    
    
}
