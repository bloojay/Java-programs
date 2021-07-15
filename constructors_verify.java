import java.util.*;
public class constructors_verify
{
  int l,br,c;
  public constructors_verify(int l,int br)
  {
   this.l=l;
   this.br=br;
   
  }
  /*public void accept()
  {
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
  }*/
  public void calculate()
  {
   c=l*br;  
  }
  public void display()
  {
   System.out.println("ANSWER = "+c);  
  }
  public void main()
  {
      constructors_verify obj=new constructors_verify(l,br);
      //obj.accept();
      obj.calculate();
      obj.display();
      //obj.main();
  }
}
