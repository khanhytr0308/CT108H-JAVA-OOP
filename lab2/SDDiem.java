package lab2;
import java.util.Scanner;

public class SDDiem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Diem A = new Diem(3, 4);
        
        System.out.println("nhap diem x cua B");
        int x = sc.nextInt();
        System.out.println("nhap diem y cua B");
        int y = sc.nextInt();

        Diem B = new Diem(x, y);

        System.out.println("Diem A");
        A.hienthi();
        System.out.println("Diem B");
        B.hienthi();

        Diem C = new Diem(-B.giaTriX(), -B.giaTriY());
        System.out.println("Diem C");
        C.hienthi();
        System.out.println("khoang cach tu B den tam O: " + B.khoangcach());
        System.out.println("khoang cach tu A den diem B: " + A.khoangcach(B));
    }
}