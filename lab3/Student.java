package lab3;

import lab2.*;
import java.util.Scanner;

public class Student {
    public String id;
    public String name;
    public Date date;
    public int courses;
    public String[] name_courses;
    public String[] scores;

    public Student() {
        this.id = "B2504877";
        this.name = "khanh";
        this.date = new Date(3, 8, 2007);
        this.courses = 3;
        this.name_courses = new String[] { "java", "AI", "sql" };
        this.scores = new String[] { "A", "A", "A" };
    }

    public Student(String id, String name, Date date, int courses, String[] name_courses, String[] scores) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.courses = courses;
        this.name_courses = name_courses;
        this.scores = scores;
    }

    public Student(Student a) {
        this.id = a.id;
        this.name = a.name;
        this.date = (a.date != null) ? new Date(a.date.d, a.date.m, a.date.y) : null;
        this.courses = a.courses;
        this.name_courses = (a.name_courses != null) ? a.name_courses.clone() : null;
        this.scores = (a.scores != null) ? a.scores.clone() : null;
    }

    public void to_string() {
        System.out.println("MSSV: " + this.id + " | Ho ten: " + this.name + " | Ngay sinh: " + this.date + " | So mon: "
                + this.courses);
        System.out.print("Danh sach mon hoc va diem: ");
        if (this.courses == 0) {
            System.out.println("(Chua co mon hoc)");
        } else {
            for (int i = 0; i < this.courses; i++) {
                System.out.print(this.name_courses[i] + ": " + this.scores[i] + (i < this.courses - 1 ? ", " : ""));
            }
            System.out.println();
        }
        System.out.printf("Diem trung binh tich luy (he 4): %.2f\n", avg_scores());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MSSV: ").append(this.id).append(" | Ho ten: ").append(this.name)
                .append(" | Ngay sinh: ").append(this.date).append(" | So mon: ").append(this.courses);
        sb.append("\nMon hoc: ");
        if (this.courses == 0) {
            sb.append("(Chua co mon hoc)");
        } else {
            for (int i = 0; i < this.courses; i++) {
                sb.append(this.name_courses[i]).append("(").append(this.scores[i]).append(")");
                if (i < this.courses - 1)
                    sb.append(", ");
            }
        }
        sb.append(String.format(" | DTB: %.2f", avg_scores()));
        return sb.toString();
    }

    // Ham nhap thong tin co ban cua sinh vien
    public void input_ifo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma so sinh vien (MSSV): ");
        this.id = sc.nextLine();

        System.out.print("Nhap ho va ten: ");
        this.name = sc.nextLine();

        System.out.println("Nhap ngay sinh:");
        this.date = new Date();
        this.date.scandate();

        System.out.print("Nhap so luong mon hoc: ");
        this.courses = sc.nextInt();
        sc.nextLine();

        this.name_courses = new String[this.courses];
        this.scores = new String[this.courses];

        for (int i = 0; i < this.courses; i++) {
            System.out.print("Nhap ten mon hoc thu " + (i + 1) + ": ");
            this.name_courses[i] = sc.nextLine();
        }
    }

    // Ham nhap diem cho cac mon hoc
    public void input_scores() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < this.courses; i++) {
            System.out.print("Nhap diem (A, B+, B, C+, C, D+, D, F) cho mon \"" + this.name_courses[i] + "\": ");
            this.scores[i] = sc.nextLine().trim();
        }
    }

    // Ham tinh diem trung binh cua sinh vien theo thang diem 4
    public double avg_scores() {
        if (this.courses == 0)
            return 0.0;
        double g = 0;
        for (int i = 0; i < this.courses; i++) {
            double temp = 0;
            if (this.scores[i] == null) {
                temp = 0;
            } else if (this.scores[i].equalsIgnoreCase("A")) {
                temp = 4.0;
            } else if (this.scores[i].equalsIgnoreCase("B+")) {
                temp = 3.5;
            } else if (this.scores[i].equalsIgnoreCase("B")) {
                temp = 3.0;
            } else if (this.scores[i].equalsIgnoreCase("C+")) {
                temp = 2.5;
            } else if (this.scores[i].equalsIgnoreCase("C")) {
                temp = 2.0;
            } else if (this.scores[i].equalsIgnoreCase("D+")) {
                temp = 1.5;
            } else if (this.scores[i].equalsIgnoreCase("D")) {
                temp = 1.0;
            } else {
                temp = 0.0;
            }
            g += temp;
        }
        return g / this.courses;
    }

    // Ham dang ky them 1 hoc phan cho sinh vien
    public void add_courses(String name, String score) {
        String[] newname_courses = new String[this.courses + 1];
        String[] newscores = new String[this.courses + 1];

        for (int i = 0; i < this.courses; i++) {
            newname_courses[i] = this.name_courses[i];
            newscores[i] = this.scores[i];
        }
        newname_courses[this.courses] = name;
        newscores[this.courses] = score;

        this.name_courses = newname_courses;
        this.scores = newscores;
        this.courses++;
    }

    public void add_courses(String name) {
        add_courses(name, "chua co");
    }

    // Ham xoa 1 hoc phan cua sinh vien
    public void delete_course(String name) {
        int pos = -1;
        for (int i = 0; i < this.courses; i++) {
            if (this.name_courses[i] != null && this.name_courses[i].equalsIgnoreCase(name)) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            System.out.println("Khong tim thay hoc phan \"" + name + "\" de xoa!");
            return;
        }

        String[] newname_courses = new String[this.courses - 1];
        String[] newscores = new String[this.courses - 1];

        int idx = 0;
        for (int i = 0; i < this.courses; i++) {
            if (i != pos) {
                newname_courses[idx] = this.name_courses[i];
                newscores[idx] = this.scores[i];
                idx++;
            }
        }

        this.name_courses = newname_courses;
        this.scores = newscores;
        this.courses--;
        System.out.println("Da xoa thanh cong hoc phan: " + name);
    }

    // Lay ten (tu cuoi cung trong ho ten) de sap xep Alphabet
    public String getTen() {
        if (this.name == null || this.name.trim().isEmpty()) {
            return "";
        }
        String trimmed = this.name.trim();
        int lastSpace = trimmed.lastIndexOf(' ');
        if (lastSpace != -1) {
            return trimmed.substring(lastSpace + 1);
        }
        return trimmed;
    }
}
