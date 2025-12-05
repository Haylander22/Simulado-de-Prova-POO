package simulado.produto;

import simulado.Produto;

public class ProdutoBasico implements Produto {
    private String nome;
    private String id;
    private double preco;

    public ProdutoBasico(String nome, String id, double preco){
        this.nome = nome;
        this.id = id;
        this.preco = preco;
    }

    @Override
    public String nome() {
        return nome;
    }

    @Override
    public String id() {
        return id;
    }

    @Override
    public double preco() {
        return preco;
    }
}
