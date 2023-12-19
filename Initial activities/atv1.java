import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        int varX;
        int varY;
        System.out.println("insira um num: ");
        varX = x.nextInt();
       
        System.out.println("insira outro num: ");
        varY = y.nextInt();

        System.out.println("A multiplicação dos número é: " + (varX*varY));
        
        
        x.close();
        y.close();
    }
}

/*
 * # public class pessoa {
 * private String nome;
 * private int idade;
 * }
 * 
 * int x = 8;
        if (x == 10) {
            System.out.print("teste");
        } else {
            System.out.print("falso");
        }
 */