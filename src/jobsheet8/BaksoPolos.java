package jobsheet8;

public class BaksoPolos extends Bakso 
{
    public BaksoPolos() {}

    public void addPentol(int pentol) 
    {
        System.out.println("Menambah pentol sebanyak: " + pentol);
        super.setJumlahPentol(pentol);
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
        System.out.println("Pentol          : " + super.getJumlahPentol());
        super.getInfo();
        System.out.println("Harga           : Rp " + super.getHarga());
        System.out.println();
    }
}
