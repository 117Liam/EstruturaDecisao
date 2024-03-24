public class Repeticao16 {
    public static void main(String[] args) {
        int primeiroTermo = 0;
        int segundoTermo = 1;
        int proximoTermo;

        System.out.println("Série de Fibonacci até que o valor seja maior que 500:");

        while (true) {
            System.out.print(primeiroTermo + " ");

            proximoTermo = primeiroTermo + segundoTermo;

            if (proximoTermo > 500)
                break;

            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }

        System.out.println("\nO primeiro número da sequência de Fibonacci que ultrapassa 500 é: " + proximoTermo);
    }
}
// Não consegui fazer direito