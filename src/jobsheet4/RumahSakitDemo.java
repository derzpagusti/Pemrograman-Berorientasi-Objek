package jobsheet4;

import java.time.LocalDate;

public class RumahSakitDemo 
{
    public static void main(String[] args) 
    {
        Pegawai ani     = new Pegawai("1234", "dr. Ani");
        Pegawai bagus   = new Pegawai("4567", "dr. Bagus");
        
        Pegawai desi    = new Pegawai("1234", "Ns. Desi");
        Pegawai eka     = new Pegawai("4567", "Ns. Eka");

        Pasien ps1 = new Pasien("343298", "Puspa Widya");
        ps1.tambahKonsultasi(LocalDate.of(2021, 8, 11), ani, desi);
        ps1.tambahKonsultasi(LocalDate.of(2021, 9, 11), bagus, eka);

        System.out.println(ps1.getInfo());

        Pasien ps2 = new Pasien("997744", "Yenny Anggreani");
        System.out.println(ps2.getInfo());
    }
}
