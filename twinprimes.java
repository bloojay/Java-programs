import java.io.*;
import java.util.*;
public class twinprimes
{
 public static void main()throws Exception//using one loop
 {
    Scanner sc=new Scanner(System.in);
    InputStreamReader ir=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(ir);
    for(int j=1;j<=30;j++)
    {
       System.out.println("ENTER THE NUMBERS");
       int c=0,p1,p2,i=1;
       p1=sc.nextInt();
       p2=Integer.parseInt(br.readLine());
    
       while(i<=(int)(Math.max(p1,p2)))
       {
         if(p1%i==0||p2%i==0)
         c++;
         i++;
       }
       if(c==3&&(p2-p1==2||p1-p2==2))
        System.out.println("TWIN PRIMES");
        else
        System.out.println("NOT TWIN PRIMES");
    }
 }
 public static void main2()throws Exception
 {
    Scanner sc=new Scanner(System.in);
    InputStreamReader ir=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(ir);
    for(int j=1;j<=10;j++)
    {
       System.out.println("ENTER THE NUMBERS");
       int c=0,p1,p2,i=1;
       p1=sc.nextInt();
       p2=Integer.parseInt(br.readLine());
    
       while(i<=(int)(Math.max(p1,p2)))
       {
         if(p1%i==0)
         c++;
         if(p2%i==0)
         c++;
         i++;
       }
       if(c==4&&(p2-p1==2||p1-p2==2))//Math.abs(p1-p2);
        System.out.println("TWIN PRIMES");
        else
        System.out.println("NOT TWIN PRIMES");
    }
 }
}
/**THANK YOU*/