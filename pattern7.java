public class pattern7
{
 public static void main()
 {
    
    for(int i=9;i>=5;i--)
    {
      for(int j=10-i;j<=i;j++)
      {
       System.out.print(j);
      }
      System.out.println();
    }
    System.out.println();
 }
 public static void m()
 {
    
    
    for(int i=9;i>=5;i--)
    {
      int j=10;
      for( j=(j-i);j<=i;j++)
      {
       System.out.print(j);
      }
      System.out.println();
    }
    System.out.println();
 }

 public static void an()
 {
    
    
    for(int i=1;i<=5;i++)
    {
     for(int j=i;j<=(10-i);j++)
      {
       System.out.print(j);
      }
      System.out.println();
    }
    System.out.println();
 }
}