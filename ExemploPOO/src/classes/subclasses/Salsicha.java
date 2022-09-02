package classes.subclasses;

import java.util.Date;

import interfaces.Comida;

public class Salsicha implements Comida{

    private int nutriente = 1;
    private String cor = "alaranjando";
    private Date dataValidade = new Date(2022, 8, 30);

    @Override
    public int getNutriente() {        
        return nutriente;
    }

    public void setNutriente(int nutriente) {
        this.nutriente = nutriente;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    
    
}
