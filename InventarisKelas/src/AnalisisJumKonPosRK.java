
public class AnalisisJumKonPosRK {
    
    JumKonPosRK tools = new JumKonPosRK();
    
    
    String kelistrikan (int jml_steker,int kond_steker, String posisi_steker){     
    if (jml_steker >=4 && kond_steker ==4 && "dipojok ruang".equals(posisi_steker) && "dekat dosen".equals(posisi_steker)){
        return "HASIL SESUAI";
    }
    else {
        return "HASIL TIDAK SESUAI";
    }
    }
      
    String lcd(int jml_kabellcd, String kond_kabellcd, String posisi_kabellcd){
    if (jml_kabellcd >=1 && "berfungsi".equals(kond_kabellcd) && "dekat dosen".equals(posisi_kabellcd)){
        return "HASIL SESUAI";
    }
    else {
        return "HASIL TIDAK SESUAI";
    }
    }
    
    String lampu (int jml_lampu , int kond_lampu , String posisi_lampu){
    if (jml_lampu >=18 && 18 ==kond_lampu && "atap ruangan".equals(posisi_lampu)){
        return "HASIL SESUAI";
    }
    else {
        return "HASIL TIDAK SESUAI";
    }
    }
    
    String kipasangin (int jml_kipas , int kond_kipas, String posisi_kipas){
    if (jml_kipas >=2 && kond_kipas ==2 && "atap ruangan".equals(posisi_kipas)){
        return "HASIL SESUAI";
    }
    else {
        return "HASIL TIDAK SESUAI";
    }
    }
    
    String ac (int jml_ac , String kond_ac, String posisi_ac){
    if (jml_ac >=1 && "baik".equals(kond_ac) && "dibelakang".equals(posisi_ac) && "disamping".equals(posisi_ac)){
        return "HASIL SESUAI";
    }
    else {
        return "HASIL TIDAK SESUAI";
    }
    }
   
    String internet (String SSID , String bandwidth){
    if ("UMM Hotspot".equals(SSID) && "UMM Hotspot".equals(bandwidth) ){
        return "HASIL SESUAI";
    }
    else {
        return "HASIL TIDAK SESUAI";
    }
    }
   
    String cctv (int jml_cctv , int kond_cctv, String posisi_cctv){
    if (jml_cctv==2 && kond_cctv ==2 && "depan".equals(posisi_cctv) && "belakang".equals(posisi_cctv)){
        return "HASIL SESUAI";
    }
    else {
        return "HASIL TIDAK SESUAI";
    }
    }

    }
    
        

