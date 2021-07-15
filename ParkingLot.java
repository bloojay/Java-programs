import java.util.*;
public class ParkingLot
{
    int vno,hrs;
    double bill;
  public  ParkingLot()
  {
        vno=0;
        hrs=0;
        bill=0.0;
  }
  public ParkingLot(int a,int b)
  {
    vno=a;
    hrs=b;
  }
  public void input()
  {
     Scanner sc=new Scanner(System.in);
     vno=sc.nextInt();
     hrs=sc.nextInt();
  }
  public void calculate()
  {
     if(hrs<=1)
      bill=hrs*3;
     else
      bill=3+(hrs-1)*1.50;
  }
  public void display()
  {
    System.out.println("VNO  "+vno+"\nHOURS  "+hrs+"\nCHARGE  "+bill);
  }
  public void main()
  {
     ParkingLot ob=new  ParkingLot();
     ob.input();
     ob.calculate();
     ob.display();
     ParkingLot obj=new  ParkingLot(vno,hrs);
     obj.calculate();
     obj.display();
  }
}
