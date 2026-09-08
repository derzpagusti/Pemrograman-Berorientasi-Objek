package jobsheet3;

public class BaksoMalangMangkok 
{
    public static void main(String[] args) 
    {
        BaksoMalang mangkok1 = new BaksoMalang();
        mangkok1.displayBakso();

        mangkok1.setPentol(5);
        mangkok1.setTahu(4);
        mangkok1.setSiomay(4);
        mangkok1.displayBakso();
        mangkok1.resetMakan();

        mangkok1.displayBakso();
        mangkok1.resetMakan();

        BaksoMalang mangkok2 = new BaksoMalang();
        mangkok2.displayBakso();

        mangkok2.setPentol(7);
        mangkok2.setTahu(6);
        mangkok2.setSiomay(6);
        mangkok2.displayBakso();
        mangkok2.resetMakan();

        mangkok2.displayBakso();
        mangkok2.resetMakan();

        BaksoMalang mangkok3 = new BaksoMalang();
        mangkok3.displayBakso();

        mangkok3.setPentol(3);
        mangkok3.setTahu(2);
        mangkok3.setSiomay(2);
        mangkok3.displayBakso();
        mangkok3.resetMakan();

        mangkok3.displayBakso();
        mangkok3.resetMakan();
    }    
}
