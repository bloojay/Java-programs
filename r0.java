import java.util.*;

public class r0
{
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        
        double n;
        int i=0,dig,s=0;
        n=sc.nextDouble();
        while(n>0)
        {
            dig=(int)n%10;
            s=s+(dig*(int)(Math.pow(10,i)));
            if(dig==0)
             i=i-1;
            n=n/10;
            i++;
        }
        System.out.println("ZERO REMOVED NUMBER = "+s);
        
    }
}        