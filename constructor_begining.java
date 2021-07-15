

public class constructor_begining
{
    int i,j,k;
    public  constructor_begining(int i,int j,int k)
    {
     this.i=i;
     this.j=j;
     this.k=k;
    }
    public constructor_begining(int i)
    {
     this.i=i;
     
     
    }
    public constructor_begining(int j,int k)
    {
     
     this.j=j;
     this.k=k;
    }
    public void print()
    {
      System.out.println(i+" "+j+" "+k);
    }
    public void main()
    {
      constructor_begining obj1=new constructor_begining(4,5,6);
      obj1.print();
      new constructor_begining(7,8,9).print();
      new constructor_begining(1,2).print();
      new constructor_begining(1).print();
    }
}
