
public class JumKonPosRK {
    private int jml_steker;
    private String kond_steker;
    private String posisi_steker;
    private int jml_kabellcd;
    private String kond_kabellcd;
    private String posisi_kabellcd;
    private int jml_lampu;
    private String kond_lampu;
    private String posisi_lampu;
    private int jml_kipas;
    private String kond_kipas;
    private String posisi_kipas;
    private int jml_ac;
    private String kond_ac;
    private String posisi_ac;
    private String SSID;
    private int bandwidth;
    private int jml_cctv;
    private String kond_cctv;
    private String posisi_cctv;

    public int getJml_steker() {
        return jml_steker;
    }

    public void setJml_steker(int jml_steker) {
        this.jml_steker = jml_steker;
        if (jml_steker >=4){
                System.out.println("SESUAI");
            }
            else if(jml_steker <4){
                System.out.println("TIDAK SESUAI");
            }
    }

    public String getKond_steker() {
        return kond_steker;
    }

    public void setKond_steker(String kond_steker) {
        this.kond_steker = kond_steker;
        if ("Berfungsi".equals(kondisisteker))
            System.out.println("SESUAI");
        else if("Rusak".equals(kondisisteker))
            System.out.println("TIDAK SESUAI");
        else
            System.out.println("INPUTAN SALAH");
    }

    public String getPosisi_steker() {
        return posisi_steker;
    }

    public void setPosisi_steker(String posisi_steker) {
        this.posisi_steker = posisi_steker;
        String posisilampu = scan.nextLine();
        if ("Dipojok ruangan".equals(posisisteker))
            System.out.println("SESUAI");
        else if ("Dekat dosen".equals(posisisteker))
            System.out.println("SESUAI");
        else
            System.out.println("INPUTAN SALAH");
    }

    public int getJml_kabellcd() {
        return jml_kabellcd;
    }

    public void setJml_kabellcd(int jml_kabellcd) {
        this.jml_kabellcd = jml_kabellcd;
        if (jml_kabellcd >=1){
                System.out.println("SESUAI");
            }
            else if(jml_steker <1){
                System.out.println("TIDAK SESUAI");
            }
    }

    public String getKond_kabellcd() {
        return kond_kabellcd;
    }

    public void setKond_kabellcd(String kond_kabellcd) {
        this.kond_kabellcd = kond_kabellcd;
        if ("Berfungsi".equals(kondisikabel))
            System.out.println("SESUAI");
        else if("Rusak".equals(kondisikabel))
            System.out.println("TIDAK SESUAI");
        else
            System.out.println("INPUTAN SALAH");
    }

    public String getPosisi_kabellcd() {
        return posisi_kabellcd;
    }

    public void setPosisi_kabellcd(String posisi_kabellcd) {
        this.posisi_kabellcd = posisi_kabellcd;
        if ("Dekat dosen".equals(posisikabellcd))
            System.out.println("SESUAI");
        else if
            System.out.println("TIDAK SESUAI");
    }

    public int getJml_lampu() {
        return jml_lampu;
    }

    public void setJml_lampu(int jml_lampu) {
        this.jml_lampu = jml_lampu;
        if(jml_lampu >=6){
            System.out.println("SESUAI");
        }
        else if(jml_lampu <6){
            System.out.println("TIDAK SESUAI");
        }
    }

    public String getKond_lampu() {
        return kond_lampu;
    }

    public void setKond_lampu(String kond_lampu) {
        this.kond_lampu = kond_lampu;
        String kondisilampu = scan.nextLine();
        if ("Baik".equals(kondisilampu))
            System.out.println("SESUAI");
        else if("Buruk".equals(kondisilampu))
            System.out.println("TIDAK SESUAI");
        else
            System.out.println("INPUTAN SALAH");
    }

    public String getPosisi_lampu() {
        return posisi_lampu;
    }

    public void setPosisi_lampu(String posisi_lampu) {
        this.posisi_lampu = posisi_lampu;
        String posisilampu = scan.nextLine();
        if ("Kiri Depan, Kiri Tengah, Kiri Belakang".equals(posisilampu))
            System.out.println("SESUAI");
        else if ("Kanan Depan, Kanan Tengah Kanan Belakang".equals(posisilampu))
            System.out.println("SESUAI");
        else
            System.out.println("INPUTAN SALAH");
    }

