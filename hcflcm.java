
public class hcflcm
{
    int a,b,hcf,lcm;
   public  hcflcm(int x,int y)
   {
       a=x;
       b=y;
   }
   public void calculate()
   {
      for(int i=1;i<=(int)(Math.max(a,b));i++)
      {
       if(a%i==0&&b%i==0)
       hcf=i;
      }
      lcm=a*b/hcf;
      System.out.println("HCF  "+hcf+"\n"+"LCM  "+lcm);
   }
   public void main()
   {
    hcflcm obj=new hcflcm(a,b);
    obj.calculate();
   }
}
