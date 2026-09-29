package jobsheet6.Assigment;

public class BaksoJumbo extends BaksoMalang
{
    public  int jumlahPentolBesar;

    public BaksoJumbo(int jumlahPentol, int jumlahSiomay, int jumlahTahu, int jumlahPentolBesar) 
    {
        super(jumlahPentol, jumlahSiomay, jumlahTahu);
        this.jumlahPentolBesar = jumlahPentolBesar;
    }
    
    @Override 
    public String getInfo()
    {
        String info = "";
        info += "Pesanan Bakso Jumbo anda: ";
        info += "\nPentol Besar : " + jumlahPentolBesar;
        info += getInfoItem();
        info += "\nHarga        : " + getHarga();
        return info;
    }

    @Override 
    public float getHarga()
        { return harga = super.getHarga() + jumlahPentolBesar * 5000; }
}