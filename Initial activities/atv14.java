import java.util.Scanner;

public class atv14 {
  public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    System.out.println("insira");
    int tabu;
    tabu = x.nextInt();
    int i = 1;
    while (i < 11) {
      System.out.println(tabu + "*" + i + "=" + (i * tabu));
      i++;
    }
    x.close();
  }

}
