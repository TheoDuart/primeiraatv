import java.util.Scanner;

public class Atividade19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double area, comprimento, largura, iluminacao;

        System.out.println("Informe o comprimento da sala: ");
        comprimento = entrada.nextDouble();
        System.out.println("Informe a largura da sala: ");
        largura = entrada.nextDouble();

        area = comprimento * largura;
        iluminacao = area * 18;

        System.out.println("A iluminação que será utilizada será: " + iluminacao);
        entrada.close();
    }
}
