import java.util.Scanner;

public class Atividade20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ângulo em graus: ");
        double angulo = scanner.nextDouble();

        System.out.print("Digite a distância até a parede: ");
        double distanciaParede = scanner.nextDouble();

        // Converter o ângulo de graus para radianos
        double anguloRadianos = Math.toRadians(angulo);

        // Calcular o comprimento da escada usando a fórmula da tangente
        double comprimentoEscada = distanciaParede / Math.cos(anguloRadianos);

        System.out.println("A medida da escada necessária é: " + comprimentoEscada);

        scanner.close();
    }
}
