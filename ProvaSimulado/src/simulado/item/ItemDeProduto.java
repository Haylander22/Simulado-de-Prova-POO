package simulado.item;

import simulado.Item;
import simulado.Produto;

public class ItemDeProduto implements Item {
    private Produto produto;
    private int quantidade;

    public ItemDeProduto(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }


    @Override
    public int quantidade() {
        return quantidade;
    }

    @Override
    public double subTotal() {
        double subTotal = this.produto.preco() * this.quantidade;
        return subTotal;
    }
}
