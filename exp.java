
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
class exp {
    public static String pi(int N)
    {
        String str="";
      //BigDecimal A=new BigDecimal("3");
       BigDecimal B=new BigDecimal("3"); 
       int j=2;
        for(int i=1;i<=N+1;i++)
        {
            
            if(i%2!=0)
            B=B.add(BigDecimal.valueOf(4.0/(j*(j+1)*(j+2))));
            else
            B=B.subtract(BigDecimal.valueOf(4.0/(j*(j+1)*(j+2))));
            j=j+2;
        }
        System.out.println(B);
        
         str=String.valueOf(B);
        return str;
    }
	public static void main (String[] args)throws IOException
	{
	    InputStreamReader ir = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(ir);
	    int T=Integer.parseInt(br.readLine());
	    for(int i=0;i<T;i++)
	    {
	        int N=Integer.parseInt(br.readLine());
	         System.out.println(pi(N));
	        if(N>=2)
	        System.out.println(pi(N).charAt(N));
	        else
	        System.out.println(pi(N).charAt(N-1));
	    }
	
	}
}