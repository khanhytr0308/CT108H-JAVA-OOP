package lab3;
import lab2.*;

import java.util.Scanner;
import java.util.Arrays;
public class Student2 {
    String id;
    String name;
    Date date;
    int courses;
    String[] name_courses;
    String[] scores;

    public Student2(){
        this.id = "B2504877";
        this.name = "khanh";
        this.date = new Date(03, 8, 2007);
        this.courses = 3;
        this.name_courses = new String[]{"AI", "JAVA", "SQL"};
        this.scores =new String[]{"A", "A", "A"};
    }
    public Student2(String id, String name, Date date, int courses, String[] name_courses, String[] scores){
        this.id = id;
        this.name = name;
        this.date = date;
        this.courses = courses;
        this.name_courses = name_courses;
        this.scores = scores;
    }

    public Student2(Student2 a){
        this.id = a.id;
        this.name = a.name;
        this.date = a.date;
        this.courses = a.courses;
        this.name_courses = a.name_courses;
        this.scores = a.scores;
    }

    Scanner sc = new Scanner(System.in);

    public void input_ifo(){

        System.out.println("nhap mssv:");
        this.id = sc.nextLine();

        System.out.println("nhap ten:");
        this.name = sc.nextLine();

        System.out.println("nhap ngay thang nam sinh:");
        this.date = new Date();
        this.date.scandate();

        System.out.println("nhap so mon hoc:");
        this.courses = sc.nextInt();
        sc.nextLine();

        this.name_courses = new String[this.courses];
        for(int i = 0; i < this.courses; i++){
            System.out.println("nhap mon hoc thu: " + (i + 1));
            this.name_courses[i] = sc.nextLine();
        }
    }
    //Hàm nhập điểm cho các học phần của sinh viên
    public void input_scores(){
        this.scores = new String[this.courses];
        for(int i = 0; i < this.courses; i++){
            System.out.println("Nhap diem mon " + this.name_courses[i] + ":");
            this.scores[i] = sc.nextLine();
        }
    }

    //Hàm toString(): xuất ra chuỗi là thông tin của sinh viên

    public void to_string() {
        System.out.println("MSSV: " + this.id);
        System.out.println("Ten: " + this.name);
        System.out.println("Ngay sinh: " + this.date);
        System.out.println("So mon hoc: " + this.courses);
        System.out.println("Mon hoc: " + Arrays.toString(this.name_courses));
        System.out.println("Diem: " + Arrays.toString(this.scores));
    }

    //Hàm tính ra điểm trung bình của sinh viên theo thang điểm 4.
    public double avg_socres(){
        double temp = 0;
        double s;

        for(int i = 0; i < this.courses; i++){
            if(this.scores[i].equals("A")){
                s = 4.0;
            }
            else if(this.scores[i].equals("B+")){
                s = 3.5;
            }
            else if(this.scores[i].equals("B")){
                s = 3;
            }
            else if(this.scores[i].equals("C+")){
                s = 2.5;
            }
            else if(this.scores[i].equals("C")){
                s = 2;
            }
            else if(this.scores[i].equals("D+")){
                s = 1.5;
            }
            else if(this.scores[i].equals("D")){
                s = 1;
            }
            else{
                s = 0;
            }
            temp += s;
        }
        return temp / courses;
    }

    // Hàm đăng ký thêm 1 học phần cho sinh viên
    public void add_courses(String name, String score){
        String[] new_name = new String[courses + 1];
        String[] new_score = new String[courses + 1];

        for(int i = 0; i < this.courses; i++){
            new_name[i] = this.name_courses[i];
            new_score[i] = this.scores[i];
        }
        new_name[this.courses] = name;
        new_score[this.courses] = score;

        this.name_courses = new_name;
        this.scores = new_score;
        courses++;
    }

    //Hàm xóa 1 học phần của sinh viên
    public void delete_course(String name, String score){
        int pos = -1;
        for(int i = 0; i < this.courses; i++){
            if(name_courses[i].equals(name)){
                pos = i;
                break;
            }
            else{
                System.out.println("not found");
            }
        }
        String[] new_name = new String[this.courses -1];
        String[] new_score = new String[this.courses - 1];

        int idx = 0;
        for(int i = 0; i < this.courses; i++){
            if(i != pos){
                new_name[idx] = name_courses[i];
                new_score[idx] = scores[i];
                idx ++;
            }
        }
        name_courses = new_name;
        scores = new_score;
        courses --;
    }
}
