package lab2;

import java.util.Scanner;

public class Point {
    public int x;
    public int y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap x");
        this.x = sc.nextInt();

        System.out.println("nhap y");
        this.y = sc.nextInt();
    }

    public void show() {
        System.out.println("diem x: " + x);
        System.out.println("diem y: " + y);
    }

    public void changepoint(int dx, int dy) {
        this.x = x + dx;
        this.y = y + dy;
    }

    public int valueX() {
        return this.x;
    }

    public int valueY() {
        return this.y;
    }

    public double distance() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public double distance(Point d) {
        return Math.sqrt((this.x - d.x) * (this.x - d.x) + (this.y - d.y) * (this.y - d.y));
    }

    public Point meanAB(Point A, Point B) {
        return new Point((A.x + B.x) / 2, (A.y + B.y) / 2);
    }
}
