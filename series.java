import java .util.*;
public class series
{
 double sum=0,i=1,j=1,n=0,a=0,k;
 public double Series(double n)
 {
    //this.n=n;
    if(1>n)
    return 0;
    else
    {
     sum=sum+1.0/n;
     //i++;
     n--;
     //this.Series(n);
     return sum+Series(n);
    }
 }
 
 public double Series(double n,double a)
 {
    //this.a=a;
    //this.n=n;
    if(n<1)
    return 0;
    else
    {
     sum=i/(Math.pow(a,(i+1)));
     //j++;
     i+=3;
     n--;
     //this.Series(n,a);
     return sum+Series(n,a);
    }
 }
 public void main(int choice)
 {
  Scanner sc=new Scanner(System.in);
  i=1;
  j=1;
  
  if(choice==1) 
  {
   n=sc.nextDouble();
   k=this.Series(n);
   System.out.println("SUM "+k);
  }
  else if(choice==2)
  {
   n=sc.nextDouble();
   a=sc.nextDouble();
   k=this.Series(n,a);
   System.out.println("SUM  "+k);
  }
  sum=0;
 }
}