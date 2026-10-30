package lab3;
import java.util.Scanner;

public class bills {
    String maHD;
    products sanpham;
    int soluong;

    public bills(){
        String maHD = "B001";
        this.sanpham = new products("k001", "tensp", 2000);
        int soluong = 10;
    }

    public bills(String maHD, products sanpham, int soluong){
        this.maHD = maHD;
        this.sanpham = sanpham;
        this.soluong = soluong;
    }

    public bills(bills a){
        this.maHD = a.maHD;
        this.sanpham = a.sanpham;
        this.soluong = a.soluong;
    }

    Scanner sc = new Scanner(System.in);

    public void input_bills(products sp){

        System.out.println("nhap ma hoa don");
        this.maHD = sc.nextLine();

        this.sanpham = sp;

        System.out.println("nhap so luong");
        this.soluong = sc.nextInt();
        sc.nextLine();
    }

    public void to_String(){
        System.out.println("ma hoa don: " + this.maHD + "san pham: " + this.sanpham + "so luong: " + this.soluong);
    }
    

    public void show_bills(){
        System.out.println("ma hoa don: " + this.maHD + "san pham: " + this.sanpham + "so luong: " + this.soluong);
    }

    public double total_bills(){
        return this.sanpham.dongia * this.soluong;
    }

    //tinhTienGiamGia(double phanTramGiam): tính số tiền được giảm trên hóa đơn.
    public double tinhTienGiamGia(double phanTramGiam){
        return total_bills() * phanTramGiam;
    }

    //tinhTienThanhToan(double phanTramGiam): tính số tiền khách hàng phải thanh toán sau khi giảm giá.
    public double tinhTienThanhToan(double phanTramGiam){
       return total_bills() - tinhTienGiamGia(phanTramGiam);
    }
}
