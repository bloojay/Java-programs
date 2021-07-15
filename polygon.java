import java.util.*;
public class polygon
{
 double area;
 public double area(double a,double b,double c)
 {
  double s=(a+b+c)/2.0;  
  area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
  return area;
 }
 public double area(int a,int b,int height)
 {
    
  area=1/2.0*height*(a+b);
  return area;
 }
 public double area(double diagonal1,double diagonal2)
 {
    
  area=1/2.0*diagonal1*diagonal2;
  return area;
 }
 public void main(int choice)
 {
  Scanner sc=new Scanner(System.in);
  polygon obj=new polygon();
  int x,y,z;
  double d1,d2,p,q,r;
  if(choice==1)
  {
   p=sc.nextDouble();
   q=sc.nextDouble();
   r=sc.nextDouble();
   System.out.println(obj.area(p,q,r));
   
  } 
  if(choice==2)
  {
   x=sc.nextInt();
   y=sc.nextInt();
   z=sc.nextInt();
   System.out.println(obj.area(x,y,z));
   
  }
  if(choice==3)
  {
   d1=sc.nextDouble();
   d2=sc.nextDouble();
   System.out.println(obj.area(d1,d2));
  }
  //System.out.println(area);
 }
}