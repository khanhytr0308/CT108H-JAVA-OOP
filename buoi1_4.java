
import java.util.Scanner;
import java.util.InputMismatchException;
public class buoi1_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;

        boolean hople = false;

        while(!hople){
            try{
                System.out.print("nhap a");
                a = sc.nextInt();

                hople = true;
            }catch (InputMismatchException e){
                System.out.println("sai dinh dang nhap lai");
                sc.next();
            }
        }
        hople = false;
        while(!hople){
            try{
                System.out.print("nhap b");
                b = sc.nextInt();

                hople = true;
            } catch (InputMismatchException e){
                System.out.println("nhap sai nhap lai");
                sc.next();
            }
        }
            System.out.println("tong =" + (a + b));
        }
    }
