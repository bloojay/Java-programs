
import java.io.*;
public class fibotribopell
{
  public static void fibo() throws IOException
  {
    int a=0,b=1;
    InputStreamReader ir=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(ir);
    int n=Integer.parseInt(br.readLine());
    System.out.print(a+","+b);
    for(int i=1;i<=n;i++)
    {
     int c=a+b;
     System.out.print(","+c);
     a=b;
     b=c;
    }
  }
   public static void pell() throws IOException
  {
    int a=0,b=1;
    InputStreamReader ir=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(ir);
    int n=Integer.parseInt(br.readLine());
    System.out.print(a+","+b);
    for(int i=1;i<=n;i++)
    {
     int c=a+2*b;
     System.out.print(","+c);
     a=b;
     b=c;
    }
  }
  public static void tribo() throws IOException
  {
      InputStreamReader ir=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(ir);
      int n=Integer.parseInt(br.readLine());
      int a=0,b=0,c=1;
      int d;
      System.out.print(a+","+b+","+c);
      for(int i=1;i<=n;i++)
    {
     d=a+b+c;
     System.out.print(","+d);
     a=b;
     b=c;
     c=d;
    }
  }
}