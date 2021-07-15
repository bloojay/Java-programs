//THIS IS A NINTH CLASS FACT BASED PROGRAM CREATED IN TENTH TO ASK SIR SO IN THIS PACKAGE
import java.util.*;
import java.io.*;
class expt
{
 public static void main()throws IOException
 {
   int i,j,k,l,c;
   Scanner sc=new Scanner(System.in);
   c=sc.nextInt();
   for(i=c;i>=1;i--)
   {
    for(j=1;j<=i;j++)
    {
        System.out.print("*");
    }
    for(k=1;k<=c-i;k++)
    {
        System.out.print("  ");
    }
    for(l=1;l<=i;l++)
    {
        System.out.print("*");
    }
    System.out.println();
   }
 }
 
}