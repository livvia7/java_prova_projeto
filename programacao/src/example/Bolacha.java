package example;

public class Bolacha extends Produto {
    private String sabor;

    public Bolacha(String nome, double preco, String sabor) {
        super(nome, preco);
        this.sabor = sabor;
    }

    @Override
    public String obterDescricao() {
        return getNome() + " (" + sabor + ") custa R$" + String.format("%.2f", getPreco());
    }
}
