import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double produto, novoPreço;

        System.out.println("Informe o valor do produto: ");
        produto = scanner.nextDouble();

        novoPreço =  produto - (produto * 0.10) ; 

        System.out.println("O novo preço do produto é: " + novoPreço);
        scanner.close();
    }
}
