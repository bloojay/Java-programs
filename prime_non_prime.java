import java.util.*;

public class prime_non_prime
{
    
    
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int c,ch;
        System.out.println("ENTER 2 FOR NON-PRIME AND 1 FOR PRIME");
        ch=sc.nextInt();
        loop:
        for(int i=1;i<=100;i++)
        {
            c=0;
         for(int j=1;j<=i;j++)
         {
             if(i%j==0)
             c++;
         }
         switch(ch)
         {
          case 1:
          if(c==2)
          System.out.print(i+"  ");
          break;
          case 2:
          if(c!=2)
          System.out.print(i+"  ");
          break;
          default:
          System.out.println("INVALID CHOICE");
          break loop;
         }
        }
    }
}
   
