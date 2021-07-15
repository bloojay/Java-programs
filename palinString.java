import java.util.*;
import java.io.*;
public class palinString
{
   public static boolean/*String*/ ps1(String s)
   {
    String s1="";
    int l=s.length();
    for(int i=l-1;i>=0;i--)
     s1=s1+s.charAt(i);
    /*if(s.equals(s1))
    return  "A PALINDROME STRING";
    else
    return "NOT A PALINDROME STRING";*/
    return s.equals(s1);
   }
   public static void ps2(String s)
   {
     String s1="";
     for(int i=0;i<s.length()-1;i++)
     {
        if(s.charAt(i)==' ')
        {
          if(palinString.ps1(s1))
           System.out.println(s1);
           s1="";
          continue;
        }
        s1=s1+s.charAt(i);
     }
     
   }
   public static void main()throws IOException
   {
    InputStreamReader ir=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(ir);
    palinString.ps2(br.readLine());
    
   }
}
