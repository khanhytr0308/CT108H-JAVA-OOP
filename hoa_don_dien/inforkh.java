package hoa_don_dien;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class inforkh {
    int id;
    String name;
    double diennangtieuthu;
    double diennangphaitra;

    inforkh(){
        id = 01;
        name = "khanh";
        diennangtieuthu = 100;
        diennangphaitra = 100;
    }

    inforkh(int makh, String name, double diennangtieuthu, double diennangphaitra){
        this.id = makh;
        this.name = name;
        this.diennangtieuthu = diennangtieuthu;
        this.diennangphaitra = diennangphaitra;
    }

    double tinhtiendien(){
        double S = 0;
        if(this.diennangtieuthu > 0){
            double bac1 = Math.min(this.diennangtieuthu, 50);
            S += bac1 * 1806;
        }
        if(this.diennangtieuthu > 50){
            double bac2 = Math.min(this.diennangtieuthu - 50, 50);
            S += bac2 * 1866;
        }
        if(this.diennangtieuthu > 100){
            double bac3 = Math.min(this.diennangtieuthu - 100, 100);
            S += bac3 *  2167;
        }
        if(this.diennangtieuthu > 200){
            double bac4 = Math.min(this.diennangtieuthu - 200, 100);
            S += bac4 * 2729;
        }
        if(this.diennangtieuthu > 300){
            double bac5 = Math.min(this.diennangtieuthu - 300, 100);
            S += bac5 * 3050;
        }
        if(this.diennangtieuthu > 400){
            double bac6 = this.diennangtieuthu - 400;
            S += bac6 * 3151;
        }
        return S;
    }
    static List<inforkh> inputinfor(int n){
        Scanner sc = new Scanner(System.in);
        List<inforkh> L = new ArrayList<>();
        for(int i = 0; i < n; i++){
            System.out.println("hoa don thu" + (i + 1));

            System.out.println("nhap ma so khach hang ");
            int makh = sc.nextInt();
            sc.nextLine();

            System.out.println("nhap ten khach hang ");
            String name = sc.nextLine();

            System.out.println("nhap so dien. tieu thu ");
            double diennangtieuthu = sc.nextDouble();
            
            inforkh kh = new inforkh(makh, name, diennangtieuthu, 0);

            double diennangphaitra = kh.tinhtiendien();

            inforkh kh1 = new inforkh(makh, name, diennangtieuthu, diennangphaitra);

            L.add(kh1);
        }
        return L;
    }
    void printListinfor(List<inforkh> L){
        for(inforkh kh : L){
            System.out.println("makh: " + kh.id + "\n ten: " + kh.name + "\n dien nang tieu thu: " + kh.diennangtieuthu +
            "\n dien nang phai tra: " + kh.diennangphaitra
            );  
        }
    }
    void printinfor(){
            System.out.println("makh: " + this.id + "\n ten: " + this.name + "\n dien nang tieu thu: " + this.diennangtieuthu +
            "\n dien nang phai tra: " + this.diennangphaitra
            );  
    }
    inforkh findmax(List<inforkh> L){
        inforkh maxkh = L.get(0);

        for(inforkh kh : L){
            if(kh.diennangphaitra > maxkh.diennangphaitra){
                maxkh = kh;
            }
        }
        return maxkh;
    }
}
