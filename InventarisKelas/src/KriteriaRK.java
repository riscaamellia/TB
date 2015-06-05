import java.util.Scanner;
public class KriteriaRK {
    private int panjangrk;
    private int lebarrk;
    private int jml_kursi;
    private int jml_jendela;
    private int jml_pintu;
    private int jml_ppntls;
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
         if (jml_jendela >=4){
            System.out.println("SESUAI");
        }
        else if(jml_jendela <4){
            System.out.println("TIDAK SESUAI");
        }
    }

    public int getJml_pintu() {
        return jml_pintu;
    }

    public void setJml_pintu(int jml_pintu) {
        this.jml_pintu = jml_pintu;
        if (jml_pintu >= 2){
            System.out.println("SESUAI");
        }
        else if (jml_pintu <2){
            System.out.println("TIDAK SESUAI");
        }
    }

    public int getJml_ppntls() {
        return jml_ppntls;
    }

    public void setJml_ppntls(int jml_ppntls) {
        this.jml_ppntls = jml_ppntls;
        if(jml_ppntls >=3){
            System.out.println("SESUAI");
        }
        else if (jml_ppntls <3){
            System.out.println("TIDAK SESUAI");
        }
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
    Scanner scan = new Scanner (System.in);
    double hitungluasruangan (int panjangrk, int lebarrk){
        luasrk = panjangrk*lebarrk;
        System.out.println("Luas Ruang Kelas = ");
        return luasrk;
    }
    double hitungrasioluas (double luasrk, int jml_kursi){
        rasioluas = luasrk / jml_kursi;
        if(rasioluas >= 0.5){
            System.out.println("SESUAI");
        }
        else if (rasioluas <= 0.5){
            System.out.println("TIDAK SESUAI");
        }
        System.out.println("rasio luas = "+rasioluas);
        return rasioluas;
    }
    
}
