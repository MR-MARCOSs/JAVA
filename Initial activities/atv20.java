import java.util.Scanner;

public class atv20 {
    public static void main(String[] args){
        Scanner x= new Scanner(System.in);
        System.out.println("sere ae:");
        String frase = x.nextLine();
        String nova = frase.replace('a', 'o');
        System.out.println(nova);

        x.close();
    }

}
