package jobsheet2;

public class BarangDemo 
{
    public static void main(String[] args) 
    {
        Barang b1 = new Barang();
        b1.kode         = "ATK01";
        b1.nama         = "Bolpoin Pilot Hitam";
        b1.hargaKotor   = 3500;
        b1.diskon       = 0.1;
        
        b1.displayInfo();
    }    
}
