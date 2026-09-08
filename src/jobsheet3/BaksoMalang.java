package jobsheet3;

public class BaksoMalang 
{
    private int pentol,
                tahu,
                siomay,
                harga;

    public void setPentol(int pentol) {
        this.pentol = pentol;
    }

    public void setTahu(int tahu) {
        this.tahu = tahu;
    }

    public void setSiomay(int siomay) {
        this.siomay = siomay;
    }

    public int getPentol() {
        return pentol;
    }

    public int getTahu() {
        return tahu;
    }

    public int getSiomay() {
        return siomay;
    }

    public int getHarga() 
    {
        harga = pentol * 2000 + tahu * 500 + siomay * 500;
        return harga;
    }

    public void displayBakso()
    {
        System.out.printf
        ("""
        Isi mangkok bakso saat ini:
        Pentol  : %d
        Tahu    : %d
        Siomay  : %d

        Harga Bakso : %d\n
        """
        , getPentol(), getTahu(), getSiomay(), getHarga()
        );
    }

    public void resetMakan() 
    {
        if (pentol == 0 && tahu == 0 && siomay == 0)
            System.out.println("Mangkok bakso anda masih kosong\n");
        else
        {
            setPentol(0);
            setTahu(0);
            setSiomay(0);

            System.out.println("Bakso telah dimakan\n");
        }
    }
}
