import java.util.*;
public class rookie
{
  
  int i=1,j=1,a;
  public rookie(int a)
  {
    this.a=a;
  }
  
  public int fun()throws Exception
  {
    //rookie obj1=new rookie();
     if(j>i)
      return 0;
     else
     {
     
     j++;
     System.out.print("*");
     //new rookie()
     this.fun();
     return 0;
    }
  }
  public int fun2()throws Exception
  {
      //rookie obj2=new rookie();
      
      if(i>a)
       return 0;
      else
      {
        System.out.println();
        //obj2.fun();
        //new rookie()
        this.fun();
        i++;
        j=1;
        //new rookie()
        this.fun2();
        //return fun();
        return 0;
      }
  }
  public void main()throws Exception
  {
   /**Scanner sc=new Scanner(System.in);
   a=sc.nextInt();
   /** try
   //{
    rookie obj=new rookie();
    obj.fun2();
   }
   catch(Exception e)
   
     System.out.println("EXCEPTION: "+e); 
   }
   finally
   {*/
    
    rookie obj=new rookie(a);
    obj.fun2();
   //}
  }
}