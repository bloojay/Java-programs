 public class pattern12
{
 public static void main()
 {
   System.out.println();
   for(int i=10;i>=1;i--)
   {
    for(int j=1;j<=i;j++)
    {
     System.out.print("        ");
     //System.out.print(" ");
    }
    for(int k=10;k>=i;k--)
    {
     System.out.print("ANSHUMAN"+"        ");
     //System.out.print("a"+" ");
    }
    System.out.println();
   }
   for(int i=9;i>=1;i--)
   {
    for(int j=10;j>=i;j--)
    {
     System.out.print("        ");
     //System.out.print("a"+" ");
    }
    for(int k=1;k<=i;k++)
    {
     System.out.print("ANSHUMAN"+"        ");
     //System.out.print(" ");
    }
    System.out.println();
   }
 }
}