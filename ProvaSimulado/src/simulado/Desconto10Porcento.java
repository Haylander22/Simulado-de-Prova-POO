package simulado;

public class Desconto10Porcento implements Desconto{
    private Carrinho carrinho;

    @Override
    public double desconto(Carrinho c) {
        double desconto;
            desconto = c.total() * 0.10;
        return desconto;
    }
}
