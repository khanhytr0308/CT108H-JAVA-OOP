package hoa_don_dien;

import java.util.List;

public class use_hoadon {
    public static void main(String[] args){
        Hoadon A = new Hoadon(01, "khanh", "099", "088");
        List<Hoadon> ds = Hoadon.inputkh(3);
        Hoadon hd = new Hoadon();
        hd.printhoadon(ds);
    }
}
