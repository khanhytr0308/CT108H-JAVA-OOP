import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class buoi1_8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> danhsach = new ArrayList<>();


        System.out.println("so luong phan tu");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("gia tri phan tu" + (i + 1));
            int so = sc.nextInt();
            danhsach.add(so);
        }
        System.out.print("nhap so x: ");
        int x = sc.nextInt();
        int dem = 0;
        for(int so : danhsach){
            if(so == x){
                dem ++;
            }
        }
        System.out.println("so lan xuat hien cua x: " + dem);

        Collections.sort(danhsach);
        System.out.println("danh sach sau khi sap xep");
        for(int so: danhsach){
            System.out.println("phan tu thu: " + so);
        }
    }
}
