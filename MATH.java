public class MATH
{
 public static double maxn(double a,double b)
 {
   if(a>b)
    return a;
   else if(b>a)
    return b;
   else
    return a;
 }
 public static double minn(double a,double b)
 {
   if(a<b)
    return a;
   else if(b<a)
    return b;
   else
    return a;
 }
 public double facto(double x)
 {
      double j=1;
      for(int i=1;i<=x;i++)
       j=j*i;
      return j; 
 }
 public static double pown(double a,double b)
 {
     double s=1.0;
   for(double i=1;i<=b;i++)
    s=s*a;
   return s;
 }
}