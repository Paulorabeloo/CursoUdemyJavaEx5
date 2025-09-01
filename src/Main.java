import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroFuncionario = sc.nextInt();
        double numeroHorasTrabalhadas = sc.nextDouble();
        double valorPorHoras = sc.nextDouble();

        double salario = numeroHorasTrabalhadas * valorPorHoras;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);
    }
}