package br.com.designpatterns.chainofresponsibility;

public interface Desconto {

    double desconta(Orcamento orcamento);
    void setProximo(Desconto proximo);

}
