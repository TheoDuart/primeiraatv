import java.util.Scanner;

public class Atividade07{
  public static void main(String[] args) {
  //Declaração de dados
  Scanner entrada = new Scanner(System.in);
   double peso, pesoMais15, pesoMenos20;
   
   //Entrada de dados
   System.out.println("Informe seu peso: ");
   peso = entrada.nextDouble();
 
   pesoMais15 = peso + (peso*15/100);

   pesoMenos20 = peso * 0.8;

   System.out.println(" Seu peso mais 15%: " + pesoMais15 + "kg.");
   System.out.println("\nSeu peso menos 20% " + pesoMenos20+" kg.");
   entrada.close();

  }

}
