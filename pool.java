import java.io.*;
import java.util.*;
class pool
{
 public static void main()
 {
   Scanner sc=new Scanner(System.in);
   int a=5;
   a=++a;
   System.out.println(a);
   char c;
   c=sc.next().charAt(0);
   System.out.println(c);

 }

 public static void pattern() throws IOException
 {
    InputStreamReader ir=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(ir);
    long a,b,c=3;
    for(a=1;a<=5;a++)
    {
        for(b=1;b<=a;b++)
        {
            System.out.print(c+" ");
            c=c+1;
        }
        System.out.println();
        c=c+1;
    }
 }

 public static void nrettap() throws IOException
 {
    InputStreamReader ir=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(ir);
    long a,b,c=1;
    for(a=1;a<=5;a++)
    {
        for(b=1;b<=a;b++)
        {
            System.out.print(c+" ");
        }           
        System.out.println();
        c=c+2;
    }
 }

 public static void netpatr() throws IOException
 {
    InputStreamReader ir=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(ir);
    long a,b,c=1;
    for(a=5;a>=1;a--)
    {
        for(b=1;b<=a;b++)
        {
           System.out.print(c+" ");
        }           
        System.out.println();
        c=c+2;
    }
 }
 public static void rtapten() throws IOException
 {
    System.out.println();
    System.out.println();
     long b=1,c=1,d=5;
    while(d>=c)
    {
        for(b=1;b<=d;b++)
        {
          System.out.print(b+" ");
        }           
        System.out.println();
        c=c+1;
    }
    System.out.println();
    System.out.println();
    b=1;
    c=1;
    d=5;
    while(d>=c)
    {
        for(b=1;b<=d;b++)
        {
           System.out.print(c+" ");
        }           
        System.out.println();
        c=c+1;
    }
 }
 
}