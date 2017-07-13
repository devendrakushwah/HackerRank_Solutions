// My HackerRank Submissions
//@Author - Devendra Kushwah
import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payement = scanner.nextDouble();
        scanner.close();
        
       /* Create NumberFormats using Locales */
        NumberFormat us     = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india  = NumberFormat.getCurrencyInstance((new Locale("en", "IN")));
        NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        System.out.println("US: " + us.format(payement));
        System.out.println("India: " + india.format(payement));
        System.out.println("China: " + china.format(payement));
        System.out.println("France: " + france.format(payement));
    }
}
