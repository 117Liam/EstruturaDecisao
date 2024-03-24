import java.text.DecimalFormat;
import java.util.Scanner;
public class Repeticao41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");

        System.out.print("Digite o valor da dívida: ");
        double divida = scanner.nextDouble();

        System.out.println("Valor da Dívida\tValor dos Juros\tQuantidade de Parcelas\tValor da Parcela");

        for (int parcelas : new int[]{1, 3, 6, 9, 12}) {
            double juros = calcularJuros(divida, parcelas);
            double valorParcela = calcularValorParcela(divida + juros, parcelas);
            System.out.println(df.format(divida + juros) + "\t\t" + df.format(juros) + "\t\t\t" + parcelas + "\t\t\t\t" + df.format(valorParcela));
        }
    }

    public static double calcularJuros(double divida, int parcelas) {
        double percentualJuros = 0;
        switch (parcelas) {
            case 3:
                percentualJuros = 10;
                break;
            case 6:
                percentualJuros = 15;
                break;
            case 9:
                percentualJuros = 20;
                break;
            case 12:
                percentualJuros = 25;
                break;
        }
        return divida * (percentualJuros / 100);
    }

    public static double calcularValorParcela(double dividaComJuros, int parcelas) {
        return dividaComJuros / parcelas;
    }
}
