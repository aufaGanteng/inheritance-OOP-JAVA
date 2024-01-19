
package bangunruang;


public class Balok {
    int p ;
    int l ;
    int t ;
    double Volume (){
        double hasil = p*l*t;
        System.out.println("Hasil Volume Balok:"+ hasil);
        return hasil;
    }
    double LuasPermukaan (){
        double hasil = 2 * (p*l * p*t * l*t);
        System.out.println("Hasil Luas Permukaan Balok:"+ hasil);
        return hasil;
    }
}
