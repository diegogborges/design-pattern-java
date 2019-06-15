package br.com.designpatterns.observer;

public class TesteAcoes {

    public static void main(String[] args) {
        NotaFiscalBuilder builder = new NotaFiscalBuilder();
        builder.adicionaAcao(new EnviadorDeEmail());
        builder.adicionaAcao(new EnviadorDeSMS());
        builder.adicionaAcao(new NotaFiscalDAO());
        builder.adicionaAcao(new Impressora());

        NotaFiscal nf = builder.paraEmpresa("Empresa teste")
                .comCnpj("12.222.000/0001-12")
                .comItem(new ItemDaNota("item 1", 200.0))
                .comItem(new ItemDaNota("item 2", 250.0))
                .comItem(new ItemDaNota("item 3", 300.0))
                .comObservacoes("observações")
                .naDataAtual().constroi();

        System.out.println(nf.getValorBruto());
    }

}
