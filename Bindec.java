import java.util.*;
public class Bindec
{
    public static int Bin_to_decimal(int n)
    {
     int s=0;
     for(int i=0;n>0;i++)
     {
      s=s+(n%10)*(int)(Math.pow(2,i));
      n=n/10;
     }
     return s;
    }
}