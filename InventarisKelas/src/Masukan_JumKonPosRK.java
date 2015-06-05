import java.util.Scanner;
public class Masukan_JumKonPosRK extends Masukkan_IdentitasRK {
    JumKonPosRK jukopos = new JumKonPosRK();
    
    @Override
    void analisisIdentitasRK(){
        Scanner analisID = new Scanner(System.in);
        System.out.println("Masukkan Nama Ruangan : ");
        String namaruang = (analisID.next());
        System.out.println("Masukkan Lokasi Ruangan : ");
        String lokruang = (analisID.next());
        System.out.println("Masukkan Fakultas : ");
        String fakultas = (analisID.next());
    }
    
    void analyst(){
        Scanner analisID = new Scanner(System.in);
        System.out.println("Berapa Jumlah Steker di Ruangan? ");
        int jml_steker = (analisID.nextInt());
        System.out.println("Bagaimana Kondisi Steker di Ruangan? ");
        String kond_steker = (analisID.next());
        System.out.println("Dimana Posisi Steker? ");
        String posisi_steker = (analisID.next());
        System.out.println("Berapa Jumlah Kabel LCD yang ada di Ruangan? ");
        int jml_kabellcd = (analisID.nextInt());
        System.out.println("Bagaimana Kondisi Kabel LCD Tersebut? ");
        String kond_kabellcd = (analisID.next());
        System.out.println("Dimana Posisi Kabel LCD ? ");
        String posisi_kabellcd = (analisID.next());
        System.out.println("Berapa Jumlah Lampu yang ada di Ruangan? ");
        int jml_lampu = (analisID.nextInt());
        System.out.println("Bagaimana Kondisi Lampu Tersebut? ");
        String kond_lampu = (analisID.next());
        String posisi_lampu = (analisID.next());
        int jml_kipas = (analisID.nextInt());
        String kond_kipas = (analisID.next());
        String posisi_kipas = (analisID.next());
        int jml_ac = (analisID.nextInt());
        String kond_ac = (analisID.next());
        String posisi_ac = (analisID.next());
        String SSID = (analisID.next());
        int bandwith = (analisID.nextInt());
        int jmlh_cctv = (analisID.nextInt());
        String kond_cctv = (analisID.next());
        String posisi_cctv = (analisID.next());
        
    }
    
}
