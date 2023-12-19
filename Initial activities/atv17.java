import java.util.Scanner;

public class atv17 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("sere:");
        String frase = x.nextLine();
        int vogais=0;
        for (int i = 0; i<frase.length(); i++){
        char letra = frase.charAt(i);
        
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'
                    || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                vogais++;
            }
        }
        System.out.println("A frase digitada possui " + vogais + " vogais.");

        x.close();

    }
}
