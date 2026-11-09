package jobsheet10.polymorphic_arguments_and_instance_of;

public class TenagaKependidikan extends Pegawai
{
    public String kategori;

    public TenagaKependidikan() {}

    public TenagaKependidikan(String nip, String nama, String kategori) {
        super(nip, nama);
        this.kategori = kategori;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kategori    : " + kategori);
    }
}
