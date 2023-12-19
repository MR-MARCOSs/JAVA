import java.util.Scanner;

public class atv6 {
  public static void main(String[] args) {
    Scanner x = new Scanner(System.in);

    System.out.println("insira um num: ");
    int varX = x.nextInt();

    int div = varX % 2;
    if (div != 2) {
      System.out.println("O num " + (varX) + " é impá");
    } else {
      System.out.println("O num " + (varX) + " é pá");
    }
    x.close();

  }
}
