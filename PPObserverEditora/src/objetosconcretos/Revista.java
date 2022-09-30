package objetosconcretos;

public class Revista {

    private String nome;
    private int edicao;
    private String resumo;    

    public Revista() {
    }

    public Revista(String nome, int edicao, String resumo) {
        this.nome = nome;
        this.edicao = edicao;
        this.resumo = resumo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    @Override
    public String toString() {
        return "Revista [nome=" + nome + ", edicao=" + edicao + ", resumo=" + resumo + "]";
    }

    

    
    

    
}
