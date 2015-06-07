
public class AnalisisKriteriaRK {
    KriteriaRK criteria = new KriteriaRK();
    
    String bentuk (int panjang , int lebar){
    if (panjang!=lebar){
        return "persegi panjang";
    }
    else {
        return "persegi";
    }
    }
    
    String hitungrasio (int panjang, int lebar, int jmlkursi){
    int luasnya = panjang*lebar;
    double rasio = luasnya/jmlkursi;
    if(rasio >= 0.5){
        return "HASIL SESUAI";
    } 
    else {
        return "HASIL TIDAK SESUAI";
    }
    }
    
    String analisisjumlahpintu (int jml_pintu,int jml_jendela){
    if (jml_pintu>=2 && jml_jendela >=1){
        return "HASIL SESUAI";
    }
    else {
        return "HASIL TIDAK SESUAI";
    }
    }
    }
