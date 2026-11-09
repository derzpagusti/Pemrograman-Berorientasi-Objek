package jobsheet10.object_casting;

import java.util.ArrayList;

public class Demo 
{
    void main() 
    {
        Dosen dsn1 = new Dosen("19940201", "Widia, S.Kom. M.Kom", "199402");
        Pegawai pgw1 = dsn1;

        System.out.println(dsn1.nip);
        System.out.println(dsn1.nama);
        System.out.println(dsn1.nidn);
        dsn1.mengajar();

        System.out.println(pgw1.nip);
        System.out.println(pgw1.nama);
        pgw1.displayInfo();

        // TenagaKependidikan test = (TenagaKependidikan) pgw1;

        Dosen newDosen = (Dosen) pgw1;

        System.out.println(newDosen.nama);
        System.out.println(newDosen.nidn);
        newDosen.mengajar();

        Dosen dsn2 = new Dosen("19700105", "Muhammad, S. T, M.T", "197001");

        TenagaKependidikan tendik1 = new TenagaKependidikan("19750301", "Aida, A.Md.", "Tenaga Administrasi");
        TenagaKependidikan tendik2 = new TenagaKependidikan("19650304", "Rika, S.T.", "Tenaga Laboratorium");

        ArrayList<Pegawai> daftarPegawai = new ArrayList<Pegawai>();

        daftarPegawai.add(dsn1);
        daftarPegawai.add(dsn2);
        daftarPegawai.add(tendik1);
        daftarPegawai.add(tendik2);

        System.out.println("Jumlah Pegawai: " + daftarPegawai.size());
    }    
}
