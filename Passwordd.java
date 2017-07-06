import java.io.*;
import java.util.*;
public class Passwordd{
    public static void main(String args[])
    {
        String str;
        Scanner s=new Scanner(System.in);
        str=s.next();
        char p[]=str.toCharArray();
        int a,sum=0;
        for(int i=0;i<str.length();i++)
                {
                   a=(int)p[i];
                   sum=sum+a;
                }
        int avg=sum/str.length();
        char d=(char)avg;
        System.out.println(d);
        
    }
    
}
