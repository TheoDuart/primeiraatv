import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double baseMaior, baseMenor, altura, area;

        System.out.print("Informe a base Maior: ");
        baseMaior = entrada.nextDouble();
        System.out.print("Informe a base Menor: ");
        baseMenor = entrada.nextDouble();
        System.out.print("Informe a altura: ");
        altura = entrada.nextDouble();

        area = ((baseMaior + baseMenor) * altura)/2;

        System.out.print("A área do trapézio é: " + area);
        entrada.close();
    }
}
