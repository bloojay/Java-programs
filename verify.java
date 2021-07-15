

import java.util.*;
import java.io.*;
class verify
{
    public static void main()
    {
      char m='A';
      int p=25;
      System.out.println((char)m+p);
      System.out.println((char)(m+p));
      System.out.println(m+p);
        }
    public static void niam()
    {
        double a=2.5,b=12.5;
         System.out.println((int)(b/a));
          System.out.println((int)b/a);
        }
    public static void aimn()
    {
        double a=8.97,b=-6.47;
        System.out.println(Math.ceil(a));
        System.out.println(Math.rint(b));
        }
    public static void iman()
    {
        System.out.println(Math.ceil(-3.2));
        System.out.println(Math.round(-35.5));
    }
    public static void amin()
    {
        double a=3,b=5;
        System.out.printf("%.4f",(5.0/3.0));
    }
    public static void naim()
    {
        System.out.println(Math.round(1.5));
        System.out.println(Math.round(-1.5));
        System.out.println(Math.round(-1.51));
        System.out.println(Math.round(1.51));
        }
    public static void mian()
        {
         System.out.println(Math.rint(1.5));
         System.out.println(Math.rint(-1.5));
         System.out.println(Math.rint(-1.51));
         System.out.println(Math.rint(1.51));
        }
    public static void mnai()
    {
    System.out.println("DHONI"+""+20+11);
    System.out.println(20+11+"DHONI");
    System.out.println("DHONI"+20+11);
    System.out.println('D'+20+11);
    System.out.println("DHONI"+""+20.0+11.0);
    }
    public static void mnia() throws IOException
    {
    System.out.println("Enter any two numbers");
     int a,b,c;
    InputStreamReader ir = new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(ir);
    a=Integer.parseInt(br.readLine());
    b=Integer.parseInt(br.readLine());
    c=a+b;
    System.out.println("The sum is "+ c);
    }
    public static void mani() 
    {
       /** int x=90;
        int p='Z';
        char c=(x<=90)?p:'1';
        System.out.println("the value of c is "+ c);*/
       System.out.println("Enter value");
       long a,b;
       String c=" ";
       Scanner sc=new Scanner(System.in);
       a=sc.nextLong();
       for(b=1;b<=a;b++)
       {
           if(b*b==a)
            {
               c="SQUARE";
               System.out.println(c);
               break;
            }
        
       }
       if(c!="SQUARE")
       {
           System.out.println("NOT A SQUARE");
        }
    }
    public static void mina()
    {
        System.out.println("ENTER TYPE AS INVERTED OR NORMAL");
        int a,b=1,c,d=5;
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
       if(s.compareTo("NORMAL")==0)
       {
          for(a=1;a<=5;a++)
          {
            for(c=1;c<=a;c++)
           { 
            System.out.print(b+" ");
           }
            System.out.println();
            b=b+1;
        }
       }
        else if(s.compareTo("INVERTED")==0)
       { 
        for(a=5;a>=1;a--) 
        {
        for(c=1;c<=a;c++)
        {
          System.out.print(d+" ");
        }
        System.out.println();
        d=d-1;
       }
       }
       else if(s.compareTo("INVERTED")!=0 && (s.compareTo("NORMAL")!=0))
       {
        System.out.println("ENTER A VALID TYPE");
      }
    }
    public static void nami()
    {
        double w=64.62;
        double x=89.76;
        boolean y=(x-w+w>49.63)?(x>x):(x<w);
        String z=(x%w==0)?"yes":"no";
        System.out.println(y);
        System.out.println(z);
    }
    
}

