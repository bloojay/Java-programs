import java.io.*;
import java.util.*;
public class factorial
{ 
    public static void iter()throws IOException
    {
        int n,x,y=1;
        System.out.println("ENTER THE INTEGER");
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        n=Integer.parseInt(br.readLine());
        if(n==0||n==1)
        System.out.println("The factorial is"+1);
        else if ((n>0)&&(n!=1))
        {
            
            for(x=1;x<=n;x++)
            {
              y=y*x;
            }
            System.out.println("The factorial is"+" "+y);
        }
        else
        System.out.println("ENTER A VALID VALUE");
    }
    public static void teri()throws IOException
    {
         int n,x,y=1,sum=0;
        System.out.println("ENTER THE INTEGER");
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        n=Integer.parseInt(br.readLine());
        if(n==0||n==1)
        sum=1;
        else if ((n>0)&&(n!=1))
        {
            
            for(x=1;x<=n;x++)
            {
              y=y*x;
              sum=sum+y;
            }
            System.out.println("The sum of factorial is"+" "+sum);
        }
        else
        System.out.println("ENTER A VALID VALUE");
    }
    public void main()throws IOException
    {
        factorial f=new factorial();
        f.iter();
        f.teri();
    }
}


