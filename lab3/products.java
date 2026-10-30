package lab3;
import java.util.Scanner;

public class products {
    String maSP;
    String tenSP;
    double dongia;

    public products(){
        this.maSP = "S01";
        this.tenSP = "dia";
        this.dongia = 2000;
    }

    public products(String maSP, String tenSP, double dongia){
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.dongia = dongia;
    }

    public products(products a){
        this.maSP = a.maSP;
        this.tenSP = a.tenSP;
        this.dongia = a.dongia;
    }

    Scanner sc = new Scanner(System.in);

    public void input_products(){

        System.out.println("nhap ma san pham");
        this.maSP = sc.nextLine();

        System.out.println("nhap ten san pham");
        this.tenSP = sc.nextLine();

        System.out.println("nhap gia");
        this.dongia = sc.nextDouble();
    }
    
    @Override
    public String toString() {
        return "Ma SP: " + maSP
                + ", Ten SP: " + tenSP
                + ", Don gia: " + dongia;
    }

    //tinhTienGiamGia(double phanTramGiam): tính số tiền được giảm cho một sản phẩm.
    public double tinhTienGiamGia(double phanTramGiam){

        double duocgiam = this.dongia * phanTramGiam;

        return duocgiam;
    }

    //tinhDonGiaSauGiam(double phanTramGiam): tính đơn giá sau khi giảm giá.
    public double tinhDonGiaSauGiam(double phanTramGiam){
        double saugiam = 0;
        saugiam = this.dongia - tinhTienGiamGia(phanTramGiam);

        return saugiam;
    }

    public void show_product(){
        System.out.println("ma san pham: " + this.maSP + "ten san pham: " + this.tenSP + "don gia: " + this.dongia);
    }
}
