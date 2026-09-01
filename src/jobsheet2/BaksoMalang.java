package jobsheet2;

public class BaksoMalang 
{
    int pentol,
        tahu,
        siomay;
    
    int addPentol(int value)
    {
        return pentol+=value;
    }

    int addTahu(int value)
    {
        return tahu+=value;
    }

    int addSiomay(int value)
    {
        return siomay+=value;
    }

    void displayBakso()
    {
        System.out.println("Isi mangkok anda saat ini: ");
        System.out.println("Pentol  : " + pentol);
        System.out.println("Tahu    : " + tahu);
        System.out.println("Siomay  : " + siomay);
    }

    void eatBakso()
    {
        if (pentol != 0 && tahu != 0 && siomay != 0) 
        {
            System.out.println("Bakso telah dimakan!");
            pentol  = 0;
            tahu    = 0;
            siomay  = 0;
        }
        else
        {
            System.out.println("Anda belum menmbahkan apapun dalam mangkok");
        }
    }
}
