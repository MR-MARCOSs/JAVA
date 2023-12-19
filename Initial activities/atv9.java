import java.util.Scanner;

public class atv9 {
  public static void main(String[] args) {
    Scanner medidas = new Scanner(System.in);
    float altura;
    float largura;
    System.out.println("insira a altura: ");
    altura = medidas.nextFloat();
    System.out.println("insira a largura: ");
    largura = medidas.nextFloat();
    System.out.println("Á área do retângulo é " + (altura * largura));
    medidas.close();

  }
}
