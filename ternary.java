import java.io.*;
import java.util.*;
public class ternary
{
public static void main()throws IOException
{
    Scanner sc=new Scanner(System.in);
    InputStreamReader ir=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(ir);
    double a,b,c,d;
    a=Double.parseDouble(br.readLine());
    b=Double.parseDouble(br.readLine());
    c=sc.nextDouble();
    d=(a>b)? a:b;
    d=(d>c)? d:c;
    System.out.println("GREATEST ONE IS  "+d);
}   
} 