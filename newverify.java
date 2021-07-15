import java.util.*;
import java.io.*;
public class newverify
{
    public static void main()
    {
        long s,m,h;
        Scanner Scanner=new Scanner(System.in);
        s=Scanner.nextLong();
        h=s/(60*60);
        System.out.println("Hours "+h);
        h=s%(60*60);
        m=h/60;
        System.out.println("Minutes "+m);
        m=h%60;
        System.out.println("Seconds "+m);
    }
    public static void nami()
    {
        Scanner sc=new Scanner(System.in);
        String a,b,c;
        a=sc.nextLine();
        b=sc.nextLine();
        c=sc.nextLine();
        System.out.println(a+"   "+b+"  "+c);
    }
    /*public static void inam()
    {
        double s,c;
        long m,h;
        Scanner sc=new Scanner(System.in);
        s=sc.nextDouble();
        c=s;
        c=(double)c-(double)((long)s);
        System.out.println("c= "+c);
        h=(long)s/3600;
        System.out.println("h = "+h);
        s=(long)s-h*3600;
        System.out.println("s = "+s);
        m=(long)s/60;
        System.out.println("m = "+m);
        s=(double)((long)s)-m*60;
        System.out.println("s = "+s);
        s=s+c;
        System.out.println("s = "+s);
        /**System.out.println("HOURS = "+h);
        System.out.println("MINUTES = "+m);
        System.out.println("SECONDS = "+s);
    }*/
}

    