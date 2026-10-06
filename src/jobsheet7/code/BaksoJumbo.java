package jobsheet7.code;

public class BaksoJumbo extends BaksoMalang
{
    private         int jumlahPentolBesar;
    private final   int hargaPentolBesar = 10000;

    // public void setJumlahPentolBesar(int jumlahPentolBesar) { this.jumlahPentolBesar = jumlahPentolBesar; }
    // public int getHargaPentolBesar() { return hargaPentolBesar; }
    public BaksoJumbo() {}

    public void setItem(int jumlahPentol, int jumlahPentolBesar)
    {
        super.setItem(jumlahPentol);
        this.jumlahPentolBesar = jumlahPentolBesar;
    }

    public void setItem(int jumlahPentol, int jumlahTahu, int jumlahSiomay, int jumlahPentolBesar)
    {
        super.setItem(jumlahPentol, jumlahTahu, jumlahSiomay);
        this.jumlahPentolBesar = jumlahPentolBesar;
    }
    
    @Override 
    public String getInfo()
    {
        String info = "";
        info += "\n--------------------------------";
        info += "\nPesanan Bakso Jumbo anda: ";
        info += "\nPentol Besar : " + jumlahPentolBesar;
        info += getInfoItem();
        info += "\n--------------------------------";
        info += "\nHarga        : " + getHarga();
        info += "\n--------------------------------";
        return info;
    }

    @Override 
    public float getHarga()
        { return super.getHarga() + jumlahPentolBesar * hargaPentolBesar; }
}