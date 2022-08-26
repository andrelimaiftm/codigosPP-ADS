

public class CaculadorTaxa {

    public double obterTaxaImposto(String pais, String estado, Produto produto) {
        if(pais.equals("US")){
            return obterTaxaUS();
        }else if(pais.equals("EU")){
            return obterTaxaEU();
        }else if(pais.equals("CH")){
            return obterTaxaChina();
        }else {
            return 0;
        }
    }

    private double obterTaxaUS(){
        return 0.07;
    }

    private double obterTaxaEU(){
        return 0.20;
    }

    private double obterTaxaChina(){
        return 0.35;
    }

}
