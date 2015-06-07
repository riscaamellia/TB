
public class AnalisisKebersihanRK {
    KebersihanRK clean = new KebersihanRK();
    
    String sirkulasiudara (String sirkulasiudara){
    if ("lancar".equals(sirkulasiudara)){
          return "HASIL SESUAI";
    }
    else {
          return "HASIL TIDAK SESUAI";
    }
    }
    
    String pencahayaan (int pencahayaan ){
    if (pencahayaan>=250 && pencahayaan <=350){
          return "HASIL SESUAI";
    }
    else {
          return "HASIL TIDAK SESUAI";
    }
    }
    
    String kelembapan (int kelembapan){
    if (kelembapan >=70 && kelembapan <=80){
          return "HASIL SESUAI";
    }
    else {
          return "HASIL TIDAK SESUAI";
    }
    }
           
    String suhucelcius (int suhucelcius ){
    if (suhucelcius >=25 && suhucelcius <=35){
          return "HASIL SESUAI";
    }
    else {
          return "HASIL TIDAK SESUAI";
    }
    
    }   
    
    
}
    

