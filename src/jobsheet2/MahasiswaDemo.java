package jobsheet2;

public class MahasiswaDemo 
{
    public static void main(String[] args) 
    {
        Mahasiswa m1 = new Mahasiswa();
        m1.nim      = "023432";
        m1.nama     = "Yansy Ayuningtyas";
        m1.alamat   = "Nias, Sumatra Utara";
        m1.kelas    = "2A";

        m1.displayBiodata();

        Mahasiswa m2 = new Mahasiswa();
        Mahasiswa m3 = new Mahasiswa();

        m2.nim     = "010101";
        m2.nama     = "Aji";
        m2.alamat   = "Malang, Jawa Timur";
        m2.kelas    = "2B";

        m3.nim      = "02020";
        m3.nama     = "Budi";
        m3.alamat   = "Surabaya, Jawa Timur";
        m3.kelas    = "2C";

        m2.displayBiodata();
        m3.displayBiodata();
    }
}
