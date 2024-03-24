import java.util.Scanner;
public class Repeticao31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int produtoNumero = 1;
        double totalCompra = 0;

        System.out.println("Lojas Tabajara");

        while (true) {
            System.out.print("Produto " + produtoNumero + ": R$ ");
            double preco = scanner.nextDouble();

            if (preco == 0) {
                break; 
            }

            totalCompra += preco;
            produtoNumero++;
        }

        System.out.println("Total: R$ " + totalCompra);

        System.out.print("Dinheiro: R$ ");
        double dinheiro = scanner.nextDouble();

        double troco = dinheiro - totalCompra;
        System.out.println("Troco: R$ " + troco);
    }
}
