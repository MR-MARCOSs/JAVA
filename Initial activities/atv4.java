import java.util.Scanner;

public class atv4 {
  public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    Scanner y = new Scanner(System.in);
    int varX;
    int varY;
    System.out.println("insira um num: ");
    varX = x.nextInt();

    System.out.println("insira outro num: ");
    varY = y.nextInt();

    System.out.println("A soma dos número é: " + (varX + varY));

    x.close();
    y.close();
  }
}
