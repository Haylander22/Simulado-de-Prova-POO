package simulado;

import java.util.List;

public interface Carrinho {
    void adicionar(Item item);
    List<Item> itens();
    double total();
    int quantidadeDeItens();
}
