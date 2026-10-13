package uts.no2;

public class BaksoJumbo extends Bakso
{
    private int pentolJumbo;
    private final int hargaPentolJumbo = 2000;

    public void setPentolJumbo(int pentolJumbo) {this.pentolJumbo = pentolJumbo;}
    public int getPentolJumbo() {return pentolJumbo;}
    public int getHargaPentolJumbo() {return hargaPentolJumbo;}

    public BaksoJumbo(String id, boolean menu, int pentolJumbo) {
        super(id, menu);
        this.pentolJumbo = pentolJumbo;
    }

    public BaksoJumbo(String id, boolean menu, int pentolJumbo, int tahu, int siomay) 
    {
        super(id, menu);
        this.pentolJumbo = pentolJumbo;
        setTahu(tahu);
        setSiomay(siomay);
    }
    
    public String getInfoBakso()
    {
        String info = "";
        info += "Pesanan nomor " + super.getId() + " adalah " + super.getMenu() + "\n";
        info += "Pentol     : " + pentolJumbo + "\n";
        info += "Tahu       : " + super.getTahu() + "\n";
        info += "Siomay     : " + super.getSiomay() + "\n";
        info += "Harga      : " + getHarga() + "\n";
        return info;
    }

    @Override 
    public float getHarga()
    {
        return pentolJumbo * hargaPentolJumbo + super.getHarga();
    }
}
