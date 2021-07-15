import java.util.*;
import java.io.*;
public class KrishnaMurthy
{
    int x,y;
    public KrishnaMurthy()
    {
     x=0;
     y=0;
    }
    public void accept() throws Exception
    {
     Scanner sc= new Scanner(System.in);
     InputStreamReader ir= new InputStreamReader(System.in);
     BufferedReader br=new BufferedReader(ir);
     x=sc.nextInt();
     y=Integer.parseInt(br.readLine());
     
    }
    public int facto(int a)
    {
     int f=1;
     for(int i=1;i<=a;i++)
     {
      f=f*i; 
     }
     return f;
    }
    public int sumofDigitsfactorial(int n)
    {
     int m=n,d,s=0;
     for(int i=1;m>0;i++)
     {
      d=m%10;
      m=m/10;
      s=s+this.facto(d);
     }
     return s;
    }
    public boolean checkKrishnaMurthy(int p)
    {
     if(this.sumofDigitsfactorial(p)==p)
      return true;
      else
       return false;
    }
    public void display()throws Exception
    {
        //KrishnaMurthy ob=new KrishnaMurthy();
        //ob.accept();
        
        this.accept();
        for(int i=x;i<=y;i++)
        {
         if(this.checkKrishnaMurthy(i)==true) /** Maybe Written Without this and will still give correct output */
         {      
          System.out.println(i);
         }
        }
        
    } 
    public void main() throws Exception
    {
     KrishnaMurthy obj=new KrishnaMurthy();
     obj.display();
    }
}