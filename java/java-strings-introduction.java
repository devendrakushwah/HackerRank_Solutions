// My HackerRank Submissions
//@Author - Devendra Kushwah
import java.util.*;

public class Solution {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String A = sc.next();
    String B = sc.next();
    int a = A.length();
    int b = B.length();
    int sum = a + b;
    System.out.println(sum);

    if (A.compareToIgnoreCase(B) > 0) 
    {
        System.out.println("Yes");
    } 
    
    else 
    {
    System.out.println("No");
    }
    
    
    char a1 = A.toUpperCase().charAt(0);
    char b1 = B.toUpperCase().charAt(0);


        System.out.println(a1 + A.substring(1) +" "+ b1 +B.substring(1));

}
}
