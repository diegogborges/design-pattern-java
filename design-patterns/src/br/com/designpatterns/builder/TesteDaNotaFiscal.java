package br.com.designpatterns.builder;

public class TesteDaNotaFiscal {

    public static void main(String[] args) {

        NotaFiscalBuilder builder = new NotaFiscalBuilder();

        // Estilo de programação interfaces fluentes e Method chaining

        builder.paraEmpresa("Empresa teste")
        .comCnpj("12.222.000/0001-12")
        .comItem(new ItemDaNota("item 1", 200.0))
        .comItem(new ItemDaNota("item 2", 250.0))
        .comItem(new ItemDaNota("item 3", 300.0))
        .comObservacoes("observações")
        .naDataAtual();

        NotaFiscal nf = builder.constroi();

        System.out.println(nf.getValorBruto());
    }

}
