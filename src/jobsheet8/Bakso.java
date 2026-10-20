package jobsheet8;

public abstract class Bakso 
{
    private int             jumlahPentol,
                            jumlahTahu,
                            jumlahSiomay,
                            jumlahGorengan;
    private final   float   hargaPentol     = 2000,
                            hargaTahu       = 500,
                            hargaSiomay     = 500,
                            hargaGorengan   = 500;

    public Bakso() {}

    public void setJumlahPentol(int jumlahPentol) {this.jumlahPentol = jumlahPentol;}
    public void setJumlahTahu(int jumlahTahu) {this.jumlahTahu = jumlahTahu;}
    public void setJumlahSiomay(int jumlahSiomay) {this.jumlahSiomay = jumlahSiomay;}
    public void setJumlahGorengan(int jumlahGorengan) {this.jumlahGorengan = jumlahGorengan;}

    public int getJumlahPentol() {return jumlahPentol;}
    public int getJumlahTahu() {return jumlahTahu;}
    public int getJumlahSiomay() {return jumlahSiomay;}
    public int getJumlahGorengan() {return jumlahGorengan;}

    public float getHargaPentol() {return hargaPentol;}
    public float getHargaTahu() {return hargaTahu;}
    public float getHargaSiomay() {return hargaSiomay;}
    public float getHargaGorengan() {return hargaGorengan;}
    
    public abstract void addTahu(int tahu);
    public abstract void addSiomay(int siomay);
    public abstract void addGorengan(int gorengan);

    public void getInfo()
    {
        System.out.println("Tahu            : " + jumlahTahu);
        System.out.println("Siomay          : " + jumlahSiomay);
        System.out.println("Gorengan        : " + jumlahGorengan);
    }

    public float getHarga()
    {
        return  jumlahPentol     * hargaPentol    + 
                jumlahTahu       * hargaTahu      + 
                jumlahSiomay     * hargaSiomay    +
                jumlahGorengan   * hargaGorengan;
    }
}
