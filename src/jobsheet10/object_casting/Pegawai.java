package jobsheet10.object_casting;

public class Pegawai 
{
    public String
        nip, nama;

    public Pegawai() {}

    public Pegawai(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public void displayInfo() {
        System.out.println("NIP:    " + nip);
        System.out.println("Nama    : " + nama);
    }
}
