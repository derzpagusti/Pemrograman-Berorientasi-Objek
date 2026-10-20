package jobsheet8;

public class BaksoJumbo extends Bakso 
{
    private         int     jumlahPentolJumbo;
    private final   float   hargaPentolJumbo = 10000;    

    public BaksoJumbo() {}

    public void addPentolJumbo(int pentolJumbo) 
    {
        System.out.println("Menambah pentol jumbo sebanyak: " + pentolJumbo);
        jumlahPentolJumbo = pentolJumbo;
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
        System.out.println("Pentol Jumbo    : " + jumlahPentolJumbo);
        super.getInfo();
        System.out.println("Harga           : Rp " + getHarga());
        System.out.println();
    }

    @Override 
    public float getHarga()
    {
        return  super.getHarga()    +
                jumlahPentolJumbo   * hargaPentolJumbo;
    }
}
