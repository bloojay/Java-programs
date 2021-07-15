public class pattern11_2
{
 public static void main()
 {
  int c=1;
  int cv=0;
   for(int i=4;i>=1;i--)
   {
       
   for(int j=1;j<=i;j++)
   {
      
       System.out.print("*");
      
       
    }
   for(int k=1;k<=c;k++)
   {
    if(c==1&&cv==0)
    System.out.print("*");
    else
    System.out.print(" ");
    
   }
  
   for(int l=1;l<=i;l++)
   {
      
       System.out.print("*");
      
       
    }
   System.out.println();
   c=c+2;
   cv=cv+1;
   if(cv==1) 
   {
       i=i+1;
       c=c-2;
   }
   
  }
 }
}
