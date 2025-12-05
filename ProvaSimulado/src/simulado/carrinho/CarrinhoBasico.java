package simulado.carrinho;

import simulado.Carrinho;
import simulado.Item;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoBasico implements Carrinho {
    private List<Item> itens;

    public CarrinhoBasico(){
        this.itens = new ArrayList<>();
    }


    @Override
    public void adicionar(Item item) {
        this.itens.add(item);
    }

    @Override
    public List<Item> itens() {
        return itens;
    }

    @Override
    public double total() {
        double total = 0;

        for(Item item : this.itens){
            total += item.subTotal();
        }

        return total;
    }

    public int quantidadeDeItens(){
        int quantidade = 0;
        for(Item item : this.itens){
            quantidade += item.quantidade();
        }
        return quantidade;
    }
}
