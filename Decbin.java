import java.util.*;
public class Decbin
{
    public static int /*Decbin*/ Decimal_To_Binary(int n)
    {
        int rem;
        int s=0;
        String str="";
        while(n>=1)
        {
            rem=n%2;
            //s=s*10+rem;
            str=str+rem;
            n=n/2;
        }
        StringBuffer ob=new StringBuffer(str);
        str=ob.reverse().toString();
        int s1=0;
        /*while(s>0)
        {
            s1=s1*10+s%10;
            s/=10;
        }
        s=s1;
        /*Decbin obj=new Decbin();
        obj.str=str;
        obj.s=s;*/
        return Integer.valueOf(str);
    }
}