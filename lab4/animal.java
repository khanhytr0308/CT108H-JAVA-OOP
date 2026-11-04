public class animal {
    String giong;
    String maulong;
    double cannang;

    animal(){
        this.giong = "duc";
        this.maulong = "xanh duong";
        this.cannang = 100;
    }

    animal(String giong, String maulong, double cannang){
        this.giong = giong;
        this.maulong = maulong;
        this.cannang = cannang;
    }

    animal(animal a){
        this.giong = a.giong;
        this.maulong = a.maulong;
        this.cannang = a.cannang;
    }

    public void keu(){
        System.out.println("dang kieu");
    }
}