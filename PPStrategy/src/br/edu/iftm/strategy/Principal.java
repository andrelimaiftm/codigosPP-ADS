package br.edu.iftm.strategy;

import br.edu.iftm.strategy.classes.PatoBorracha;
import br.edu.iftm.strategy.classes.PatoCabecaVermelha;
import br.edu.iftm.strategy.classes.PatoMadeira;
import br.edu.iftm.strategy.classes.PatoSelvagem;

public class Principal {
    public static void main(String[] args) throws Exception {
        PatoSelvagem selvagem = new PatoSelvagem();
        PatoCabecaVermelha vermelho = new PatoCabecaVermelha();
        PatoMadeira madeira = new PatoMadeira();
        PatoBorracha borracha = new PatoBorracha();

        selvagem.exibir();
        selvagem.performaceQuack();
        selvagem.performaceFly();
        selvagem.nadar();
        System.out.println();
        
        vermelho.exibir();
        vermelho.performaceQuack();
        vermelho.performaceFly();;
        vermelho.nadar();
        System.out.println();

        madeira.exibir();
        madeira.performaceQuack();;
        madeira.performaceFly();;
        madeira.nadar();
        System.out.println();

        borracha.exibir();
        borracha.performaceQuack();;
        borracha.performaceFly();;
        borracha.nadar();
        System.out.println();
    }
}
