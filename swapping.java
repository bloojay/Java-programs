import java.io.*;
import java.util.*;
public class swapping
{
    double a,b,c;
    double a2,b2;
    public void input()throws IOException
    {
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        System.out.println("ENTER TWO NUMDERS");
        a=Double.parseDouble(br.readLine());
        b=Double.parseDouble(br.readLine());
    }
    public void swap()
    {
        System.out.println("THE INITIAL VALUE OF a IS "+a);
        System.out.println("THE INITIAL VALUE OF b IS "+b);
        c=b;
        b=a;
        a=c;
        System.out.println("THE NEW VALUE OF a IS "+a);
        System.out.println("THE NEW VALUE OF b IS "+b);
    }
    public void main()throws Exception
    {
      swapping obj=new swapping();
      obj.input();
      obj.swap();
    } 
    public void  input2()throws IOException
    {
        InputStreamReader ir =new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        System.out.println("ENTER TWO NUMBERS");
        a2=Double.parseDouble(br.readLine());
        b2=Double.parseDouble(br.readLine());
    }
    public void swap2()
    {
        System.out.println("THE INITIAL VALUE OF a2 IS "+a2);
        System.out.println("THE INITIAL VALUE OF b2 IS "+b2);
        a2=a2+b2;
        b2=a2-b2;
        a2=a2-b2;
        System.out.println("THE NEW VALUE OF a2 IS "+a2);
        System.out.println("THE NEW VALUE OF b2 IS "+b2);
    }
    public void vry()throws Exception
    {
      swapping obje=new swapping();
      obje.input2();
      obje.swap2();    
    }
}