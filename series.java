public class series
{
  public static void pell(int i)
  {
    int a=1,b=2;
    System.out.print(a+","+b);
    for(int j=1;j<=(i-2);j++)
    {
     int c=a+2*b;
     System.out.print(","+c);
     a=b;
     b=c;
    }
    System.out.println();
  }  
   public static void fibonacci(int k)
   {
    int a=0,b=1;
    System.out.print(a+","+b);
    for(int j=1;j<=(k-2);j++)
    {
     int c=a+b;
     System.out.print(","+c);
     a=b;
     b=c;
    }
    System.out.println();
   }
  
}
