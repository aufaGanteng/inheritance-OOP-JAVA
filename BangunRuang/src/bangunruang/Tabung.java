package bangunruang;

import static java.lang.Math.PI;

public class Tabung extends BangunRuang {
    double r;
    int t;
    
    double volume(){
        double hasil = PI*r*r;
        System.out.println("Hasil Volume Tabung :"+ hasil);
        return hasil;
    }
    double luasPermukaan(){
        double hasil = 2*PI*r*t + 2*PI*r*r;
        System.out.println("Hasil Luas Permukaan Tabung :"+ hasil);
        return hasil;
    }
    
    
}
