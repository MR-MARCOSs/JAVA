import java.util.Scanner;

public class atv19 {
    public static void main(String[] args){
        Scanner x= new Scanner(System.in);
        String frase = x.nextLine();
        String[] palavras = frase.split(" ");

        for (String palavra : palavras) {
            if (palavra.toLowerCase().startsWith("a")) { 
                System.out.println(palavra);
            }
        }

        x.close();
    }
}
