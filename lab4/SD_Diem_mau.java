

public class SD_Diem_mau {
    public static void main(String[] agrs){
        Diem_mau A = new Diem_mau(5, 10, "trang");
        System.out.println("A");
        A.show_info();

        Diem_mau B = new Diem_mau();
        B.input();

        // Dời điểm B đi 1 độ dời (10,8)
        B.changepoint(10, 8);

        // Hiển thị tọa độ điểm B ra màn hình.
        B.show();

        // Gán màu mới cho điểm B là màu “Vàng”.
        B.append_color("Vang");

        System.out.println("B");
        B.show_info();
    }
}


