import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class use_Gach {
    public static void main(String[] args) {
    
        // g.printif();
        // System.out.println("gia ban le 1 vien " + g.giaBanLe());
        // System.out.println("dien tich toi da " + g.maxdientich());
        // System.out.println("so luong hop " + g.soLuongHop(100, 10));

        System.out.println("nhap n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Gach> L = new ArrayList<>();

        for(int i = 0; i < n; i++){
            Gach g = new Gach();
            g.inputif();
            L.add(g);
        }

        for(int i = 0; i < L.size(); i++){
            System.out.println("hop thu " + i);
            L.get(i).printif();
        }

        //  Hiển thị ra màn hình loại gạch có chi phí lót thấp nhất (giá tiền / đơn vị diện tích).
        Gach minGach = L.get(0);
        double minChiPhi = minGach.chiphilot();

        for(int i = 1; i < L.size(); i++){
            Gach g = L.get(i);
            if(g.chiphilot() < minChiPhi){
                minChiPhi = g.chiphilot();
                minGach = L.get(i);
            }
        }
        minGach.printif();

        // Tính ra chi phí mua gạch khi ta lót 1 diện tích có chiều ngang là 5 m và chiều dài là 20m
        // khi ta dùng từng loại gạch trong danh sách trên.
        for(int i = 0; i < L.size(); i++){
            Gach g = L.get(i);
            float chiphi = g.soLuongHop(5, 20) * g.gia_ban;
            System.out.println("chi phi " + chiphi);
        }
    }
}
