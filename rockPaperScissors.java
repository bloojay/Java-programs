import java.util.*;       
import java.io.*;
public class rockPaperScissors

{
   
    public static void reti()
    {
      Scanner in=new Scanner(System.in);
      int k,r,p,c,sc=0,sp=0;
      String y,opt;
      System.out.println();
      System.out.println();
      System.out.println("ENTER TYPE OF GAME AS ROUND OR CONTINUE");
      opt=in.nextLine();
      if(opt.compareTo("ROUND")==0)
      {
          System.out.println("ENTER NUMBER OF ROUNDS");
      r=in.nextInt();
      for(k=1;k<=r;k++)
      {
          System.out.println();
          System.out.println("THE OPTIONS ARE");
          System.out.println();
          System.out.println("1)STONE");
          System.out.println("2)PAPER");
          System.out.println("3)SCISSORS");
          System.out.println();
          System.out.println("ENTER OPTION AS 1 OR 2 OR 3");
          p=in.nextInt();
          if(p!=1&&p!=2&&p!=3)
          System.out.println("ENTER A VALID OPTION");
          else
          {
              c=(int)((Math.random()*(4-1))+1);
              if(c==1&&p==2)
             {
               System.out.println("COMPUTER CHOOSES STONE YOU CHOOSE PAPER");
               System.out.println("YOU WIN!!!!");
               sp=sp+1;
             }
              else if(c==2&&p==1)
             {
                System.out.println("COMPUTER CHOOSES PAPER YOU CHOOSE STONE");
                System.out.println("COMPUTER WINS");
                sc=sc+1;
             }
             else if(c==3&&p==1)
             {
               System.out.println("COMPUTER CHOOSES SCISSORS YOU CHOOSE STONE");
               System.out.println("YOU WIN!!!!");
               sp=sp+1;
             }
             else if(c==3&&p==2)
             {
                 System.out.println("COMPUTER CHOOSES SCISSORS YOU CHOOSE PAPER");
                 System.out.println("COMPUTER WINS");
                 sc=sc+1;
             }
             else if(c==2&&p==3)
             {
               System.out.println("COMPUTER CHOOSES PAPER YOU CHOOSE SCISSORS");
               System.out.println("YOU WIN!!!!");
               sp=sp+1;
               //System.out.println("comp choice"+c);
             }
             else if(c==1&&p==3)
             {
                 System.out.println("COMPUTER CHOOSES STONE YOU CHOOSE SCISSORS");
                 System.out.println("COMPUTER WINS");
                 sc=sc+1;
                 //System.out.println("comp choice"+c);
             }
             else if(c==p)
             {
               System.out.println("THIS IS A TIE"); 
               
               sc=sc+1;
               sp=sp+1;
             }
          }
      }
    
      System.out.println("FINAL RESULTS");
      System.out.println();
      System.out.println("YOUR FINAL SCORE IS"+" "+sp);
      System.out.println("COMPUTER'S FINAL SCORE IS"+" "+sc);
      System.out.println();
      if(sc>sp)
      System.out.println("COMPUTER WINS THE GAME");
      else if(sp>sc)
      System.out.println("YOU WIN THE GAME!!!! :D");
      else 
      System.out.println("BOTH HAVE EQUAL SCORES SO THIS IS A TIE");
     
     }
     else if(opt.compareTo("CONTINUE")==0)
     {
      do  
      {
          System.out.println();
          System.out.println("THE OPTIONS ARE");
          System.out.println();
          System.out.println("1)STONE");
          System.out.println("2)PAPER");
          System.out.println("3)SCISSORS");
          System.out.println();
          System.out.println("ENTER OPTION AS 1 OR 2 OR 3");
          p=in.nextInt();
          if(p!=1&&p!=2&&p!=3)
          System.out.println("ENTER A VALID OPTION");
          else
          {
              c=(int)((Math.random()*(4-1))+1);
              if(c==1&&p==2)
             {
               System.out.println("COMPUTER CHOOSES STONE YOU CHOOSE PAPER");
               System.out.println("YOU WIN!!!!");
               sp=sp+1;
             }
              else if(c==2&&p==1)
             {
                System.out.println("COMPUTER CHOOSES PAPER YOU CHOOSE STONE");
                System.out.println("COMPUTER WINS");
                sc=sc+1;
             }
             else if(c==3&&p==1)
             {
               System.out.println("COMPUTER CHOOSES SCISSORS YOU CHOOSE STONE");
               System.out.println("YOU WIN!!!!");
               sp=sp+1;
             }
             else if(c==3&&p==2)
             {
                 System.out.println("COMPUTER CHOOSES SCISSORS YOU CHOOSE PAPER");
                 System.out.println("COMPUTER WINS");
                 sc=sc+1;
             }
             else if(c==2&&p==3)
             {
               System.out.println("COMPUTER CHOOSES PAPER YOU CHOOSE SCISSORS");
               System.out.println("YOU WIN!!!!");
               sp=sp+1;
               //System.out.println("comp choice"+c);
             }
             else if(c==1&&p==3)
             {
                 System.out.println("COMPUTER CHOOSES STONE YOU CHOOSE SCISSORS");
                 System.out.println("COMPUTER WINS");
                 sc=sc+1;
                 //System.out.println("comp choice"+c);
             }
             else if(c==p)
             {
               System.out.println("THIS IS A TIE"); 
               
               sc=sc+1;
               sp=sp+1;
             }
          }
          System.out.println("DO YOU WANT TO CONTINUE?");
          System.out.println("ENTER YES OR NO");
          y=in.next();
      }
      while(y.compareTo("YES")==0);
      System.out.println("FINAL RESULTS");
      System.out.println();
      System.out.println("YOUR FINAL SCORE IS"+" "+sp);
      System.out.println("COMPUTER'S FINAL SCORE IS"+" "+sc);
      System.out.println();
      if(sc>sp)
      System.out.println("COMPUTER WINS THE GAME");
      else if(sp>sc)
      System.out.println("YOU WIN THE GAME!!!! :D");
      else 
      System.out.println("BOTH HAVE EQUAL SCORES SO THIS IS A TIE");
     }
     else
     System.out.println("ENTER A VALID GAME TYPE");
   }
}





