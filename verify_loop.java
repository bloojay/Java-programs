
import java.io.*; 
public class verify_loop
{
    public static void main()throws IOException
    {
      long rev=0,rem=0,x=0,n,y,dig,i=0;
      InputStreamReader ir=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(ir);
      System.out.println("ENTER A NUMBER");
      System.out.println();
      n=Long.parseLong(br.readLine());
      y=n;
      while(i<=n)
      {
        
        if(n/Math.pow(10,i)<=9 && n/Math.pow(10,i)>=1)
        {
          //System.out.println("x="+" "+x);
          dig=(y%10);
          y=y/10;
          rem=dig*(long)(Math.pow(10,(i-x)));
          rev=rev+rem;
          x=x+1;
          i=i-1;
         
           
          }
        if(y<1)
        {
         break;
        }
        i++;
      }
      System.out.println("The Reverse Is "+rev);
      if(rev==n)
      System.out.println("IT IS A PALINDROME NUMBER");
      else
      System.out.println("IT IS NOT A PALINDROME NUMBER");
      System.exit(0);
    }
 }