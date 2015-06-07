
public class LingkunganRK {
    private String kondisilantai;
    private String kondisidinding;
    private String kondisiatap;
    private String kondisipintu;
    private String kondisijendela;

    public String getKondisilantai() {
        return kondisilantai;
    }

    public void setKondisilantai(String kondisilantai, Object KL) {
        this.kondisilantai = kondisilantai;
        if ("Bersih".equals(KL))
            System.out.println("SESUAI");
        else if("Kotor".equals(KL))
            System.out.println("TIDAK SESUAI");
        else
            System.out.println("INPUTAN SALAH");
    }

    public String getKondisidinding() {
        return kondisidinding;
    }

    public void setKondisidinding(String kondisidinding, Object KD) {
        this.kondisidinding = kondisidinding;
        if ("Bersih".equals(KD))
            System.out.println("SESUAI");
        else if("Kotor".equals(KD))
            System.out.println("TIDAK SESUAI");
        else
            System.out.println("INPUTAN SALAH");
    }

    public String getKondisiatap() {
        return kondisiatap;
    }

    public void setKondisiatap(String kondisiatap, Object KA) {
        this.kondisiatap = kondisiatap;
        if ("Baik".equals(KA))
            System.out.println("SESUAI");
        else if("Rusak".equals(KA))
            System.out.println("TIDAK SESUAI");
        else
            System.out.println("INPUTAN SALAH");
    }

    public String getKondisipintu() {
        return kondisipintu;
    }

    public void setKondisipintu(String kondisipintu, Object KP) {
        this.kondisipintu = kondisipintu;
        if ("Berfungsi".equals(KP))
            System.out.println("SESUAI");
        else if("Tidak berfungsi".equals(KP))
            System.out.println("TIDAK SESUAI");
        else
            System.out.println("INPUTAN SALAH");
        
    }

    public String getKondisijendela() {
        return kondisijendela;
    }

    public void setKondisijendela(String kondisijendela, Object KJ) {
        this.kondisijendela = kondisijendela;
        if ("Berfungsi".equals(KJ))
            System.out.println("SESUAI");
        else if("Tidak berfungsi".equals(KJ))
            System.out.println("TIDAK SESUAI");
        else
            System.out.println("INPUTAN SALAH");
        
    }
    
    
}
