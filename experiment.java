import java.io.*;
import java.util.*;
import java.math.*;
public class experiment
{
  public static void main(int a,int b,int c)throws Exception
  {
    Scanner sc=new Scanner(System.in);
    InputStreamReader ir=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(ir);
    int d,e;
    d=Integer.parseInt(br.readLine());
    e=sc.nextInt();
    int sum=a+b+c+d+e;
    System.out.println("sum "+sum);
  }
  public static void bd()
  {
   BigDecimal a=BigDecimal.valueOf(5042.23);
   BigDecimal b=BigDecimal.valueOf(5041.2312);
   BigDecimal c=a.subtract(b);
   double con=c.doubleValue();
   System.out.println(con);
   con=5042.23-5041.2312;
   System.out.println(con);
  }
  /*public static void fi()
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n>100)
    System.out.println("100");
    else if(n>1000)
    System.out.println("1000");
    else if(n>2000)
    System.out.println("2000");
    else
    System.out.println("INFINITY");
    
    
    if(n>100)
    System.out.println("100");
    if(n>1000)
    System.out.println("1000");
    if(n>2000)
    System.out.println("2000");
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  }*/
}  
