import java.util.*;
public class disarium
{
  public static void main()
  {
   
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    
     int s=0,dig,j=0,y=n;
     int i=1;
   
   
     while(!(y<1))
     {
    
      if(((n/(Math.pow(10,(i-1)))>=1)&&((n/(Math.pow(10,(i-1))))<=9))) 
      {
        dig=y%10;
        s=s+(int)(Math.pow(dig,(i-j)));
        
        y=y/10;
        i--;
        j++;
        
      }
      i++;
    
     }
     if(n==s)
     System.out.println("Disarium");
     else
     System.out.println("Not A Disarium");
    
   }
}