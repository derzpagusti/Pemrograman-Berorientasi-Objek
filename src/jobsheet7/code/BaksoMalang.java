package jobsheet7.code;

public class BaksoMalang 
{
    private         int     jumlahPentol,
                            jumlahTahu,
                            jumlahSiomay;
    private final   float   hargaPentol = 2000,
                            hargaTahu = 500,
                            hargaSiomay = 500;

    // public void setJumlahPentol(int jumlahPentol) { this.jumlahPentol = jumlahPentol; }
    // public int getJumlahPentol() { return jumlahPentol; }
    // public void setJumlahSiomay(int jumlahSiomay) { this.jumlahSiomay = jumlahSiomay; }
    // public int getJumlahSiomay() { return jumlahSiomay; }
    // public void setJumlahTahu(int jumlahTahu) { this.jumlahTahu = jumlahTahu; }
    // public int getJumlahTahu() { return jumlahTahu; }
    public BaksoMalang() {}

    public void setItem(int jumlahPentol) { this.jumlahPentol = jumlahPentol; }
    public void setItem(int jumlahPentol, int jumlahTahu, int jumlahSiomay)
    {
        this.jumlahPentol   = jumlahPentol;
        this.jumlahSiomay   = jumlahSiomay;
        this.jumlahTahu     = jumlahTahu;
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
        info += "\n--------------------------------";
        info += "\nPesanan Bakso Malang anda: ";
        info += getInfoItem();
        info += "\n--------------------------------";
        // info += "\nOngkir       : " + getO;
        info += "\nHarga        : " + getHarga();
        info += "\n--------------------------------";

        return info;
    }

    public float getHarga()
        { return jumlahPentol * hargaPentol + jumlahTahu * hargaTahu + jumlahSiomay * hargaSiomay; }

    // public float getHargaOngkir(float ongkir) 
    //     { return getHarga() +  ongkir; }

    // public float getHargaDiskon(float diskon)
    //     { return getHarga() + diskon; }
}
