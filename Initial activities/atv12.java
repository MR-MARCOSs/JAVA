import java.util.Scanner;

public class atv12 {
  public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    int num;
    int i = 0;
    System.out.println("insira: ");
    num = x.nextInt();

    if (num < 0) {
      while (i >= num) {
        System.out.println(i);
        i--;
      }
    } else {
      while (i <= num) {
        System.out.println(i);
        i++;
      }
    }
    x.close();
  }
}
