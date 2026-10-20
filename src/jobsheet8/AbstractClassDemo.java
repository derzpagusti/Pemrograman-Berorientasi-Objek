package jobsheet8;

public class AbstractClassDemo 
{
    public void main() 
    {
        Lebah l1 = new Lebah("Ratu", 0.05, "Nektar", "Hutan");
        l1.cetakInfo();
        l1.bergerak();
        l1.bernapas();

        Ular u1 = new Ular(true, 1.2, "Tikus", "Rawa");
        u1.cetakInfo();
        u1.bergerak();
        u1.bernapas();
    }
}
