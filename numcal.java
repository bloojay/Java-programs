public class numcal
{
 public static void num_cal(int num,char ch)
 {
  switch(ch)
  {
   case 's':
    System.out.println("SQUARE "+num*num);
    break;
   default:
    System.out.println("CUBE "+num*num*num);
  }
 }
 public static void num_cal(int a,int b,char ch)
 {
  switch(ch)
  {
   case 'p':
    System.out.println("PRODUCT "+a*b);
    break;
   default:
    System.out.println("SUM "+(a+b));
  }
 }
 public static void num_cal(String s1,String s2)
 {
    if(/*s1.compareTo(s2)==0)*/s1.equals(s2))
    System.out.println("EQUAL");
    
    else
    System.out.println("NOT EQUAL");
  
 }
}