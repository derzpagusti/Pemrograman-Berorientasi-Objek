package jobsheet6;

public class Dosen extends Pegawai
{
    public String nidn;

    // public Dosen() 
    // {
    //     System.out.println(gaji); 
    //     System.out.println("Objek dari class Dosen dibuat"); 
    // }

    public Dosen(String nip, String nama, float gaji, String nidn)
    {
        super(nip, nama, gaji);
        this.nidn = nidn;
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
// System.out.print("Objek dari class Dosen dibuat dengan constructor berparameter\n");

// super();  
        // super.nip   = nip;
        // super.nama  = nama;
        // super.gaji  = gaji;
        // this.nidn   = nidn;