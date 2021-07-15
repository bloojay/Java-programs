public class pattern8
{
 /*public static void main()
 {
  for(int i=5;i>=1;i--)
  {
   for(int j=5;j>=i;j--)
   {
     System.out.print(j);
   }
   for(int k=1;k<=(i-1);k++)
   {
    System.out.print(k); 
   }
   System.out.println();
  }
 }*/
 public static void main()
 {
  System.out.println();
  for(int i=5;i>=1;i--)
  {
   for(int j=5;j>=i;j--)
   {
     System.out.print(j);
   }
   for(int k=1;k<=(i-1);k++)
   {
    System.out.print(i); 
   }
   System.out.println();
  }
 }
 public static void main2()
 {
  for(int i=1;i<=5;i++)
  {
   int c=0;
   for(int j=1;j<=5;j++)
   {
     if(i==1)
     System.out.print(5);
     else if(j<i)
     {
       System.out.print((5-c));
       c=c+1;
     }
     else
     System.out.print((5-c));
   }
   
   System.out.println();
  }
 }
}