import java.util.Scanner;

public class Atividade22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numLa, numDi;

        System.out.print("Informe o número de lados: ");
        numLa = scanner.nextDouble();

        numDi = numLa * (numLa - 3)/2;

        System.out.println("O número de diagonais do polídono é: " + numDi);
        scanner.close();

    }
}
