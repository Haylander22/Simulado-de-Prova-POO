package simulado;

import simulado.carrinho.CarrinhoBasico;
import simulado.carrinho.CarrinhoComDesconto;
import simulado.item.ItemDeProduto;
import simulado.produto.ProdutoBasico;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {
        Produto skol = new ProdutoBasico("Skol","123",5);
        Produto pepsi = new ProdutoBasico("Pepsi","123",7);
        Item itemCarrinho = new ItemDeProduto(skol,20);
        Item itemCarrinho2 = new ItemDeProduto(pepsi,2);



        Carrinho carrinho = new CarrinhoBasico();
        carrinho.adicionar(itemCarrinho);
        carrinho.adicionar(itemCarrinho2);

        Carrinho carrinhoDesconto = new CarrinhoComDesconto(carrinho, new Desconto10Itens());


        System.out.println("Subtotal: "+itemCarrinho.subTotal());
        System.out.println(carrinhoDesconto.itens().size());
        System.out.println(carrinhoDesconto.total());

    }
}