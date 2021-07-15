
import java.util.*;
public class convert
{
  double centigrade=0.0,f; 
  public convert()
  {
   centigrade=0.0;
   f=0.0;
   Scanner sc=new Scanner(System.in);
    centigrade=sc.nextDouble();
  }
  public convert(double centigrade)
  {
    this.centigrade=centigrade;  
    
  }
  public double centitofah()
  {
     
     f=9.0*centigrade/5.0+32.0;
     System.out.println("TEMPERATURE "+f);
     return 0.0;
  }
  public void main()
  {
    convert obj=new convert();
    obj.centitofah();
    convert ob=new convert(centigrade);
    ob.centitofah();
  }
}
