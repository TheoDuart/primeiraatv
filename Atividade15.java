import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, contaUm, contaDois, totalContas, multa, salarioRes;

        System.out.print("Informe seu sálario: ");
        salario = entrada.nextDouble();
        System.out.print("Informe o valor da primeira conta: ");
        contaUm = entrada.nextDouble();
        System.out.print("Informe o valor da segunda conta: ");
        contaDois = entrada.nextDouble();


        multa = (contaUm * 0.02) + (contaDois * 0.02);
        totalContas = contaUm + contaDois;
        salarioRes = salario - multa - totalContas;

        System.out.println("O salário restante será: " + salarioRes);
        entrada.close();


    }
}
/* João recebeu seu salário e precisa pagar duas contas atrasadas. Em razão do atraso, ele deverá pagar 
multa de 2% sobre cada conta. Faça um programa que calcule e mostre quanto restará do salário de 
João.  */