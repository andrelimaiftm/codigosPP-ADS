public class Retangulo {

    protected int largura;
    protected int altura;

    public int getLargura() {
        return largura;
    }
    public final void setLargura(int largura) {
        this.largura = largura;
    }
    public int getAltura() {
        return altura;
    }
    public final void setAltura(int altura) {
        this.altura = altura;
    }

    public int getArea(){
        return altura*largura;
    }
    
    
}
