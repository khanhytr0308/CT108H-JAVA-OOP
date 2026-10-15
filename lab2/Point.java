package lab2;

import java.util.Scanner;

    class Point{
        int x;
        int y;

        Point(){
            x = 0;
            y = 0;
        }
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
        void input(){
            Scanner sc = new Scanner(System.in);

            System.out.println("nhap x");
            this.x = sc.nextInt();

            System.out.println("nhap y");
            this.y = sc.nextInt();
        }
        void show(){
            System.out.println("diem x: " + x);
            System.out.println("diem y: " + y);
        }
        void changepoint(int dx, int dy){
            this.x = x + dx;
            this.y = y + dy;
        }
        int valueX(){
            return this.x;
        }
        int valueY(){
            return this.y;
        }
        double distance(){
            return Math.sqrt(this.x * this.x + this.y * this.y);
        }
        double distance(Point d){
            return Math.sqrt((this.x - d.x)*(this.x - d.x) + (this.y - d.y)*(this.y - d.y));
        }
        Point meanAB(Point A, Point B){
            return new Point((A.x + B.x) / 2,
                     (A.y + B.y) / 2);
        }
    }
