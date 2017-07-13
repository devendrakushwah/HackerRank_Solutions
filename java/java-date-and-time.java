// My HackerRank Submissions
//@Author - Devendra Kushwah
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        int m=Integer.parseInt(month);
        int d=Integer.parseInt(day);
        int y=Integer.parseInt(year);
        
        Calendar cal=Calendar.getInstance();
        cal.set(y,m-1,d);
        int val = cal.get(Calendar.DAY_OF_WEEK);
        String week[]={"","SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        System.out.println(week[val]);
    }
}
