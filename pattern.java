import java.util.*;
public class pattern
{
 public void pattern()
 {
  Scanner sc=new Scanner(System.in);
  String x;
  x=sc.nextLine();
  for(int i=x.length()-1;i>=0;i--)
  {
   for(int j=0;j<=i;j++)
    System.out.print(x.charAt(j));
   System.out.println();
  }
  //return 4;
 }
  public static void pattern(String s)
 {
  int l=s.length();
  for(int i=0;i<l;i++)
  {
   for(int j=1;j<l;j++)
   {
    System.out.print(s.substring(i+1,l)+s.substring(0,i));
   }
   System.out.print(s.substring(i+1,l)+s.substring(0,i));
   System.out.println();
  }
 }
}