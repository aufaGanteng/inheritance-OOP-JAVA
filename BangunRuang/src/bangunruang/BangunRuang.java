
package bangunruang;


public class BangunRuang {

    
    public static void main(String[] args) {
        
        Bola bola = new Bola();
        bola.r=7;
        
        bola.volume();
        bola.LuasPermukaan();
        System.out.println("");
        
        Balok balok = new Balok();
        balok.p=20;
        balok.l=15;
        balok.t=16;
        
        balok.Volume();
        balok.LuasPermukaan();
        System.out.println("");
        
        limasSegitiga limas = new limasSegitiga();
        limas.l=15;
        limas.t=17;
        limas.la=18;
        limas.ts=10;
        
        limas.volume();
        limas.luasPermukaan();
        System.out.println("");
        
        Tabung tabung = new Tabung();
        tabung.r=8;
        tabung.t=16;
        
        tabung.volume();
        tabung.luasPermukaan();
        System.out.println("");
                
    }
    
}