    public int getJml_kipas() {
        return jml_kipas;
    }

    public void setJml_kipas(int jml_kipas) {
        this.jml_kipas = jml_kipas;
        if(jml_kipas >=2){
            System.out.println("SESUAI");
        }
        else if(jml_kipas <2){
            System.out.println("TIDAK SESUAI");
        }
    }

    public String getKond_kipas() {
        return kond_kipas;
    }

    public void setKond_kipas(String kond_kipas) {
        this.kond_kipas = kond_kipas;
        String KA = scan.nextLine();
        if("Baik".equalsIgnoreCase(KA))
            System.out.println("SESUAI");
        else if("Buruk".equals(KA))
            System.out.println("TIDAK SESUAI");
        else
            System.out.println("INPUTAN SALAH");
    }

    public String getPosisi_kipas() {
        return posisi_kipas;
    }

    public void setPosisi_kipas(String posisi_kipas) {
        this.posisi_kipas = posisi_kipas;
        String PKA = scan.nextLine();
        if ("Kiri Depan, Kanan tengah".equals(PKA))
              System.out.println("SESUAI");
        else if("Belakang".equals(PKA))
              System.out.println("TIDAK SESUAI");
        else
              System.out.println("INPUTAN SALAH");
    }

    public int getJml_ac() {
        return jml_ac;
    }

    public void setJml_ac(int jml_ac) {
        this.jml_ac = jml_ac;
        if (jml_ac >=2){
            System.out.println("SESUAI");
        }
        else if(jml_ac <2){
            System.out.println("TIDAK SESUAI");
        }
    }

    public String getKond_ac() {
        return kond_ac;
    }

    public void setKond_ac(String kond_ac) {
        this.kond_ac = kond_ac;
        String KAC = scan.nextLine();
        if("Baik".equals(KAC))
              System.out.println("SESUAI");
        else if("Buruk".equals(KAC))
              System.out.println("TIDAK SESUAI");
        else
              System.out.println("INPUTAN SALAH");
    }

    public String getPosisi_ac() {
        return posisi_ac;
    }

    public void setPosisi_ac(String posisi_ac) {
        this.posisi_ac = posisi_ac;
        if ("Belakang".equals(PAC))
              System.out.println("SESUAI");
        else if("Samping".equals(PAC))
              System.out.println("SESUAI");
        else
              System.out.println("TIDAK SESUAI");
    }

    public String getSSID() {
        return SSID;
    }

    public void setSSID(String SSID) {
        this.SSID = SSID;
         if ("UMM Hotspot".equals(NS))
            System.out.println("SESUAI");
        else if
            System.out.println("TIDAK SESUAI");
    }

    public int getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(int bandwidth) {
        this.bandwidth = bandwidth;
    }

    public int getJml_cctv() {
        return jml_cctv;
    }

    public void setJml_cctv(int jml_cctv) {
        this.jml_cctv = jml_cctv;
        if (jml_cctv >=1){
                System.out.println("SESUAI");
            }
            else if(jml_cctv <1){
                System.out.println("TIDAK SESUAI");
            }
    }

    public String getKond_cctv() {
        return kond_cctv;
    }

    public void setKond_cctv(String kond_cctv) {
        this.kond_cctv = kond_cctv;
        if("Baik".equals(KCCTV))
              System.out.println("SESUAI");
        else if("Buruk".equals(KCCTV))
              System.out.println("TIDAK SESUAI");
        else
              System.out.println("INPUTAN SALAH");
    }

    public String getPosisi_cctv() {
        return posisi_cctv;
    }

    public void setPosisi_cctv(String posisi_cctv) {
        this.posisi_cctv = posisi_cctv;
        if ("Depan".equals(PCCTV))
              System.out.println("SESUAI");
        else if("Belakang".equals(PCCTV))
              System.out.println("SESUAI");
        else
              System.out.println("TIDAK SESUAI");
    }
    
}
