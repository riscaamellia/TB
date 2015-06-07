
public class AnalisisLingkunganRK {
    LingkunganRK lngkngn = new LingkunganRK();

    String kebersihan (String kondisilantai, String kondisidinding, String kondisiatap, String kondisipintu, String kondisijendela){
    if ("bersih".equals(kondisilantai) && "bersih".equals(kondisidinding) &&  "bersih".equals(kondisiatap) && "bersih".equals(kondisipintu) && "bersih".equals(kondisijendela)){
        return "HASIL SESUAI";
    }
    else {
        return "HASIL TIDAK SESUAI";
    }
    }    

    }
    

