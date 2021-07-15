import java.util.*;
public class bin_bubb
{
 public static void main()
 {
  Scanner sc=new Scanner(System.in);
  // System.out.println("Enter the number of elements");
     int m;//=sc.nextInt();
  int ar[]=new int[10];
  int mid;
  int ll=0,ul=9;
  System.out.println("Enter the elments");
  for(int i=0;i<10;i++)
   ar[i]=sc.nextInt();
  for(int i=0;i<9;i++)
  {
    for(int j=0;j<9-(i+1);j++)
    {
     if(ar[j]>ar[j+1])
     {
      ar[j]=ar[j]+ar[j+1];
      ar[j+1]=ar[j]-ar[j+1];
      ar[j]=ar[j]-ar[j+1];
     }
    }
  }
  for(int i=0;i<10;i++)
   System.out.println(ar[i]);
  System.out.println("Enter the element to be searched");
  m=sc.nextInt();
  for(mid=(ll+ul)/2;ll<=ul;mid=(ll+ul)/2)
  {
     if(m>ar[mid])
      ll=mid+1;
     else if(m<ar[mid])
      ul=mid-1;
     else
     {
      System.out.println("ELEMENT FOUND AT INDEX "+mid);
      break;
     }
  }
  if(!(ll<=ul))
   System.out.println("Element not found!!");
 }
}