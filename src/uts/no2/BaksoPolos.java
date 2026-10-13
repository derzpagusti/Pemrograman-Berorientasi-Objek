package uts.no2;

public class BaksoPolos extends Bakso
{
    private int pentol;
    private final int hargaPentol = 2000;

    public void setPentol(int pentol) {this.pentol = pentol;}
    public int getPentol() {return pentol;}
    public int getHargaPentol() {return hargaPentol;}

    public BaksoPolos(String id, boolean menu, int pentol) {
        super(id, menu);
        this.pentol = pentol;
    }

    public BaksoPolos(String id, boolean menu, int pentol, int tahu, int siomay) 
    {
        super(id, menu);
        this.pentol = pentol;
        setTahu(tahu);
        setSiomay(siomay);
    }
    
    public String getInfoBakso()
    {
        String info = "";
        info += "Pesanan nomor " + super.getId() + " adalah " + super.getMenu() + "\n";
        info += "Pentol     : " + pentol + "\n";
        info += "Tahu       : " + super.getTahu() + "\n";
        info += "Siomay     : " + super.getSiomay() + "\n";
        info += "Harga      : " + getHarga() + "\n";
        return info;
    }

    @Override 
    public float getHarga()
    {
        return pentol * hargaPentol + super.getHarga();
    }
}
