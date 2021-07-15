import java.util.*;
import java.io.*; 
public class palin
{
    public static void main()throws IOException
    {
      long rev=0,rem=0,x=0,n,y;
      InputStreamReader ir=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(ir);
      System.out.println("ENTER A NUMBER");
      System.out.println();
      n=Long.parseLong(br.readLine());
      y=n;
      for(x=0;x<=y;x++)
      {
        if((y/Math.pow(10,x)>=1)&&(y/Math.pow(10,x)<=9))
        {
           //System.out.println("x="+" "+x);
          while(x>=0&&y>=1)
          {
            rem=(y%10)*(long)(Math.pow(10,x));
            y=y/10;
            rev=rev+rem;
            x=x-1;
          }
          break;
        }
      }
      System.out.println("The Reverse Is "+rev);
      if(rev==n)
      System.out.println("IT IS A PALINDROME NUMBER");
      else
      System.out.println("IT IS NOT A PALINDROME NUMBER");
    }
 }