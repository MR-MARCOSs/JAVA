import java.util.Scanner;

public class atv5 {
  public static void main(String[] args) {
    Scanner x = new Scanner(System.in);

    System.out.println("insira sua idade: ");
    int varX = x.nextInt();

    if (varX < 18) {
      System.out.println("Você é menó de idade");
    } else {
      System.out.println("Você é maió de idade");
    }

    x.close();

  }
}
