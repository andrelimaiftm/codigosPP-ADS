package classes.subclasses;

import java.util.Date;

import interfaces.Comida;

@SuppressWarnings("all")
public class Racao implements Comida{

    private int nutriente = 15;
    private String cor = "marrom";
    private Date dataValidade = new Date(2023, 8, 26);


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
