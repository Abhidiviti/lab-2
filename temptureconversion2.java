import java.util.Scanner;

public class temptureconversion2 {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);

        System.out.println("Enter F");
        float Fahrenheit =a.nextFloat();


       double celsius = ((Fahrenheit - 32) * 5/9);
       System.out.println(celsius);
    }
    
}
