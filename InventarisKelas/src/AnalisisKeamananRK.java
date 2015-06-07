
public class AnalisisKeamananRK {
    KeamananRK safety = new KeamananRK();

    public AnalisisKeamananRK() {
        this.safety = new AnalisisKeamananRK(){
            String kekokohan ( String kekokohan){
                if ("kokoh".equals(kekokohan) ){
                    return "HASIL SESUAI";
                }
                else {
                    return "HASIL TIDAK SESUAI";
                }
            }
            
            String kuncipintu ( String kuncipintu){
                if ("ada".equals(kuncipintu) ){
                    return "HASIL SESUAI";
                }
                else {
                    return "HASIL TIDAK SESUAI";
                }
            }
            
            String jendela ( String jendela){
                
                if ("ada".equals(jendela) ){
                    return "HASIL SESUAI";
                }
                else {
                    return "HASIL TIDAK SESUAI";
                }
            }
            
            String bahaya ( String bahaya){
                
                if ("ada".equals(bahaya) ){
                    return "HASIL SESUAI";
                }
                else {
                    return "HASIL TIDAK SESUAI";
                }
            }
            
        
        };
    }
}

    
    

