import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        int varX;
        int varY;
        System.out.println("insira um num: ");
        varX = x.nextInt();

        System.out.println("insira outro num: ");
        varY = y.nextInt();
        int div = varX % varY;

        System.out.println("O resto da divisão dos número é: " + (div));

        x.close();
        y.close();
    }
}