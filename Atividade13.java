import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o número que você deseja saber a tabuada: ");
        int n = entrada.nextInt();

        for(int i = 0; i <=10; i++){
            int res = n * i;
            System.out.println(n+ " x " + i + " = "+ res);
        }


        entrada.close();
    }
}
