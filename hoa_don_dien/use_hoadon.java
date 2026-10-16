package hoa_don_dien;

import java.util.List;

public class use_hoadon {
    public static void main(String[] args){
        // Hoadon A = new Hoadon(01, "khanh", "099", "088");
        // List<Hoadon> ds = Hoadon.inputkh(3);
        // Hoadon hd = new Hoadon();
        // hd.printhoadon(ds);

        inforkh A = new inforkh(01, "khanh", 100, 0);
        List<inforkh> ds = inforkh.inputinfor(2);
        inforkh kh = new inforkh();
        kh.printListinfor(ds);
        inforkh maxcost = kh.findmax(ds);
        System.out.println("khach hang co tien dien cao nhat");
        maxcost.printinfor();
    }
}
