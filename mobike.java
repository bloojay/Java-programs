import java.io.*;
import java.util.*;
public class mobike
{
    String bno,phno,name;
    int days;
    double charge;
    public void input()throws IOException
    {
      
      InputStreamReader ir=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(ir);
      name=br.readLine();
      bno=br.readLine();
      phno=br.readLine();
      days=Integer.parseInt(br.readLine());
    }
    public void compute()
    {
        if(days<=5)
        charge=500*days;
        else if(days>5&&days<=10)
        charge=500*5+(days-5)*400;
        else
        charge=500*5+400*5+(days-10)*200;
    }
    public void display()
    {
        System.out.println("Bike No\t\t\t"+"Phone No"+ "\t\t\t"+"Name\t\t\t"+"Number of days"+" \t" +"Charge");
        System.out.println("-------"+"\t"+"--------  "+"\t"+"----\t"+"--------------"+"\t"+"------------");
        System.out.println(bno+"\t\t\t"+phno+"\t\t\t"+name+"\t\t\t"+days+"\t"+charge);
       
    }
    public void main()throws IOException
    {
        mobike mo=new mobike();
        mo.input();
        mo.compute();
        mo.display();
    }
}
