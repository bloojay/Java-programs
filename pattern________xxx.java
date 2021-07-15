public class pattern________xxx
{
 public static void main()
 {
  System.out.println();   
  for(int i=1;i<=30;i++)
  {
   for(int j=30;j>=i;j--)
   {
       System.out.print(" ");
   }
   for(int k=1;k<=60;k++)
   {
    System.out.print("?");
   }
   System.out.println();
  }
 }
 public static void mn()
 {
  System.out.println(); 
  System.out.println();
  for(int i=1;i<=30;i++)
  {
   for(int j=1;j<=i;j++)
   {
       System.out.print(" ");
   }
   for(int k=1;k<=60;k++)
   {
    System.out.print("*");
   }
   System.out.println();
  }
 }
}