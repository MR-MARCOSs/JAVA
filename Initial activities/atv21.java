import java.util.Scanner;
public class atv21 {
    public static void main(String[] args){
        Scanner x= new Scanner(System.in);
        System.out.println("sere ae:");
        int frase = x.nextInt();
        
        for (int i=1; i<=frase; i++){
    
            if (frase%i==0){
                System.out.println(i);
            }
        }
        x.close();
    }
}
