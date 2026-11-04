import java.util.Scanner;

public class main_animall {
    public static void main(String[] agrs){
        // Tạo ra n con vật bất kỳ gồm cả 3 loài vật trên. Nhập thông tin cho các con vật.
        System.out.println("so luong");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        animal[] dongvat = new animal[n];
        for(int i = 0; i < n; i++){
            System.out.println("con gi" + i);
            System.out.println("1: heo");
            System.out.println("2: bo");
            System.out.println("3: de");
            int choose = sc.nextInt();
            sc.nextLine();
            
            if(choose == 1){
                dongvat[i] = new bo();
                System.out.println("giong");
                dongvat[i].giong = sc.nextLine();

                System.out.println("maulong");
                dongvat[i].maulong = sc.nextLine();

                System.out.println("can nang");
                dongvat[i].cannang = sc.nextInt();
            }
            else if(choose == 2){
                dongvat[i] = new heo();
                System.out.println("giong");
                dongvat[i].giong = sc.nextLine();

                System.out.println("maulong");
                dongvat[i].maulong = sc.nextLine();

                System.out.println("can nang");
                dongvat[i].cannang = sc.nextInt();
            }
            else if(choose == 3){
                dongvat[i] = new heo();
                System.out.println("giong");
                dongvat[i].giong = sc.nextLine();

                System.out.println("maulong");
                dongvat[i].maulong = sc.nextLine();

                System.out.println("can nang");
                dongvat[i].cannang = sc.nextInt();
            }
        }
        for(int i =0; i < n; i++){
            dongvat[i].keu();
        }
    }
}
