
import java.io.*;
public class Library
{
  int acc_num;
  String title;
  String author;
  int days;
  double fine;
  public Library()
  {
     acc_num=0;
     title="";
     author="";
  }
  public Library(int acc_num,String title,String author)
  { 
    this.acc_num=acc_num;
    this.title=title;
    this.author=author;
  }    
  public void input()throws Exception
  {
    InputStreamReader ir=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(ir);
    acc_num=Integer.parseInt(br.readLine());
    title=br.readLine();
    author=br.readLine();
  }
  public void compute()throws Exception
  {
    InputStreamReader ir=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(ir);
    days=Integer.parseInt(br.readLine());
    fine=days*2;
  }
  public void display()
  {
    System.out.println("Accession Number\tTitle\tAuthor");
    System.out.println(acc_num+"\t"+title+"\t"+author);
    System.out.println("DAYS  "+days+"\nFINE"+fine);
  }
  public void main()throws Exception
  {
    Library obj=new Library();
    obj.input();
    obj.compute();
    obj.display();
    Library ob=new Library(acc_num,title,author);
    ob.compute();
    ob.display();
  }
}
