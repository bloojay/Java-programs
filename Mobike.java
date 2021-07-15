import java.util.*;
public class Mobike
{
 int bno,phno,days,charge;
 String name;
 public Mobike(int bno,int phno,int days,String name)
 {
  this.bno=bno;
  this.phno=phno;
  this.days=days;
  this.name=name;
 }
 public void input()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println();
  System.out.println("ENTER");
  System.out.println();
  System.out.println("BNO");
  bno=Integer.parseInt(sc.nextLine());
  System.out.println("PHNO");
  phno=Integer.parseInt(sc.nextLine());
  System.out.println("DAYS");
  days=Integer.parseInt(sc.nextLine());
  System.out.println("NAME");
  name=sc.nextLine();
 }
 public void compute()
 {
  if(days<=5)
   charge=days*500;
  else if(days<=10)
   charge=5*500+(days-5)*400;
  else
   charge=5*500+5*400+(days-10)*200;
 }
 public void display()
 {
     System.out.println("Bike No.\tPhone No.\tName\tNo.of days\tCharge");
     System.out.println(bno+"\t\t  "+phno+"\t"+name+"\t\t  "+days+"\t\t"+charge);
 }
 public void main()
 {
    Mobike obj=new Mobike(bno,phno,days,name);
    obj.input();
    obj.compute();
    obj.display();
 }
}