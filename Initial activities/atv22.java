import java.math.BigInteger;
import java.util.Scanner;

public class atv22 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        BigInteger num1 = x.nextBigInteger();

        System.out.print("Digite o segundo número: ");
        BigInteger num2 = x.nextBigInteger();

        BigInteger mdc = num1.gcd(num2);
        System.out.println("O MDC entre " + num1 + " e " + num2 + " é " + mdc);

        x.close();
    }
}
