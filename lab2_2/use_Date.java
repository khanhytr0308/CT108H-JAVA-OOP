package lab2_2;

import java.util.Scanner;

public class use_Date{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Date A = new Date(20, 4, 2024);
        Date d = new Date();
        d.scandate();

        d.printdate();
        if(!d.datehople()){
            System.out.println(" date khong hop le ");
        }
        else{
            System.out.println("hop le");
        }
        A.printdate();

        Date ngay1 = d;
        Date ngay2 = ngay1.ngayhomsau();
        
        System.out.println("ngay hien tai");
        ngay1.printdate();
        System.out.println("ngay hom sau");
        ngay2.printdate();
        System.out.println("nhap so ngay + them");
        int n = sc.nextInt();
        d = d.add(n);
        System.out.println("sau khi + " + n + " ngay");
        d.printdate();

        Date e = new Date(1,1,2027);
        for(int i = 0; i <= 365; i ++){
            d.printdate();
            d = d.ngayhomsau();
        }
    }
}