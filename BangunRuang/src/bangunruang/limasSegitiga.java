package bangunruang;

public class limasSegitiga {
    int l;
    int t;
    int la;
    int ts;
    
    double volume(){
        double hasil = l*t/3;
        System.out.println("Hasil Volume Limas Segitiga :" + hasil);
        return hasil;
    }
    double luasPermukaan (){
        double hasil = la+ts;
        System.out.println("Hasil Luas Permukaan Limas Segitiga :"+ hasil);
        return hasil;
    }
    
}
