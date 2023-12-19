import java.util.Scanner;

public class atv10 {
  public static void main(String[] args) {
    Scanner r = new Scanner(System.in);
    float raio;
    System.out.println("Raio: ");
    raio = r.nextFloat();
    System.out.println("O perímetro é " + (2 * 3.14 * raio));
    r.close();

  }
}
