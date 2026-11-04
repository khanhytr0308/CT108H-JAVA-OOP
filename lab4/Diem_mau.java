import java.util.Scanner;

import javax.swing.plaf.DimensionUIResource;

import lab2.*;

public class Diem_mau extends Point{
    public String color;

    Diem_mau(int x, int y, String color){
        this.x = x;
        this.y = y;
        this.color = color;
    }

    Diem_mau(){
        this.x = 5;
        this.y = 10;
        this.color = "xanh";
    }

    void append_color(String color){
        this.color = color;
    }

    Scanner sc = new Scanner(System.in);

    void input_color(){
        System.out.println("nhap mau ");
        this.color = sc.nextLine();
    }

    void show_info(){
        System.out.println("diem x: " + this.x);
        System.out.println("diem y: " + this.y);
        System.out.println("mau: " + this.color);
    }


}
