package uts.no2;

public class Bakso extends MiBaso
{
    private int tahu;
    private int siomay;
    private final int hargaTahu = 500;
    private final int hargaSiomay = 500;

    public Bakso(String id, boolean menu) {super(id, menu);}

    public void setSiomay(int siomay) {this.siomay = siomay;}
    public int getSiomay() {return siomay;}
    public void setTahu(int tahu) {this.tahu = tahu;}
    public int getTahu() {return tahu;}

    public float getHarga() {return tahu * hargaTahu + siomay * hargaSiomay;}
}