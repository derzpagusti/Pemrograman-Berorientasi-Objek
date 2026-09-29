package jobsheet6.Assigment;

public class BaksoTetelan extends BaksoMalang
{
    public  int jumlahTetelan;

    public BaksoTetelan(int jumlahPentol, int jumlahSiomay, int jumlahTahu, int jumlahTetelan) 
    {
        super(jumlahPentol, jumlahSiomay, jumlahTahu);
        this.jumlahTetelan = jumlahTetelan;
    }

    @Override 
    public String getInfo()
    {
        String info = "";
        info += "Pesanan Bakso Tetelan anda: ";
        info += getInfoItem();
        info += "\nTetelan      : " + jumlahTetelan;
        info += "\nHarga        : " + getHarga();
        return info;
    }

    @Override 
    public float getHarga()
        { return harga = super.getHarga() + jumlahTetelan * 3000; }
}
