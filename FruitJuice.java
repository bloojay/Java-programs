import java.util.*;
public class FruitJuice
{
 int product_code;
 String flavour;
 String pack_type;
 int pack_size;
 int product_price;
 public FruitJuice()
 { 
     product_code=0;
     flavour=" ";
     pack_type= " ";
     pack_size=0;
     product_price=0;
 }
 public void input()
 {
     System.out.println("Enter");
     System.out.println();
     System.out.println("product_code");
     Scanner sc= new Scanner(System.in);
     //sc.nextLine();
     product_code=Integer.parseInt(sc.nextLine());
     System.out.println("flavour");
     flavour=sc.nextLine();
     System.out.println("pack_type");
     pack_type=sc.nextLine();
     System.out.println("pack_size");
     pack_size=sc.nextInt();
     System.out.println("product_price");
     product_price=sc.nextInt();
 }
 public void discount()
 {
     product_price=product_price-10;
 }
 public void display()
 {
     System.out.println( "product_code\tflavour\tpack_type\tpack_size\tproduct_price");
     System.out.println( product_code+"\t"+flavour+"\t"+pack_type+"\t"+pack_size+"\t"+product_price);
 }
 public void main()
 {
     FruitJuice obj=new FruitJuice();
     obj.input();
     obj.discount();
     obj.display();
 }
}