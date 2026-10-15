package lab2_2;
import java.util.Scanner;
import java.util.InputMismatchException;
class Date {
    int d;
    int m;
    int y;

    Date(){
        d = 1;
        m= 1;
        y = 1;
    }
    Date(int d, int m, int y){
        this.d = d;
        this.m= m;
        this.y = y;
    }

    void printdate(){
        System.out.println("ngay: " + this.d + " thang: " + this.m + " nam: " + this.y);
    }

    void scandate(){
        Scanner sc = new Scanner(System.in);
        boolean hople = false;

        while(!hople){
            try{
                System.out.println("nhap ngay");
                this.d = sc.nextInt();

                hople = true;
            }catch(InputMismatchException e){
                System.out.println("sai dinh dang nhap lai");
                sc.next();
            }
        }
        hople = false;
         while(!hople){
            try{
                System.out.println("nhap thang");
                this.m = sc.nextInt();

                hople = true;
            }catch(InputMismatchException e){
                System.out.println("sai dinh dang nhap lai");
                sc.next();
            }
        }
        hople = false;
         while(!hople){
            try{
                System.out.println("nhap nam");
                this.y = sc.nextInt();

                hople = true;
            }catch(InputMismatchException e){
                System.out.println("sai dinh dang nhap lai");
                sc.next();
            }
        }
    }
    boolean datehople(){
        if(m < 1 || m > 12){
            return false;
        }
        int maxday;
        if(m == 2){
            if(y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)){
                maxday = 29;
            }
            else{
                maxday = 28;
            }
        }
        else if(m == 4 || m == 6 || m == 9 || m == 11){
            maxday = 30;
        }
        else{
            maxday = 31;
        }
        return d >= 1 && d <= maxday;
    }
    Date ngayhomsau(){
    Date homsau = new Date(this.d, this.m, this.y);
    homsau.d ++;
    if(homsau.d > 30){
        homsau.d = 1;
        homsau.m ++;
    }
    if(homsau.m > 12){
        homsau.m = 1;
        homsau.y ++;
    }
    return homsau;
    }
    Date add(int n){
        Date r = new Date(d, m, y);
        for(int i = 0; i < n; i++){
            r = r.ngayhomsau();
        }
        return r;
    }
}



