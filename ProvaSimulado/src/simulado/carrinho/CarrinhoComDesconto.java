package simulado.carrinho;

import simulado.Carrinho;
import simulado.Desconto;
import simulado.Item;

import java.util.List;

public class CarrinhoComDesconto implements Carrinho {
    private Desconto desconto;
    private Carrinho carrinhoBasico;

    public CarrinhoComDesconto(Carrinho carrinhoBasico, Desconto desconto){
        this.desconto = desconto;
        this.carrinhoBasico = carrinhoBasico;
    }

    @Override
    public void adicionar(Item item) {
        carrinhoBasico.adicionar(item);
    }

    @Override
    public List<Item> itens() {
        return carrinhoBasico.itens();
    }

    @Override
    public double total() {
        return this.desconto.desconto(carrinhoBasico);
    }

    @Override
    public int quantidadeDeItens() {
        return carrinhoBasico.quantidadeDeItens();
    }
}
