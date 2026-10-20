package jobsheet8;

public class BaksoDemo 
{
    void main() 
    {
        BaksoPolos bp1 = new BaksoPolos();
        bp1.addPentol(5);
        bp1.addTahu(2);
        bp1.addSiomay(2);
        bp1.addGorengan(2);
        bp1.getInfo();
        
        BaksoJumbo bj1 = new BaksoJumbo();
        bj1.addPentolJumbo(1);
        bj1.addTahu(1);
        bj1.addSiomay(1);
        bj1.addGorengan(1);
        bj1.getInfo();

        BaksoTetelan bt1 = new BaksoTetelan();
        bt1.addPentolTetelan(5);
        bt1.addTahu(2);
        bt1.addSiomay(2);
        bt1.addGorengan(2);
        bt1.getInfo();
    }    
}
