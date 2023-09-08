import java.util.Scanner;

public class Atividade24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dinheiroR, dolar, marcoAle, libra;

        System.out.print("Informe quanto você tem para a viagem: R$ ");
        dinheiroR = scanner.nextFloat();

        dolar = dinheiroR / 1.80;
        marcoAle =  dinheiroR / 2;
        libra = dinheiroR / 3.57;


        System.out.println("O valor em dolar é de: R$ " + dolar);
        System.out.println("O valor em macro é de: R$ " + marcoAle);
        System.out.println("O valor em libras é de: R$ " + libra);
        scanner.close();

        
    }
}
