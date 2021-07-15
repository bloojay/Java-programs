import java.io.*;
import java.util.*;
public class spcl
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int dig,f,s=0,n,y;
        n=sc.nextInt();
        y=n;
        while(y>0)
        {
            dig=y%10;
            f=1;
            for(int i=1;i<=dig;i++)
            {
                f=f*i;
            }
            s=s+f;
            y=y/10;
        }
        if(n==s)
        System.out.println("SPECIAL NUMBER");
        else
         System.out.println("NOT A SPECIAL NUMBER");
        }
    }
    