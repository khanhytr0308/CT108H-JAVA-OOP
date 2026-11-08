package review1;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BNCovid extends Bnhan{
    public String ngay;
    public char loai;
    public String odich;
    public String noi;

    Scanner sc = new Scanner(System.in);
    @Override
    public void nhapbn(){
        super.nhapbn();
        System.out.println("nhap ngay");
        this.ngay = sc.nextLine();
        System.out.println("nhap loai 0, 1, 2");
        this.loai = sc.nextLine().charAt(0);
        System.out.println("nhap o dich");
        this.odich = sc.nextLine();
        System.out.println("nhap noi");
        this.noi = sc.nextLine();
    }

    @Override 
    public void in(){
        super.in();
        System.out.println("ngay: " + this.ngay);
        System.out.println("loai: " + this.loai);
        System.out.println("o dich: " + this.odich);
        System.out.println("noi: " + this.noi);
    }
    
    public void checkf1(String odich){
        if(this.odich.equals(odich)){
            if(this.loai == '1'){
                in();
            }
        }
    }

    public boolean hetCachLy() {
    DateTimeFormatter fmt =
        DateTimeFormatter.ofPattern("dd-MM-yyyy");

    LocalDate ngayCachLy = LocalDate.parse(this.ngay, fmt);

    LocalDate ngayKetThuc = ngayCachLy.plusDays(14);

    LocalDate mocThoiGian = LocalDate.of(2021, 5, 18);

    return !ngayKetThuc.isAfter(mocThoiGian);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so benh nhan");
        int n = sc.nextInt();

        Bnhan[] ds = new Bnhan[n];
        for(int i = 0; i < n; i++){
            System.out.println("ben nhan: 1");
            System.out.println("ben nhan covid: 2");
            int choose = sc.nextInt();
            
            if(choose == 1){
                ds[i] = new Bnhan();
                ds[i].nhapbn();
            }
            else if(choose == 2){
                ds[i] = new BNCovid();
                ds[i].nhapbn();
            }
            else System.out.println("loi");
        }

        System.out.println("benh nhan f1");

        for(int i = 0; i < n; i++){
            if(ds[i] instanceof BNCovid){
                BNCovid bn = (BNCovid) ds[i];
                bn.checkf1("Cong Ty Hosiden");
            }
        }
        System.out.println("Danh sach benh nhan da het cach ly:");

        for (int i = 0; i < n; i++) {
            if (ds[i] instanceof BNCovid) {
                BNCovid bn = (BNCovid) ds[i];

                if (bn.hetCachLy()) {
                    bn.in();
                }
            }
        }
    }
}
