public class pattern11
{
 public static void main()
 {
  int c=1;
  for(int i=9;i>=1;i--)
  {
      System.out.print("*");
  }
  System.out.println();
   for(int j=4;j>=1;j--)
   {
       System.out.print(" ");
   for(int k=1;k<=j;k++)
   {
      
       System.out.print("*");
      
       
    }
   for(int l=1;l<=c;l++)
   {
    
    
    System.out.print(" ");
   }
  
   for(int m=1;m<=j;m++)
   {
      
       System.out.print("*");
      
       
    }
   System.out.println();
   c=c+2;
    
    
   
   
  }
 }
}