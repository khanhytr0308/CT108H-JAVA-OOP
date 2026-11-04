
import lab3.Student2;

import java.util.Scanner;

public class SVCNTT extends Student2 {
    public String taikhoan;
    public String matkhau;
    public String email;

    SVCNTT() {
        this.taikhoan = "B250000";
        this.matkhau = "1122";
        this.email = "khanhb250000";
    }

    SVCNTT(String taikhoan, String matkhau, String email) {
        this.taikhoan = taikhoan;
        this.matkhau = matkhau;
        this.email = email;
    }

    SVCNTT(SVCNTT a) {
        super(a);
        this.taikhoan = a.taikhoan;
        this.matkhau = a.matkhau;
        this.email = a.email;
    }

    void input_tk(Scanner sc) {
        System.out.println("tai khoan: ");
        this.taikhoan = sc.nextLine();
        System.out.println("mat khau: ");
        this.matkhau = sc.nextLine();
        System.out.println("email: ");
        this.email = sc.nextLine();
        input_ifo(sc);
        input_scores(sc);
    }

    @Override
    public void to_string() {
        System.out.println("tai khoan: " + this.taikhoan);
        System.out.println("mat khau: " + this.matkhau);
        System.out.println("email: " + this.email);
        super.to_string();
    }

    void doimatkhau(String newpass) {
        this.matkhau = newpass;
    }

    String getEmail() {
        return this.email;
    }

    boolean check_email(String cmp_email){
       return this.email.equals(cmp_email);
    }
}
