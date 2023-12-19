import java.util.Scanner;
public class atv18 {
    public static void main(String[] args){
        Scanner x= new Scanner(System.in);
        System.out.println("sere");
        String frase = x.nextLine();
        String inverso = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
        inverso += frase.charAt(i);
        }
        System.out.println(inverso);
        x.close();
    }
}
