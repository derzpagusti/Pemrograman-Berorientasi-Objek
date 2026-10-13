package uts.no2;

public class MiAyam extends MiBaso
{
    private final int hargaMiAyam = 10000;

    public int getHargaMiAyam() {return hargaMiAyam;}    

    public MiAyam(String id, boolean menu) 
    {
        super(id, menu);
        
        if (menu == true) {
            super.setMenu("Anda memesan Bakso");
        } else {
            super.setMenu("Anda memesan Mi Ayam");
        }
    }

    public String getInfoMi() {
        String info = "";
        info += "Pesanan nomor " + super.getId() + " adalah " + super.getMenu() + "\n";
        info += "Harga      : " + getHargaMiAyam() + "\n";
        return info;
    }
}
