package review1;
import java.util.Scanner;

public class Bnhan {
   public String hten;
   public boolean gtinh;
   public int nsinh;
   public float cnang;

   Bnhan(){
    this.hten = "";
    this.gtinh = true;
    this.nsinh = 0;
    this.cnang = 0.0f;
   }
   Bnhan(Bnhan a){
    this.hten = a.hten;
    this.gtinh = a.gtinh;
    this.nsinh = a.nsinh;
    this.cnang = a.cnang;
   }

   Scanner sc = new Scanner(System.in);
   public void nhapbn(){
        System.out.println("nhap ten");
        this.hten = sc.nextLine();
        System.out.println("nhap gioi tinh");
        this.gtinh = sc.nextBoolean();
        sc.nextLine();
        System.out.println("nhap nam sinh");
        this.nsinh = sc.nextInt();
        sc.nextLine();
        System.out.println("nhap can nang");
        this.cnang = sc.nextFloat();
   }
   
   public void in(){
    System.out.println("ten: " + this.hten);
    System.out.println("gtinh: " + this.gtinh);
    System.out.println("nam sinh: " + this.nsinh);
    System.out.println("can nang: " + this.cnang);
   }
   public static void main(String[] args) {
    Bnhan bn1 = new Bnhan();
    bn1.nhapbn();
    bn1.in();
    
    Bnhan bn2 = new Bnhan(bn1);
    bn2.in();
   }
}
