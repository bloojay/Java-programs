//To check whether two given numbers are amicable or not
import java.io.*;
public class amicable
{
  public static void main() throws IOException
  {
     int i,a,b,c=0,d=0;
     InputStreamReader ir=new InputStreamReader(System.in);
     BufferedReader br = new BufferedReader(ir);
     System.out.println("Enter the numbers");
     a=Integer.parseInt(br.readLine());
     b=Integer.parseInt(br.readLine());
     for(i=1;i<a;i++)
     {
       if(a%i==0)
        c=c+i;
     }
     if(c==b)
     {
       for(i=1;i<b;i++)
       {
         if(b%i==0)
          d=d+i;
       }
       if(d==a)
        System.out.println("THEY ARE AMICABLE NUMBERS");
       else
        System.out.println("THEY ARE NOT AMICABLE NUMBERS");
     }
     else
      System.out.println("THEY ARE NOT AMICABLE NUMBERS");
   }
}