package jobsheet7.code;

public class BaksoTetelan extends BaksoMalang
{
    private         int jumlahTetelan;
    private final   int hargaTetelan = 5000;

    public BaksoTetelan() {}

    public void setItem(int jumlahPentol, int jumlahTetelan) 
    {
        super.setItem(jumlahPentol);
        this.jumlahTetelan = jumlahTetelan;
    }

    public void setItem(int jumlahPentol, int jumlahTahu, int jumlahSiomay, int jumlahTetelan)
    {
        super.setItem(jumlahPentol, jumlahTahu, jumlahSiomay);
        this.jumlahTetelan = jumlahTetelan;
    }

    @Override 
    public String getInfo()
    {
        String info = "";
        info += "\n--------------------------------";
        info += "\nPesanan Bakso Tetelan anda: ";
        info += getInfoItem();
        info += "\nTetelan      : " + jumlahTetelan;
        info += "\n--------------------------------";
        info += "\nHarga        : " + getHarga();
        info += "\n--------------------------------";
        return info;
    }

    @Override 
    public float getHarga()
        { return super.getHarga() + jumlahTetelan * hargaTetelan; }
}
