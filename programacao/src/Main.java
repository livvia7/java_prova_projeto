import java.util.Scanner;
import java.util.InputMismatchException;

import example.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o seu endereço: ");
        String enderecoCliente = scanner.nextLine();

        Cliente cliente = new Cliente(nomeCliente, enderecoCliente);
        Pedido pedido = new Pedido(cliente);

        Pao paoFrances = new Pao("Pão Francês", 0.50, "Francês");
        Pao paoIntegral = new Pao("Pão Integral", 1.0, "Integral");
        Pao paoDeForma = new Pao("Pão de Forma", 2.50, "Forma");

        Bolacha bolachaPraieiraDoce = new Bolacha ("Bolacha praieira", 5.50, "Doce");
        Bolacha bolachaPraieiraSalgada = new Bolacha("Bolacha praieira", 5.0, "Salgada");
        Bolacha bolachaTareco = new Bolacha("Bolacha Tareco", 6.50, "Tareco");

        int opcao = 0;

        do {
            mostrarMenu();
            try {
                opcao = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida. Tente novamente.");
                scanner.next(); // Limpa a entrada inválida
                continue;
            }

            switch (opcao) {
                case 1:
                    adicionarProduto(pedido, scanner, paoFrances, "Pão Francês");
                    break;
                case 2:
                    adicionarProduto(pedido, scanner, paoIntegral, "Pão Integral");
                    break;
                case 3:
                    adicionarProduto(pedido, scanner, paoDeForma, "Pão de Forma");
                    break;
                case 4:
                    adicionarProduto(pedido, scanner, bolachaPraieiraDoce, "Bolacha praieira doce");
                    break;
                case 5:
                    adicionarProduto(pedido, scanner, bolachaPraieiraSalgada, "Bolacha praieira salgada");
                    break;
                case 6:
                    adicionarProduto(pedido, scanner, bolachaTareco, "Bolacha Tareco");
                    break;
                case 7:
                    System.out.println("Encerrando o pedido...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 7);

        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("Pedido:");
        pedido.compra();
        System.out.println("Total: R$" + String.format("%.2f", pedido.calcularTotal()));
        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("Menu:");
        System.out.println("1. Adicionar Pão Francês (R$0.50)");
        System.out.println("2. Adicionar Pão Integral (R$1.00)");
        System.out.println("3. Adicionar Pão de Forma (R$2.50)");
        System.out.println("4. Adicionar Bolacha Praieira Doce (R$5.50)");
        System.out.println("5. Adicionar Bolacha Praieira Salgada (R$5.00)");
        System.out.println("6. Adicionar Bolacha Tareco (R$6.50)");
        System.out.println("7. Finalizar pedido");
        System.out.print("Escolha uma opção: ");
    }

    public static void adicionarProduto(Pedido pedido, Scanner scanner, Object produto, String nomeProduto) {
        System.out.print("Insira a quantidade: ");
        int quantidade = 0;
        try {
            quantidade = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Quantidade inválida. Tente novamente.");
            scanner.next(); // Limpa a entrada inválida
            return;
        }
        for (int i = 0; i < quantidade; i++) {
            pedido.adicionarProduto((Produto) produto);
        }
        System.out.println(quantidade + " " + nomeProduto + " adicionado(s).");
    }
}
