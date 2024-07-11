package example;

public class Pao extends Produto
{
    private String tipo;

    public Pao(String nome, double preco, String tipo)
    {
        super(nome, preco);
        this.tipo = tipo;
    }

    @Override
    public String obterDescricao()
    {
        return getNome() + " (" + tipo + ") custa R$" + String.format("%.2f", getPreco());
    }
}

