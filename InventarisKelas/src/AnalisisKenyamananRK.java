
public class AnalisisKenyamananRK {
    KenyamananRK comfort = new KenyamananRK();
    
    String kebisingan ( String kebisingan){
    if ("tidak bising".equals(kebisingan) ){
        return "HASIL SESUAI";
    }
    else {
        return "HASIL TIDAK SESUAI";
    }
    }
    
    String bau ( String bau){
    if ("tidak bau".equals(bau) ){
        return "HASIL SESUAI";
    }
    else {
        return "HASIL TIDAK SESUAI";
    }
    }
    
    String kebocoran ( String kebocoran){
    if ("tidak bocor".equals(kebocoran) ){
        return "HASIL SESUAI";
    }
    else {
        return "HASIL TIDAK SESUAI";
    }
    }
    
    String kerusakan ( String kerusakan){
    if ("tidak rusak".equals(kerusakan) ){
        return "HASIL SESUAI";
    }
    else {
        return "HASIL TIDAK SESUAI";
    }
    }
    
    String keausan ( String keausan){
    if ("tidak aus".equals(keausan) ){
        return "HASIL SESUAI";
    }
    else {
        return "HASIL TIDAK SESUAI";
    }
    }
    
}