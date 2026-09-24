import java.util.Scanner;
public class buoi1_5 {
    public static void giai_bac1(float a, float b){
        if(a == 0){
            if(b == 0){
                System.out.println("pt vo so nghiem");
            }
            else
                System.out.println("vo nghiem");
        }
        else{
            float x = -b / a;
            System.out.println("x =" + x);
        }
    }
    public static void giai_bac2(float a, float b, float c){
        if(a == 0){
            giai_bac1(b, c);
        }
        else if(a != 0){
            float delta = b * b - 4 * a * c;
            if(delta < 0){
                System.out.println("pt vo nghiem");
            }
            else if(delta == 0){
                float x = - b / (2*a);
                System.out.println("nghiem kep =" + x);
            }
            else{
                float x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
                float x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
                System.out.println("pt co 2 nghiem x1 =" + x1 + "x2 =" + x2);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap a");
        float a = sc.nextFloat();

        System.out.println("nhap b");
        float b = sc.nextFloat();

        System.out.println("nhap c");
        float c = sc.nextFloat();

        giai_bac2(a, b, c);
    }
}
