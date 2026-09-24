
public class buoi1_3 {
    public static void main(String[] args){
        float max = 0, n, s = 0;
        for(String x: args){
            try{n = Float.parseFloat(x);}
            catch(Exception e){n = 0;}
            s += n;
            max = (max > n) ? max : n;
        }
        System.out.println("max = " + max);
        System.out.println("tong =" + s);
    }
}