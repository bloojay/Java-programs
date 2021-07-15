import java.util.*;
public class Arrays
{
    public static void bubble()
    {
       int ar[]=new int[10];
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the elements");
       for (int i=0;i<=9;i++)
       {
        ar[i]=sc.nextInt(); 
         
       }
       System.out.println("ENTER SORT TYPE AS ASCENDING OR DESCENDING");
       String s=sc.nextLine();
      if(s.compareToIgnoreCase("ASCENDING")==1)
      {
       for(int i=ar.length-1;i>0;i--)//ascending
       {
        for(int j=0;j<i;j++)
        {
         if(ar[j]>ar[j+1])
         {
            ar[j]=ar[j+1]+ar[j];
            ar[j+1]=ar[j]-ar[j+1];
            ar[j]=ar[j]-ar[j+1];
         }
        }
       }
      }
       for(int i=0;i<10;i++)
        System.out.println(ar[i]);
    }
    public static void selection()
    {
       int ar[]=new int[10];
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the elements");
       for (int i=0;i<=9;i++)
       {
        ar[i]=sc.nextInt(); 
         
       }
       /*System.out.println("ENTER SORT TYPE AS ASCENDING OR DESCENDING");
       String s=sc.next();
       
      if(s.compareToIgnoreCase("ASCENDING")==1)
      {*/
       int min;
       for(int i=ar.length-1;i>0;i--)//descending
       {
        min=i;
        for(int j=0;j<i;j++)
        {
         if(ar[min]>ar[j])
         {
            min=j;
         }
        }
        int c=ar[i];
        ar[i]=ar[min];
        ar[min]=c;
       }
      //}
       for(int i=0;i<10;i++)
        System.out.println(ar[i]);
    }
    public static void binary()
    {
     int ar[]=new int[10],up,l,m,s;
     Scanner sc=new Scanner(System.in);
     
     System.out.println("Enter the elements");
     for (int i=0;i<=9;i++)
     {
      ar[i]=sc.nextInt(); 
     }
     s=sc.nextInt();
     up=ar.length-1;
     l=0;
     m=(l+up)/2;
     while(l<=up)
     {
        if(s>ar[m])
          l=m+1;
        else if(s>ar[m])
          up=m-1;
         else
          {
           System.out.println("Element Occurs at "+m);
           break;
          }
          m=(l+up)/2;
          //l++;
     }
    }
    public static void linear()
    {
     int ar[]=new int[10],s;
     Scanner sc=new Scanner(System.in);
     
     System.out.println("Enter the elements");
     for (int i=0;i<=9;i++)
     {
      ar[i]=sc.nextInt(); 
     }
     s=sc.nextInt();
    int i=0;
     while(i<ar.length)
     {
        if(s==ar[i])
          
          System.out.println("Element Occurs at "+i);
         i++;
     }
    }
    public static void experiment()
    {
     Scanner sc= new Scanner(System.in);
     int ar[]=new int[10];
     int m;
     for(int i=0;i<10;i++)
     {
      ar[i]=sc.nextInt();   
     }
     for(int i=0;i<10;i++)
     {
      for(int j=0;j<=i;j++)//j<=10-Works as well
      {
          if(ar[i]<ar[j])
          {
             m=ar[i];
             ar[i]=ar[j];
             ar[j]=m;
          }
      }
     }
     for(int i=0;i<10;i++)
     {
         System.out.print(ar[i]+" ");
     }
    }
}