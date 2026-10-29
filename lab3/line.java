package lab3;

import lab2.*;

public class line {
    private Point a, b;

    public line(){
        this.a = new Point(4, 2);
        this.b = new Point(3, 6);
    }

    public line(Point a, Point b){
        this.a = a;
        this.b = b;
    }
    public line(int ax, int ay, int bx, int by){
        this.a =new Point(ax, ay);
        this.b =new Point(bx, by);
    }
    //copy contruction
    public line(line l){
        this.a = new Point(l.a.valueX(), l.a.valueY());
        this.b = new Point(l.b.valueX(), l.b.valueY());
    }

    //Nhập tọa độ của đoạn thẳng.
    public void input_Line(){
        a.input();
        b.input();
    }

    //Hiển thi giá trị 2 đầu mút của đoạn thẳng.
    public void show_line(){
        a.show();
        b.show();
    }

    //Tịnh tiến đoạn thẳng đi 1 dộ dời (dx, dy) nào đó.
    public void translation(int dx, int dy){
        a.changepoint(dx, dy);
        b.changepoint(dx, dy);
    }

    //Tính độ dài của đoạn thẳng.
    public double line_distance(){
        return a.distance(b);
    }

    public double conner(){
        double dx = a.valueX() - b.valueX();
        double dy = a.valueY() - b.valueY();

        double radian = Math.atan2(dy, dx);

        return Math.toDegrees(radian);
    }
}
