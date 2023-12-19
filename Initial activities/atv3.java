import java.util.Scanner;
import java.util.ArrayList;

public class atv3 {
  public static void main(String[] args) {
    int i = 1;
    ArrayList<Integer> lista = new ArrayList<Integer>();
    Scanner x = new Scanner(System.in);
    float soma = 0;
    while (i <= 10) {
      int varX;
      System.out.println("insira o " + i + "° número: ");
      varX = x.nextInt();
      lista.add(varX);
      i++;

    }
    ;

    for (int y : lista) {
      soma += y;
    }
    float media = soma / lista.size();
    System.out.println("A media dos números " + lista + " é " + media);
    x.close();
  }

}
