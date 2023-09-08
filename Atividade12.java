import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double qtdSalario, salarioMinimo, valorSalario;

        System.out.print("INforme o valor do salário minimo: ");
        salarioMinimo = entrada.nextDouble();
        System.out.print("INforme o valor do salário recebido: ");
        valorSalario = entrada.nextDouble();

        qtdSalario = ( valorSalario / salarioMinimo);

        System.out.println("A quantida de slarios minimos recebidos: " + qtdSalario);
        entrada.close();
}
    }

