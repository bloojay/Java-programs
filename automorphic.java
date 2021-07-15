 
import java.util.*;
public class automorphic
{
 public static void main()
 {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  
  
  int m=n,i=0;
  while(m>0)
  {
   i++;
   m=m/10;
  }
  i=(int)(Math.pow(10,i));
  m=n*n;
  if(m%i==n)
   System.out.println("AUTOMORPHIC NUMBER");
  else
   System.out.println("NOT AN AUTOMORPHIC NUMBER");
  
 }
}