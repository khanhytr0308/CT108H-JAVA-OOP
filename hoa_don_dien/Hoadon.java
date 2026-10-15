package hoa_don_dien;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Hoadon {
    int makh;
    String name;
    String oldphonenum;
    String newphonenum;

    Hoadon(){
        makh = 01;
        name = "khanh";
        oldphonenum = "099999999";
        newphonenum = "088888888";
    }
    Hoadon(int makh, String name, String oldphonenum, String newphonenum){
        this.makh = makh;
        this.name = name;
        this.oldphonenum = oldphonenum;
        this.newphonenum = newphonenum;
    }
    static List<Hoadon> inputkh(int n){
        Scanner sc = new Scanner(System.in);
        List<Hoadon> L = new ArrayList<>();
        for(int i = 0; i < n; i++){
            System.out.println("hoa don thu" + i + 1);

            System.out.println("nhap ma so khach hang ");
            int makh = sc.nextInt();
            sc.nextLine();

            System.out.println("nhap ten khach hang ");
            String name = sc.nextLine();

            System.out.println("nhap so dien thoai cu ");
            String oldphonenum = sc.nextLine();

            System.out.println("nhap so dien thoai moi ");
            String newphonenum = sc.nextLine();

            Hoadon hd = new Hoadon(makh, name, oldphonenum, newphonenum);
            L.add(hd);
        }
        return L;
    }
    void printhoadon(List<Hoadon> L){
        for(Hoadon hd : L){
            System.out.println("makh: " + hd.makh + " ten: " + hd.name + " so dien thoi cu: " + hd.oldphonenum +
            " so dien thoai moi: " + hd.newphonenum
            );  
        }
    }
}
