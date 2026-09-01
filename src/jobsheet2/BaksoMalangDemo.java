package jobsheet2;

public class BaksoMalangDemo 
{
    public static void main(String[] args) 
    {
        BaksoMalang m1 = new BaksoMalang();
        
        m1.addPentol(5);
        m1.addTahu(3);
        m1.addSiomay(2);

        m1.displayBakso();
        m1.eatBakso();
        m1.displayBakso();
        m1.eatBakso();

        BaksoMalang m2 = new BaksoMalang();

        m2.addPentol(7);
        m2.addTahu(5);
        m2.addSiomay(4);

        m2.displayBakso();
        m2.eatBakso();
        m2.displayBakso();
        m2.eatBakso();
    }    
}
