import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int anoNasc, anoAtual, anos, meses, dias, semanas; 

        System.out.print("Informe o ano de nascimento: ");
        anoNasc = entrada.nextInt();
        System.out.print("Informe o ano atual: ");
        anoAtual = entrada.nextInt();

        anos = anoAtual - anoNasc;
        meses = anos * 12;
        dias = anos * 365;
        semanas = anos * 52;

        System.out.println("Sua idade em anos: " + anos);
        System.out.println("Sua idade em meses: " + meses);
        System.out.println("Sua idade em dias: " + dias);
        System.out.println("Sua idade em semanas: " + semanas);
        entrada.close();




        
          
        
        



    
    }
}
/*Faça um programa que receba o ano de nascimento de uma pessoa e o ano atual, calcule e mostre: 
a) a idade dessa pessoa em anos; 
b) a idade dessa pessoa em meses; 
c) a idade dessa pessoa em dias; 
d) a idade dessa pessoa em semanas */