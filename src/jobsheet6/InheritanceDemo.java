package jobsheet6;

public class InheritanceDemo 
{
    public static void main(String[] args) 
    {
        // Dosen dsn1  = new Dosen();

        // dsn1.nama   = "yansy Ayuningtyas";
        // dsn1.nip    = "34329837";
        // dsn1.gaji   = 3000000;
        // dsn1.nidn   = "1989432439";

        // System.out.println(dsn1.getAllInfo());

        Dosen dsn2  = new Dosen("34329837", "yansy Ayuningtyas", 3000000, "1989432439");
        System.out.println(dsn2.getAllInfo());
    }
}
