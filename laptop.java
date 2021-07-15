
import java.util.*;
public class laptop
{
    String name;
    double price,dis,amt;
    public laptop(double a,String b)
    {
        name=b;
        price=a;
        dis=0.0;
        amt=0.0;
    }
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
        price=sc.nextDouble();
    }
    public void compute()
    {
     if(price<=25000)
     dis=5.0/100.0*price;
     else if(price<=50000)
     dis=7.5/100.0*price;
     else if(price<=100000)
     dis=10.0/100.0*price;
     else
     dis=15.0/100.0*price;
     amt=price-dis;
    }
    public void display()
    {
     System.out.println("Name "+name);
     System.out.println("MRP "+price);
     System.out.println("Discount "+dis);
     System.out.println("Price After Discount "+amt);
    }
    public void main()
    {
     laptop obj=new laptop(100.0,"ANSHUMAN");
     obj.accept();
     obj.compute();
     obj.display();
    }
}
