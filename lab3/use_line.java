package lab3;
import lab2.*;
public class use_line {
    public static  void main(String[] agrs){
        //+ Tạo 2 điểm là A(2, 5), B(20, 35). Tạo đoạn thẳng AB. Tịnh tiến AB đi đoạn (5,3) 
        Point a = new Point(2, 5);
        Point b = new Point(20, 35);

        line ab = new line(a, b);

        ab.show_line();
        ab.translation(5,3 );
        ab.show_line();
        //Tạo một đoạn thẳng bất kỳ CD . Nhập giá trị cho đoạn thẳng CD đó .
        line cd = new line();
        cd.input_Line();

        //Hiển thị ra màn hình độ dài CD, góc CD với trục hoành.
        System.out.println("do dai CD " + cd.line_distance());
        System.out.println("goc CD voi truc hoanh " + cd.conner());
    }
}
