import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double angulo1, angulo2, angulo3;

        System.out.println("Informe o valor do angulo 1: ");
        angulo1 = scanner.nextDouble();
        System.out.println("Informe o valor do angulo 2: ");
        angulo2 = scanner.nextDouble();

        angulo3 =  180 - (angulo1 + angulo2) ;

        System.out.println("O valor do ângulo 3 é: " + angulo3);
        scanner.close();
        
    }
}
