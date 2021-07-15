public class draw
{
 int i=1,j=1,k=5;
 public double polygon(int n,char ch)
 {
  if(i>n)
   return 0.0;
  else
  {
   if(j<=n)
   {
    System.out.print(ch);
    j++;
   }
   else
   {
    System.out.println();
    i++;
    j=1;
   }
   return polygon(n,ch);
  }
 }
 public double polygon(int x,int y)
 {
  if(i>y)
   return 0.0;
  else
  {
   if(j<=x)
   {
    System.out.print("@");
    j++;
   }
   else
   {
    System.out.println();
    i++;
    j=1;
   }
   //return polygon(x,y);
   this.polygon(x,y);
   return 0.0;
  }
 }
 public double polygon()
 {
     //int m;
  if(i>5)
   return 0.0;
  else
  {
   //m=0;
   if(k>i)//&&m==0)
   {
    System.out.print(" ");
    k--;
    return polygon();
   }
   
   /*else
    m=1;*/
   // while(k>i)
    //{System.out.print(" "); k--;}
   if(j<=i)//&&m==1)
   {
    System.out.print("@ ");
    j++;
   }
   else
   {
    System.out.println();
    i++;
    j=1;
    k=5;
   // m=0;
   }
   //return polygon(x,y);
   this.polygon();
   return 0.0;
  }
 }
}