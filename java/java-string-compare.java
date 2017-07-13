// My HackerRank Submissions
//@Author - Devendra Kushwah
import java.util.*;

public class Solution {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String input=sc.next();
    int k=sc.nextInt();
    String large=input.substring(0,k);
    String small=input.substring(0,k);

    for(int i=0; i+k<=input.length(); i++)
    {           
        if(input.substring(i, i+k).compareTo(small)<0) 
        {
            small=input.substring(i, i+k);
        }
        if(input.substring(i, i+k).compareTo(large)>0) 
        {
            large=input.substring(i, i+k);
        }
    }

    System.out.println(small);
    System.out.println(large);
}
}
