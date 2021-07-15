import java.io.*;
public class sampleruns
{
    public static void main(int h,int b)throws IOException
    {
     
        InputStreamReader ir = new InputStreamReader(System.in);
        for(int i=1;i<=h;i++)
        {
         for(int j=1;j<=b;j++)
         {
          if(i==1||i==h/2||j==1||j==b)//||(i>=h/2&&j==c))
           System.out.print('*'+" ");
          /*if(i>=h/2&&j==c)
           //System.out.print(ch+" ");*/
          else
           System.out.print("  ");
      
         }
         System.out.println();
       }
    }
}