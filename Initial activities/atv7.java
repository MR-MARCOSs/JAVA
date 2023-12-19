import java.util.Scanner;

public class atv7 {
  public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    int varX;

    System.out.println("insira um num: ");
    varX = x.nextInt();
    while (varX < 0) {

      System.out.println("Tem que ser positivo bocó, faz dnv: ");
      varX = x.nextInt();
    }

    double raiz = Math.sqrt(varX);
    System.out.println("A raiz quadrada de " + varX + " é " + raiz);

    x.close();

  }
}