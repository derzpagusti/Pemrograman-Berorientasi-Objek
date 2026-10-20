package jobsheet8;

public class AbstractClassDemo 
{
    void main() {
        Hewan h1 = new Hewan(10, "Rumput", "Savana");
        h1.cetakInfo();
        h1.bergerak();
        h1.bernapas();

        Lebah l1 = new Lebah("Ratu", 0.05, "Nektar", "Hutan");
        l1.cetakInfo();
        l1.bergerak();
        l1.bernapas();
    }
}
