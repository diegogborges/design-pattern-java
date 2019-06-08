package br.com.designpatterns.strategy;

public class TesteDeImpostos {

    public static void main(String[] args) {

        Imposto iss = new ISS();
        Imposto icms = new ICMS();

        Orcamento orcamento = new Orcamento(500.0);

        CalcularDeImpostos calc = new CalcularDeImpostos();
        calc.realizarCalculo(orcamento, iss);
        calc.realizarCalculo(orcamento, icms);

    }

}
