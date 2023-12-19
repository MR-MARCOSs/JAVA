import java.util.Scanner;

public class atv16 {
  public static void main(String[] args) {
    Scanner c = new Scanner(System.in);
    int num;
    System.out.println("insere");
    num = c.nextInt();
    boolean primu = true;
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        System.out.println("num é");
        primu = true;
        break;
      } else {
        primu = false;

      }

    }
    if (primu == false) {
      System.out.println("é primu");
    }
    c.close();
  }
}
