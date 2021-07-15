/**
 
 INPUT 

Bluej
OUTPUT 

 Bluej
 Luejb
 Uejbl
 Ejblu
 jblue
*/
public class pattern1
{
   public void pattern1(String s)
 {
  int l=s.length();
  String ch;
  System.out.println();
  s=s.toLowerCase();
  for(int i=0;i<l;i++)
  {
   /*for(int j=1;j<l;j++)
   {*/
   ch=String.valueOf(s.charAt(i));
   if(i!=l-1)
    ch=ch.toUpperCase();
   if(i!=0)
    System.out.print(ch+s.substring(i+1,l)+s.substring(0,i));//+String.valueOf(s.charAt(i-1)).toLowerCase());
   else
    System.out.print(ch+s.substring(i+1,l));//+String.valueOf(s.charAt(i-1)).toLowerCase());
   //}
   System.out.println();
  }
  
 }
}
