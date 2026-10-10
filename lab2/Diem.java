package lab2;

import java.util.Scanner;

    class Diem{
        int x;
        int y;

        Diem(){
            x = 0;
            y = 0;
        }
        Diem(int x, int y){
            this.x = x;
            this.y = y;
        }
        void nhapdiem(){
            Scanner sc = new Scanner(System.in);

            System.out.println("nhap x");
            this.x = sc.nextInt();

            System.out.println("nhap y");
            this.y = sc.nextInt();
        }
        void hienthi(){
            System.out.println("diem x: " + x);
            System.out.println("diem y: " + y);
        }
        void doidiem(int dx, int dy){
            this.x = x + dx;
            this.y = y + dy;
        }
        int giaTriX(){
            return this.x;
        }
        int giaTriY(){
            return this.y;
        }
        double khoangcach(){
            return Math.sqrt(this.x * this.x + this.y * this.y);
        }
        double khoangcach(Diem d){
            return Math.sqrt((this.x - d.x)*(this.x - d.x) + (this.y - d.y)*(this.y - d.y));
        }
    }
