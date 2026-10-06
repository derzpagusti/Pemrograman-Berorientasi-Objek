package jobsheet7;

public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println("Program Testing Class Manager & Staff");
        Manager man[]   = new Manager[2];
        Staff   stf1[]  = new Staff[2];
        Staff   stf2[]  = new Staff[3];

        man[0] = new Manager();
        man[0].setNama("Tedjo");
        man[0].setNip("101");
        man[0].setGolongan("1");
        man[0].setTunjangan(5000000);
        man[0].setBagian("Administrasi");

        man[1] = new Manager();
        man[1].setNama("Atika");
        man[1].setNip("102");
        man[1].setGolongan("1");
        man[1].setTunjangan(2500000);
        man[1].setBagian("Pemasaran");

        stf1[0] = new Staff();
        stf1[0].setNama("Usman");
        stf1[0].setNip("0003");
        stf1[0].setGolongan("2");
        stf1[0].setLembur(10);
        stf1[0].setGajiLembur(10000);

        stf1[1] = new Staff();
        stf1[1].setNama("Anugrah");
        stf1[1].setNip("0005");
        stf1[1].setGolongan("3");
        stf1[1].setLembur(10);
        stf1[1].setGajiLembur(55000);
        man[0].setStaff(stf1);
        
        stf2[0] = new Staff();
        stf2[0].setNama("Hendra");
        stf2[0].setNip("0004");
        stf2[0].setGolongan("3");
        stf2[0].setLembur(15);
        stf2[0].setGajiLembur(5500);

        stf2[1] = new Staff();
        stf2[1].setNama("Arie");
        stf2[1].setNip("0006");
        stf2[1].setGolongan("4");
        stf2[1].setLembur(5);
        stf2[1].setGajiLembur(100000);
        
        stf2[2] = new Staff();
        stf2[2].setNama("Mentari");
        stf2[2].setNip("0007");
        stf2[2].setGolongan("3");
        stf2[2].setLembur(6);
        stf2[2].setGajiLembur(20000);
        man[1].setStaff(stf2);

        man[0].lihatInfo();
        man[1].lihatInfo();
    }    
}
