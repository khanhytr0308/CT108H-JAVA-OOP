
import java.util.Scanner;

public class Gach {
    String ma_so;
    String mau;
    int so_luong;
    int chieu_dai;
    int chieu_ngang;
    int gia_ban;

    Gach(){
        ma_so = "M01";
        mau = "xanh";
        so_luong = 10;
        chieu_dai = 10;
        chieu_ngang = 10;
        gia_ban = 10;
    }

    Gach(String ma_so, String mau, int so_luong, int chieu_dai, int chieu_ngang, int gia_ban){
        this.ma_so = ma_so;
        this.mau = mau;
        this.so_luong = so_luong;
        this.chieu_dai = chieu_dai;
        this.chieu_ngang = chieu_ngang;
        this.gia_ban = gia_ban;
    }

    void inputif(){
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap ma so");
        this.ma_so = sc.nextLine();

        System.out.println("nhap mau");
        this.mau = sc.nextLine();

        System.out.println("nhap so luong");
        this.so_luong = sc.nextInt();
        sc.nextLine();

        System.out.println("nhap chieu dai");
        this.chieu_dai = sc.nextInt();
        sc.nextLine();

        System.out.println("nhap chieu ngang");
        this.chieu_ngang = sc.nextInt();
        sc.nextLine();

        System.out.println("nhap gia ban");
        this.gia_ban = sc.nextInt();
        sc.nextLine();

    }

    void printif(){
        System.out.println("ma so " + this.ma_so);
        System.out.println("mau " + this.mau);
        System.out.println("so luong " + this.so_luong);
        System.out.println("chieu dai " + this.chieu_dai);
        System.out.println("chieu ngang " + this.chieu_ngang);
        System.out.println("gia ban " + this.gia_ban);
    }

    float giaBanLe(){
        float s = this.gia_ban * 0.2f;
        return s;
    }

    float maxdientich(){
        float s = this.so_luong * this.chieu_ngang * this.chieu_dai;
        return s;
    }
    int soLuongHop(int D, int N){
        
        int dientich = D * N;

        int dientich1hop = this.so_luong * this.chieu_ngang * this.chieu_dai;

        int s = dientich / dientich1hop;

        if(dientich % dientich1hop != 0){
            s += 1;
        }

        return s;
    }
    float chiphilot(){
        float s = this.gia_ban / maxdientich();
        return s;
    }
}
