package bangunruang;

import static java.lang.Math.PI;

public class Bola extends BangunRuang {
    double r ; 
    
    double volume(){
        double hasil = 4/3 * PI * r * r * r;
        System.out.println("Hasil Volume Bola:" + hasil);
        return hasil;
    }
    double LuasPermukaan(){
        double hasil = 4 * PI * r * r;
        System.out.println("Hasil Luas Permukaan Bola:" + hasil);
        return hasil;
        
    }
    
}
