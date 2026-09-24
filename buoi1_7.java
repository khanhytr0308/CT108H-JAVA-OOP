import java.util.Scanner;

public class buoi1_7 {
    public static String tachten(String hoten) {
        hoten = hoten.trim();
        int vitricuoi = hoten.lastIndexOf(" ");

        if(vitricuoi == -1){
            return hoten;
        }
        return hoten.substring(vitricuoi + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap ho ten");
        String hoten = sc.nextLine();

        String ten = tachten(hoten);
        System.out.println("ten la: " + ten);

    }
}
