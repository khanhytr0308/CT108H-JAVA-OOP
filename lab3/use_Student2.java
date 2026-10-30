package lab3;
import java.util.Scanner;

public class use_Student2 {
    public static void main(String[] agrs){
        //Tạo sinh viên a. Nhập thông tin cho sinh viên a. Đăng ký thêm cho sinh viên a 1 học
        //phần là “LTHDT”. Hiển thị thông tin của a.
        Student2 a = new Student2();
        a.input_ifo();
        a.input_scores();
        a.add_courses("LTHDT", "A");
        a.to_string();

        //Tạo 1 danh sách sinh viên. Nhập thông tin cho danh sách sinh viên trên.
        System.out.println("nhap so sinh vien");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student2[] ds = new Student2[n];
        for(int i = 0; i < n; i ++){
            System.out.println("sinh vien thu: " + (i + 1));
            ds[i] = new Student2();
            ds[i].input_ifo();
            ds[i].input_scores();
        }
    
        //Tìm các sinh viên bị cảnh báo học vụ.
        System.out.println("sinh vien bi canh bao hoc vu: ");
        for(int i = 0; i < n; i++){
            if(ds[i].avg_socres() < 1.0){
                ds[i].toString();
            }
        }

        //Tìm sinh viên có điểm trung bình cao nhất lớp.
        Student2 max = ds[0];
        for(int i = 0; i < n; i++){
            if(ds[i].avg_socres() > max.avg_socres()){
                max = ds[i];
            }
        }
        System.out.println("sinh vien cao diem nhat: ");
        max.to_string();


        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - 1 - i; j ++){
                
                String name1 = ds[j].get_name();
                String name2 = ds[j + 1].get_name();

                if(name1.compareToIgnoreCase(name2) > 0){
                    Student2 temp = ds[j];
                    ds[j] = ds[j + 1];
                    ds[j + 1] = temp;
                }
            }
        }

        for(int i = 0; i < n; i++){
            ds[i].to_string();
        }
    }
}
