import java.util.Scanner;
public class Repeticao03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = leitor.nextLine();
        while (nome.length() <= 3) {
            System.out.print("Nome: ");
            nome = leitor.nextLine();
        }

        System.out.print("Idade: ");
        int idade = leitor.nextInt();
        while (idade < 0 || idade > 150) {
            System.out.print("Idade: ");
            idade = leitor.nextInt();
        }

        System.out.print("Salário: ");
        double salario = leitor.nextDouble();
        while (salario <= 0) {
            System.out.print("Salário: ");
            salario = leitor.nextDouble();
        }

        System.out.print("Sexo: ");
        char sexo = leitor.next().charAt(0);
        while (sexo != 'f' && sexo != 'm') {
            System.out.print("Sexo: ");
            sexo = leitor.next().charAt(0);
        }

        System.out.print("Estado Civil: ");
        char estadoCivil = leitor.next().charAt(0);
        while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
            System.out.print("Estado Civil: ");
            estadoCivil = leitor.next().charAt(0);
        }

        leitor.close();
    }
}
