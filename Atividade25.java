import java.util.Scanner;

public class Atividade25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double horas, minutos, segundos, horasMinutos;

        System.out.print("Informe a quantidade de horas: ");
        horas = scanner.nextDouble();

        
        minutos = horas * 60;
        horasMinutos = horas * 60 + minutos;
        segundos = minutos * 60;

        System.out.println("A hora convertida em minutos é de: " + minutos);
        System.out.println("A quantidade de minutos é: " + horasMinutos);System.out.println("A hora convertida em segundos é de: " + segundos);
        scanner.close();
        
    }
}
