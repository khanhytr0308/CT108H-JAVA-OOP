package lab3;
import java.util.Scanner;

public class ma_bill_sells {
    public static void main(String[] agrs){
        //Tạo ít nhất 3 đối tượng SanPham khác nhau, chẳng hạn Laptop, Chuột máy tính và Bàn phím.
        products laptop = new products();
        products mouse = new products();
        products keyboard = new products();

        laptop.input_products();
        mouse.input_products();
        keyboard.input_products();

        //tạo một mảng đối tượng HoaDon có 5 phần tử.
        bills[] hoadon = new bills[5]; 

        //Nhập thông tin cho 5 hóa đơn, mỗi hóa đơn gồm mã hóa đơn, sản phẩm và số lượng. 
        // Sản phẩm của hóa đơn được chọn từ các đối tượng SanPham đã tạo.

        for(int i = 0; i < 5; i++){
            hoadon[i] = new bills();
            
            System.out.println("nhap san pham");
            System.out.println("1: laptop");
            System.out.println("2: mouse");
            System.out.println("3: keyboard");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            sc.nextLine();

            if(choice == 1){
                hoadon[i].input_bills(laptop);
            }
            else if(choice == 2){
                hoadon[i].input_bills(mouse);
            }
            else if(choice == 3){
                hoadon[i].input_bills(keyboard);
            }
        }

        //Hiển thị danh sách tất cả hóa đơn,
        // bao gồm tổng tiền trước giảm giá và tiền thanh toán sau giảm giá 10%.
        for(int i = 0; i < 5; i++){
            hoadon[i].show_bills();   
            System.out.println("sau giam gia 10%" + hoadon[i].tinhTienThanhToan(0.1));
        }

        //Tính và hiển thị tổng tiền thanh toán của tất cả hóa đơn.
        double s = 0;
        for(int i = 0; i < 5; i++){
            s += hoadon[i].tinhTienThanhToan(0.1);
            System.out.println("tong tien cua tat ca hoa don: " + s);
        }

        // Tìm và hiển thị hóa đơn có tổng tiền thanh toán lớn nhất.
        int pos = 0;
        double max = hoadon[0].tinhTienThanhToan(0.1);
        for(int i = 0; i < 5; i++){
            if(hoadon[i].tinhTienThanhToan(0.1) > max){
                max = hoadon[i].tinhTienThanhToan(0.1);
                pos = i;
            }
        }
        System.out.println("hoa don lon nhat: " + hoadon[pos].maHD);

        //Đếm số hóa đơn có tổng tiền thanh toán lớn hơn 10.000.000 đồng.
        int count = 0;
        for(int i = 0; i < 5; i++){
            if(hoadon[i].tinhTienThanhToan(0.1) > 10000000){
                count ++;
            }
        }
        System.out.println("so hoa don tren 1000000: " + count);
    }
}
