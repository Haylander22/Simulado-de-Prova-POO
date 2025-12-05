package simulado;

import simulado.carrinho.CarrinhoBasico;

public class Desconto10Itens implements Desconto{
    @Override
    public double desconto(Carrinho c) {
        double total = 0;
        if(c.quantidadeDeItens() >= 10){
            total = c.total() * 0.10;
        }else {
            total = c.total();
        }
        return total;
    }
}
