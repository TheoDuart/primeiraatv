import java.util.Scanner;

public class Atividade21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salMin, horasTra, salBru, horasExt, salRec, horaTra, horaExt;

        System.out.println("Informe o número de horas trabalhadas: ");
        horasTra = scanner.nextDouble();
        System.out.println("Informe o valor do salário minímo: ");
        salMin = scanner.nextDouble();
        System.out.println("Informe o número de horas extras: ");
        horasExt = scanner.nextDouble();

        horaTra = salMin / 8;
        horaExt = salMin / 4;
        salBru = horaTra * horasTra;
        horasExt = horasExt * horaExt;
        salRec = salBru + horasExt;

        System.out.println("O salário a ser recebido é de: " + salRec );
        scanner.close();




        
    }
}