

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class pattern__y
{
 public static void main()
 {
  for(int i=1;i<=5;i++)
  {
      for(int j=5;j>i;j--)
        System.out.print(" ");
      for(int k=i;k>=1;k--)
        System.out.print(k);
      System.out.println();
  }
 }
}