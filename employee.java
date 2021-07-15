import java.io.*;
public class employee
{
double basic,da=0,hra=0,pf=0,gp=0,np=0;
 public  void input()throws IOException
 {
     
     InputStreamReader ir=new InputStreamReader(System.in);
     BufferedReader br=new BufferedReader(ir);
     System.out.println("Enter basic salary");
     basic=Double.parseDouble(br.readLine());
 }
 public  void calculate() 
 {
     employee input=new employee();
     da=(double)80/100*basic;
     hra=(double)12/100*basic;
     pf=(double)8.33/100*basic;
     gp=basic+da+hra;
     np=gp-pf;
 }
 public void display() 
 {
     employee calculate=new employee();
     System.out.println("basic "+basic);
     System.out.println("da "+da);
     System.out.println("hra "+hra);
     System.out.println("pf "+pf);
     System.out.println("gp "+gp);
     System.out.println("np "+np);
 }
 public void main()throws IOException
 {
     employee object=new employee();
      object.input();
     object.calculate();
     object.display();
 }  
 
}    