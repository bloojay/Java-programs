public class fiborookie
{
 int c,n,con=1;
 public fiborookie(int x)
 {
  n=x;
 }
 public int fibo(int a,int b)
 {
  
  c=a+b;
  /*if(c>=n)
   return 0;*/
   if(con>(n-2))
   return 0;
  else
  {
   System.out.print(","+c);
   con++;
   return fibo(b,c);
  }
 }
 public void main(int n)
 {
  this.n=n;
  System.out.print(0+","+1);
  this.fibo(0,1);
 }
}