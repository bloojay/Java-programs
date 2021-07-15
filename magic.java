import java.io.*;
public class magic
{
    public static void main()throws IOException//using two loops(NESTED while)
    {
      InputStreamReader ir=new InputStreamReader(System.in); 
      BufferedReader br=new BufferedReader(ir);
      int n,s=0,dig;
      System.out.println("ENTER THE NUMBER");
      n=Integer.parseInt(br.readLine());
      
      while(!(n>=0&&n<=9))
      {
        s=0;
        while(n>0)
        {
         dig=n%10;
         s=s+dig;
         n=n/10;
        }
        n=s;
      }
      if(n==1)
       System.out.println("MAGIC NUMBER");
      else
       System.out.println("NOT A MAGIC NUMBER");
    }
    public static void main2()throws IOException//using two loops(NESTED while)
    {
      InputStreamReader ir=new InputStreamReader(System.in); 
      BufferedReader br=new BufferedReader(ir);
      int n,s=0,dig;
      System.out.println("ENTER THE NUMBER");
      n=Integer.parseInt(br.readLine());
      s=n;
      while(!(s>=0&&s<=9))
      {
        s=0;
        while(n>0)
        {
         dig=n%10;
         s=s+dig;
         n=n/10;
        }
        n=s;
      }
      if(s==1)
       System.out.println("MAGIC NUMBER");
      else
       System.out.println("NOT A MAGIC NUMBER");
    }
    public static void main3()throws IOException//using one loop
    {
      
      InputStreamReader ir=new InputStreamReader(System.in); 
      BufferedReader br=new BufferedReader(ir);
      int n,s=0,dig;
      System.out.println("ENTER THE NUMBER");
      n=Integer.parseInt(br.readLine());
      
      
      while(n>0)
      {
       dig=n%10;
       s=s+dig;
       n=n/10;
       if(s>9&&n/10==0)
       {
        n=s;
        s=0;
       }
       
      }
        
      
      if(s==1)
       System.out.println("MAGIC NUMBER");
      else
       System.out.println("NOT A MAGIC NUMBER");
    }
}   
      
    
    
    
