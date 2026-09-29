package jobsheet6;

public class Dosen extends Pegawai
{
    public String nidn;

    public Dosen() 
    {
        System.out.println(gaji); 
        System.out.println("Objek dari class Dosen dibuat"); 
    }

    public String getInfo() 
        { return "NIDN   : " + nidn + "\n"; }

    public String getAllInfo()
    {
        String info = super.getInfo();
        info += this.getInfo();

        return info;
    }
}

// info += "NIP    : " + super.nip + "\n";
//         info += "Nama   : " + super.nama + "\n";
//         info += "Gaji   : " + super.gaji + "\n";