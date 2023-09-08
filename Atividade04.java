import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double notaUm, notaDois, mediaPon;
        
        System.out.print("Informe a nota um: ");
        notaUm = scanner.nextDouble();
        System.out.print("Informe a nota dois: ");
        notaDois = scanner.nextDouble();

        mediaPon = (notaUm * 2 + notaDois * 3) /5;

        System.out.println("A média ponderada é: " + mediaPon);
        scanner.close();




    }
    
}
