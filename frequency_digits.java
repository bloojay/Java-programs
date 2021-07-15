
import java.io.*;
public class frequency_digits
{
    public static void main()throws IOException,NumberFormatException
    {
      InputStreamReader ir=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(ir);
      long d,m,c=0,dig,s=0,e=0,f=1;
      long n;
      n=Long.parseLong(br.readLine());
      System.out.println("DIGITS"+"\t"+"FREQUENCY");
      
      
      while(n>0)
      {
          d=n%10;
          m=n;
          for(int i=0;m>0;i++)
          {
              dig=m%10;
              if(dig==d)
              {
                  c++;
                  i--;
              }
              else if(dig==0)
              {
                  e++;
                  i--;
                   f=0;
              }
              else
              {
                  s=s+dig*(int)(Math.pow(10,i));
              }
              m=m/10;
          }
          
          System.out.println(d+"\t"+"     "+c);
           if(f==0)
           {
            System.out.println("0"+"\t"+"     "+e);
            f++;
           }
          c=0;
          n=s;
          
          s=0;
      }
    }
}
