
public class KriteriaRK {
    private int panjangrk;
    private int lebarrk;
    private int jml_kursi;
    private int jml_jendela;
    private int jml_pintu;
    private double rasioluas, luasrk;

    public int getPanjangrk() {
        return panjangrk;
    }

    public void setPanjangrk(int panjangrk) {
        this.panjangrk = panjangrk;
    }

    public int getLebarrk() {
        return lebarrk;
    }

    public void setLebarrk(int lebarrk) {
        this.lebarrk = lebarrk;
    }

    public int getJml_kursi() {
        return jml_kursi;
    }

    public void setJml_kursi(int jml_kursi) {
        this.jml_kursi = jml_kursi;
    }

    public int getJml_jendela() {
        return jml_jendela;
    }

    public void setJml_jendela(int jml_jendela) {
        this.jml_jendela = jml_jendela;
    }

    public int getJml_pintu() {
        return jml_pintu;
    }

    public void setJml_pintu(int jml_pintu) {
        this.jml_pintu = jml_pintu;
    }

    public double getRasioluas() {
        return rasioluas;
    }

    public void setRasioluas(double rasioluas) {
        this.rasioluas = rasioluas;
    }

    public double getLuasrk() {
        return luasrk;
    }

    public void setLuasrk(double luasrk) {
        this.luasrk = luasrk;
    }
     double hitungluas(int panjang, int lebar){
    int luasnya = panjang*lebar;
        return luasnya;
}
}


    