public class pattern__x
{
 public static void main()
 {
   int space=-1;
   int star=5;
   for(int i=1;i<=5;i++)
   {
    for(int j=1;j<=space;j++)
    {
     System.out.print(" ");
    }
    for(int k=1;k<=star;k++)
    {
     System.out.print("*");
    }
    if(space==-1)
    {
        for(int j=1;j<star;j++)
        {
         System.out.print("*");
        }
    }
    else
    {
     for(int j=1;j<star;j++ )
     {
      System.out.print("*");   
     }
    }
    space=space+2;
    star=star-1;
    System.out.println();
   }
 }  
}
