

public class constions//verify
{
    int a,b;
     double area;
    public void area(int a,int b)
    {
    
     area=this.a+b;
    }
    public void main()
    {
     constions obj=new constions();
     obj.a=20;
     obj.b=30;
     obj.area(50,250);
     System.out.println(obj.area);
     /*More preference to variables of a method than object if this is not used*/
    }
}
