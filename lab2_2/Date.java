package lab2_2;
import java.util.Scanner;
import java.util.InputMismatchException;
class Date {
    int ngay;
    int thang;
    int nam;

    Date(){
        ngay = 0;
        thang = 0;
        nam = 0;
    }
    Date(int ngay, int thang, int nam){
        this.ngay = 0;
        this.thang = 0;
        this.nam = 0;
    }

    void printdate(int ngay, int thang, int nam){
        System.out.println("ngay: " + ngay + "thang: " + thang + "nam: " +nam);
    }

    void scandate(int ngay, int thang, int nam){
        Scanner sc = new Scanner(System.in);
        boolean hople = false;

        while(!hople){
            try{
                System.out.println("nhap ngay");
                ngay = sc.nextInt();

                hople = true;
            }catch(InputMismatchException e){
                System.out.println("sai dinh dang nhap lai");
                sc.next();
            }
        }
         while(!hople){
            try{
                System.out.println("nhap thang");
                thang = sc.nextInt();

                hople = true;
            }catch(InputMismatchException e){
                System.out.println("sai dinh dang nhap lai");
                sc.next();
            }
        }
         while(!hople){
            try{
                System.out.println("nhap nam");
                nam = sc.nextInt();

                hople = true;
            }catch(InputMismatchException e){
                System.out.println("sai dinh dang nhap lai");
                sc.next();
            }
        }
    }
    boolean datehople(){
        if(thang < 1 || thang > 12){
            return false;
        }
        int maxday;
        if(thang == 2){
            if(nam % 400 == 0 || (nam % 4 == 0 && nam % 100 != 0)){
                maxday = 29;
            }
            else{
                maxday = 28;
            }
        }
        else if(thang == 4 || thang == 6 || thang == 9 || thang == 11){
            maxday = 30;
        }
        else{
            maxday = 31;
        }
        return ngay >= 1 && ngay <= maxday;
    }
}



