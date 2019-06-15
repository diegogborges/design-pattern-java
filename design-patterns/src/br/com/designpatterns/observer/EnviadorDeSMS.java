package br.com.designpatterns.observer;

public class EnviadorDeSMS implements AcaoAposGerarNota {
    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("enviei por SMS");
    }
}
