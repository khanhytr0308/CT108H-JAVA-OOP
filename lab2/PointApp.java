package lab2;
import java.util.Scanner;

public class PointApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Point A = new Point(3, 4);
        
        System.out.println("nhap diem x cua B");
        int x = sc.nextInt();
        System.out.println("nhap diem y cua B");
        int y = sc.nextInt();

        Point B = new Point(x, y);

        System.out.println("Diem A");
        A.show();
        System.out.println("Diem B");
        B.show();

        Point C = new Point(-B.valueX(), -B.valueY());
        System.out.println("Diem C");
        C.show();
        System.out.println("khoang cach tu B den tam O: " + B.distance());
        System.out.println("khoang cach tu A den diem B: " + A.distance(B));

        Point M = A.meanAB(A, B);
        System.out.println("Trung diem M: (" + M.x + ", " + M.y + ")");

    }
}