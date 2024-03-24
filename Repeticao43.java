import java.util.Scanner;
public class Repeticao43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] precos = {1.20, 1.30, 1.50, 1.20, 1.30, 1.00};
        String[] itens = {"Cachorro Quente", "Bauru Simples", "Bauru com ovo", "Hambúrguer", "Cheeseburguer", "Refrigerante"};

        System.out.println("Cardápio:");
        System.out.println("Especificação\tCódigo\tPreço");
        for (int i = 0; i < itens.length; i++) {
            System.out.println(itens[i] + "\t\t" + (100 + i) + "\tR$ " + precos[i]);
        }

        double totalGeral = 0;

        System.out.println("\nFaça o seu pedido (digite 0 para encerrar o pedido):");
        int codigo, quantidade;
        do {
            System.out.print("Código do item: ");
            codigo = scanner.nextInt();
            if (codigo != 0 && codigo >= 100 && codigo <= 105) {
                System.out.print("Quantidade: ");
                quantidade = scanner.nextInt();
                double precoItem = precos[codigo - 100];
                double totalItem = precoItem * quantidade;
                System.out.printf("Valor a ser pago pelo %s: R$ %.2f%n", itens[codigo - 100], totalItem);
                totalGeral += totalItem;
            } else if (codigo != 0) {
                System.out.println("Código de item inválido. Por favor, digite novamente.");
            }
        } while (codigo != 0);

        System.out.printf("Total geral do pedido: R$ %.2f%n", totalGeral);
    }
}
