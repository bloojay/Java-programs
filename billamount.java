import java.util.*;
public class billamount
{
    String name;
    int unit,m;
    double amt,dis,tot_bill;
    public void accept()
    {
      Scanner sc=new Scanner(System.in);
      name=sc.nextLine();
      unit=sc.nextInt();
    }  
    public void compute(int mno)
    {
        if(unit<=170)
        amt=unit*0.80+200;
        else if(unit>170&&unit<=250)
        amt=170*0.80+(unit-170)*1.00+200;
        else if(unit>250&&unit<=350)
        amt=170*0.80+80*1.00+(unit-250)*1.75+200;
        else
        amt=170*0.80+80*1.00+100*1.75+(unit-350)*2.00+200;
        if(mno==1)
        dis=2.0/100.0*amt;
        else if(mno==2)
        dis=5.0/100.0*amt;
        else
        dis=7.0/100.0*amt;
        tot_bill=amt-dis;
        m=mno;
        
    }
    
    public void display()
    {
        
        System.out.println("NAME "+name);
        System.out.println("UNITS "+unit);
        System.out.println("MONTH "+ m);
        System.out.println("AMOUNT "+amt);
        System.out.println("TOTAL BILL "+tot_bill);
        System.out.println("DISCOUNT "+dis);
    }
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        billamount obj=new billamount();
        obj.accept();
        int x=sc.nextInt();
        obj.compute(x);
        obj.display();
    }
}    
 