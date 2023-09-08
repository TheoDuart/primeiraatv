import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double celsius, fahrenheit; 

        System.out.print("A temperatura em graus celsius: ");
        celsius = entrada.nextDouble();

        fahrenheit = 180 * (celsius + 32)/100;

        System.out.print("A temperatura em fahrenheit é: " + fahrenheit);
        entrada.close();

    }
}
