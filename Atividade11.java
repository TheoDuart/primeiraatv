import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double diagonalMaior, diagonalMenor, area;

        System.out.print("Informe a diagonal Maior: ");
        diagonalMaior = entrada.nextDouble();
        System.out.print("Informe a diagonal Menor: ");
        diagonalMenor = entrada.nextDouble();

        area = (diagonalMaior * diagonalMenor)/2;

        System.out.println("A área do losango é: " + area);
        entrada.close();
    }
}
