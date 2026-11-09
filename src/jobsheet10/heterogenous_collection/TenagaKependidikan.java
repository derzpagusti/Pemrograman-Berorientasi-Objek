package jobsheet10.heterogenous_collection;

public class TenagaKependidikan extends Pegawai
{
    public String kategori;

    public TenagaKependidikan() {}

    public TenagaKependidikan(String kategori, String nip, String nama) {
        super(nip, nama);
        this.kategori = kategori;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kategori    : " + kategori);
    }
}
