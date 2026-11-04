import java.util.Scanner;
import lab3.*;

public class SD_SVCNTT {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so luong sinh vien:");
        int n = sc.nextInt();
        sc.nextLine();

        SVCNTT[] ds = new SVCNTT[n];

        for(int i = 0; i < n; i++){
            System.out.println("Nhap sinh vien thu " + (i + 1));

            ds[i] = new SVCNTT();
            ds[i].input_tk(sc);
        }

        for(int i = 0; i < n; i++){
            ds[i].to_string();
        }

        String find_email = new String();
        System.out.println("nhap email can tim: ");
        find_email = sc.nextLine();
        
        for(int i = 0; i < n; i++){
            if(ds[i].check_email(find_email)){
                ds[i].to_string();
            }
        }
        sc.close();
    }
}
