package example;

import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Serializable
{	static Scanner scanner = new Scanner(System.in);

    private List<Produto> produtos;

    public Pedido(Cliente cliente)
    {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto)
    {
        produtos.add(produto);
    }

    @SuppressWarnings("unlikely-arg-type")
    public void adicionarProduto(Produto produto, int quantidade)
    {
        for (int i = 0; i < quantidade; i++)
        {
            produtos.add(produto);
        }
    }
    String p1= "Pão Francês";
    String p2 = "Pão Integral";
    String p3 = "Pão de Forma";
    String p4 = "Bolacha Praieira Doce";
    String p5 = "Praieira Salgada";
    String p6 = "Bolacha Tareco";
    int cont1=0;
    int cont2=0;
    int cont3=0;
    int cont4=0;
    int cont5=0;
    int cont6=0;


    public int conta1() {
        cont1 = 0;
        for (Produto x1 : produtos) {
            if (x1.getNome().equals(p1)) {
                cont1++;
            }
        }
        return cont1;
    }

    public int conta2() {
        cont2 = 0;
        for (Produto x2 : produtos) {
            if (x2.getNome().equals(p2)) {
                cont2++;
            }
        }
        return cont2;
    }

    public int conta3() {
        cont3 = 0;
        for (Produto x3 : produtos) {
            if (x3.getNome().equals(p3)) {
                cont3++;
            }
        }
        return cont3;
    }

    public int conta4() {
        cont4 = 0;
        for (Produto x4 : produtos) {
            if (x4.getNome().equals(p4)) {
                cont4++;
            }
        }
        return cont4;
    }

    public int conta5() {
        cont5 = 0;
        for (Produto x5 : produtos) {
            if (x5.getNome().equals(p5)) {
                cont5++;
            }
        }
        return cont5;
    }

    public int conta6() {
        cont6 = 0;
        for (Produto x6 : produtos) {
            if (x6.getNome().equals(p6)) {
                cont6++;
            }
        }
        return cont6;
    }

    public int quantidade() {
        int qtd= scanner.nextInt();
        return qtd;
    }

    public List<Produto> getProdutos()
    {
        return produtos;
    }

    public void compra() {
        System.out.println("Pão francês: " +conta1() );
        System.out.println("Pão integral: " +conta2() );
        System.out.println("Pão de forma: " +conta3() );
        System.out.println("Praeira doce: " +conta4() );
        System.out.println("Praeira salgada: " +conta5() );
        System.out.println("Tareco: " +conta6() );
    }


    public double calcularTotal()
    {
        double total = 0;
        for (Produto produto : produtos)
        {
            total += produto.getPreco();
        }
        return total;
    }

}

