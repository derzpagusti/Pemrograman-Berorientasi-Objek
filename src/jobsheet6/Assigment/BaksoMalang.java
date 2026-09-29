package jobsheet6.Assigment;

public class BaksoMalang 
{
    public  int     jumlahPentol,
                    jumlahTahu,
                    jumlahSiomay;
    public  float   harga;

    public BaksoMalang(int jumlahPentol, int jumlahTahu, int jumlahSiomay) 
    {
        this.jumlahPentol = jumlahPentol;
        this.jumlahTahu = jumlahTahu;
        this.jumlahSiomay = jumlahSiomay;
    }
    
    public String getInfoItem()
    {
        String info = "";
        info += "\nPentol       : " + jumlahPentol;
        info += "\nTahu         : " + jumlahTahu;
        info += "\nSiomay       : " + jumlahSiomay;

        return info;
    }

    public String getInfo()
    {
        String info = "";
        info += "Pesanan Bakso Malang anda: ";
        info += getInfoItem();
        info += "\nHarga        : " + getHarga();

        return info;
    }

    public float getHarga() 
        { return harga = jumlahPentol * 2000 + jumlahTahu * 500 + jumlahSiomay * 500; }
}
