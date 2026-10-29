package lab3;

import java.util.Scanner;

public class use_Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Tao sinh vien a, nhap thong tin, dang ky LTHDT, hien thi thong tin
        System.out.println("Nhap thong tin sinh vien a:");
        Student a = new Student();
        a.input_ifo();
        a.input_scores();

        System.out.print("Nhap diem hoc phan LTHDT: ");
        String scoreLTHDT = sc.nextLine().trim();
        a.add_courses("LTHDT", scoreLTHDT);

        System.out.println("\nThong tin sinh vien a:");
        a.to_string();

        // 2. Tao danh sach sinh vien va nhap thong tin
        System.out.print("\nNhap so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] ds = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap sinh vien thu " + (i + 1) + ":");
            ds[i] = new Student();
            ds[i].input_ifo();
            ds[i].input_scores();
        }

        // 3. Tim cac sinh vien bi canh bao hoc vu (DTB < 1.00)
        System.out.println("\nSinh vien bi canh bao hoc vu:");
        for (int i = 0; i < n; i++) {
            if (ds[i].avg_scores() < 1.0) {
                ds[i].to_string();
            }
        }

        // 4. Tim sinh vien co diem trung binh cao nhat lop
        System.out.println("\nSinh vien co diem trung binh cao nhat:");
        if (n > 0) {
            double maxDtb = ds[0].avg_scores();
            for (int i = 1; i < n; i++) {
                if (ds[i].avg_scores() > maxDtb) {
                    maxDtb = ds[i].avg_scores();
                }
            }
            for (int i = 0; i < n; i++) {
                if (ds[i].avg_scores() == maxDtb) {
                    ds[i].to_string();
                }
            }
        }

        // 5. Hien thi danh sach sinh vien theo thu tu Alphabet cua Ten
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                String ten1 = ds[i].getTen();
                String ten2 = ds[j].getTen();
                int cmp = ten1.compareToIgnoreCase(ten2);
                if (cmp > 0 || (cmp == 0 && ds[i].name.compareToIgnoreCase(ds[j].name) > 0)) {
                    Student temp = ds[i];
                    ds[i] = ds[j];
                    ds[j] = temp;
                }
            }
        }

        System.out.println("\nDanh sach sinh vien theo thu tu Alphabet cua ten:");
        for (int i = 0; i < n; i++) {
            ds[i].to_string();
        }
    }
}
