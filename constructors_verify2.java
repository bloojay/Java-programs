import java.io.*;
import java.util.*;
public class constructors_verify2
{
    int m,k,j,l,i,c,b;
    public constructors_verify2(int m,int k)
    {
       this.m=m;
       this.k=k;
       for(i=10;i>=1;i--)
       {
        if(i%2!=0)
        System.out.println("I AM ANSHUMAN");
        else
        System.out.println("HELLO");
       }
    }
    public void max(int j,int l)
    {
     this.j=j;
     this.l=l;
    }
    public void calcu()
    {
      c=Math.max(j,l);
      b=Math.max(m,k);
    }
    public void display()
    {
     System.out.println("m vs k //MAX  "+b);
     System.out.println("j vs l//MAX  "+c);
    }
    public void main()
    {
     new constructors_verify2(m,k);
     //new constructors_verify2(m,k).max(j,i);/*THIS CANNOT CALL*/
     constructors_verify2 obj=new constructors_verify2(m,k);
     obj.max(j,l);
     obj.calcu();
     obj.display();
    }
}
