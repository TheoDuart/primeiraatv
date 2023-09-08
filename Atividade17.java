import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o valor do raio: ");
        double raio = entrada.nextDouble();
        double comprimento = 2 * Math.PI * raio;
        double area = Math.PI * raio * raio;
        double volume = 4.0 / 3.0 * Math.PI * Math.pow(raio, 3);

        System.out.println("Comprimento da esfera: " + comprimento);
        System.out.println("Área da esfera: " + area);
        System.out.println("Volume da esfera: " + volume);
        entrada.close();
        

    }
}
/*Faça um programa que receba o raio, calcule e mostre: 
a) o comprimento de uma esfera; sabe-se que C = 2 * p R; 
b) a área de uma esfera; sabe-se que A = p R2
; 
c) o volume de uma esfera; sabe-se que V = ¾ * p R3
.  */