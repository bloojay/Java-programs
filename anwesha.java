import java.io.*;
import java.util.*;
public class anwesha
{
    public static void mama()
    {
        Scanner sc=new Scanner(System.in);
        long n,y,x,h,i,g;
        System.out.println("ENTER A NUMBER");
        n=sc.nextLong();
        y=n;
        System.out.println();
        for(i=1;i<=y;i++)
        {
            x=(long)Math.pow(10,i);
            if((n/x>=1)&(n/x<=9))
            {
              // System.out.println("x "+x);
              h=(n%10)*x;
              y=(n/10);
              //System.out.println("h "+h);
              //System.out.println("y "+y);
              g=n/x;
              y=(y-(x/10)*g)*10;
              //System.out.println("y "+y);
              // System.out.println("g "+g);
              n=h+y+g;
              System.out.println("THE REQUIRED NUMBER IS  "+n);
              break;
            }
        }
        System.out.println();
    }
    
}