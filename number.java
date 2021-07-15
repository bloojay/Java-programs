public class number
{
 int n,rev=0,d;
 public number(int x)
 {
  n=x;   
 }
 public int reverse(int num)
 {
     
   for(;num>0;num/=10)
   {
     d=num%10;
     rev=rev*10+d;
   } 
   return rev;
 }
 public void palindrome()
 {
  if/*(n==rev)*/(n==this.reverse(n))
  System.out.println("PALINDROME");
  else
  System.out.println("NOT A PALINDROME");
 }
 public void main()
 {
  //number obj=new number(n);   
  /*obj.reverse(n);*/
  //obj.palindrome();
  this.palindrome();
 }
}