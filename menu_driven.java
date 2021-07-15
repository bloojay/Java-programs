import java.io.*;
import java.util.*;
public class menu_driven
{
    public static void main()throws IOException
    {
     InputStreamReader ir=new InputStreamReader(System.in);
     BufferedReader br=new BufferedReader(ir);
     int a,b,c;
     a=50;
     b=Integer.parseInt(br.readLine());
     c=Integer.parseInt(br.readLine());
     int d=a+b+c;
     System.out.println("d "+d );
    }
    public static void ioo()throws IOException
    {
     InputStreamReader ir=new InputStreamReader(System.in);
     BufferedReader br=new BufferedReader(ir);
     double h,b,s,l,w,a=0.0;
     int choice;
     //int d;
     choice=Integer.parseInt(br.readLine());
     //d=choice*5;
     //System.out.println(d);
     
     switch (choice)
     {
         case 1:
         h=Double.parseDouble(br.readLine());
         b=Double.parseDouble(br.readLine());
         a=(h*b)/2.0;
         break;
         case 2:
         l=Double.parseDouble(br.readLine());
         w=Double.parseDouble(br.readLine());
         a=l*w;
         break;
         case 3:
         
         s=Double.parseDouble(br.readLine());
         a=s*s;
         break;
         default:
         System.out.println("wrong choice");
     }
     System.out.println("Area= "+ a);
    }
    public static void ooi()throws IOException
    {
        menu_driven obj=new menu_driven();
        obj.main();
        obj.ioo();
    }
    public static void switchcase()throws IOException
    {
     char choice;
     InputStreamReader ir=new InputStreamReader(System.in);
     BufferedReader br=new BufferedReader(ir);
     Scanner sc=new Scanner(System.in);
     //String s;
     //s=sc.nextLine();
     //System.out.println("s= "+s);
     choice=(char)(br.read());
     switch(choice)
     {
         case 'a':
         System.out.println("hello");
         break;
         case 'b':
         System.out.println("dep");
         break;
         default:
         System.out.println("idiots");
        }
     
    }
}