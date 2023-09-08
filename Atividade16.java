import java.util.Scanner;


public class Atividade16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double cateto1, cateto2, hipotenusa;
        
        System.out.print("INsira o valor do cateto 1: ");
         cateto1 = entrada.nextDouble();
        System.out.print("Insira o valor do cateto 2: ");
         cateto2 = entrada.nextDouble();

        hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2) ;


        System.out.print("O resultado da hipotenusa é: " + hipotenusa);
        entrada.close();
    }
}
