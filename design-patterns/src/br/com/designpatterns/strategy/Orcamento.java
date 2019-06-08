package br.com.designpatterns.strategy;

import br.com.designpatterns.chainofresponsibility.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

    private final double valor;
    private final List<Item> itens;

    public Orcamento(double valor) {
        this.valor = valor;
        this.itens = new ArrayList<Item>();
    }

    public double getValor() {
        return valor;
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

}
