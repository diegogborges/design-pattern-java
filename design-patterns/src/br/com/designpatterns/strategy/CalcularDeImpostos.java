package br.com.designpatterns.strategy;

public class CalcularDeImpostos {

    public void realizarCalculo(Orcamento orcamento, Imposto imposto) {
        double valor = imposto.calcula(orcamento);
        System.out.println(valor);
    }

}
