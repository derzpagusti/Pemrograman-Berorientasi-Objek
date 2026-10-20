package jobsheet8;

public class BaksoTetelan extends Bakso 
{
    private         int     jumlahPentolTetelan;
    private final   float   hargaPentolTetelan = 5000;    

    public BaksoTetelan() {}

    public void addPentolTetelan(int pentolTetelan) 
    {
        System.out.println("Menambah pentol tetelan sebanyak: " + pentolTetelan);
        jumlahPentolTetelan= pentolTetelan;
    }

    @Override
    public void addTahu(int tahu) 
    {
        System.out.println("Menambah tahu sebanyak: " + tahu);
        super.setJumlahTahu(tahu);
    }

    @Override
    public void addSiomay(int siomay) 
    {
        System.out.println("Menambah siomay sebanyak: " + siomay);
        super.setJumlahSiomay(siomay);
    }

    @Override
    public void addGorengan(int gorengan) 
    {
        System.out.println("Menambah gorengan sebanyak: " + gorengan);
        super.setJumlahGorengan(gorengan);
    }
    
    @Override 
    public void getInfo()
    {
        System.out.println("Pesanan anda:");
        System.out.println("Pentol Tetelan  : " + jumlahPentolTetelan);
        super.getInfo();
        System.out.println("Harga           : Rp " + getHarga());
        System.out.println();
    }

    @Override 
    public float getHarga()
    {
        return  super.getHarga()    +
                jumlahPentolTetelan * hargaPentolTetelan;
    }
}
