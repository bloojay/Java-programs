import java.io.*;
public class practi
{
    public static void num(int n)
    {
     long c=(long)Math.pow(n,3);
     int m=n;
     int i;
     for(i=0;m>0;m=m/10,i++);
     if((c%(int)(Math.pow(10,i)))==n)
      System.out.println("TRIMORPHIC");
     else
      System.out.println("NOT SO");
    }
    public static void num()throws IOException
    {
     InputStreamReader ir=new InputStreamReader(System.in);
     BufferedReader br=new BufferedReader(ir);
     int n=Integer.valueOf(br.readLine());
     int s=0;
     while(n>=10)
     {
       while(n>0)
       {
        s=s+n%10;
        n=n/10;
       }
       n=s;
       s=0;
     }
     if(n==1)
      System.out.println("MAGIC NUMBER");
     else
      System.out.println("NOT A MAGIC NUMBER");
    }
}