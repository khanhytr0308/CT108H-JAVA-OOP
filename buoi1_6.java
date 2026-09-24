import java.util.Scanner;
public class buoi1_6 {
    public static void checkprime(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       if( n <= 1){
        System.out.println("n k phai la so nguyen to");
        return;
       }
       for(int i = 2; i * i <= n; i++){
        if(n % i == 0){
            System.out.println("n k la so nguyen to");
            return;
            }
       }
       System.out.println("n la so nguyen to");
    }
    public static void main(String[] args){
        checkprime();
    }
}
