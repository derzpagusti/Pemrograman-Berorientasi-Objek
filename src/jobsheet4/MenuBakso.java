package jobsheet4;

public class MenuBakso 
{
    private String idMenu;
    private String namaMenu;
    private double harga;

    public MenuBakso(String idMenu, String namaMenu, double harga) 
    {
        this.idMenu = idMenu;
        this.namaMenu = namaMenu;
        this.harga = harga;
    }

    public String getIdMenu() { 
        return idMenu; 
    }
    public void setIdMenu(String idMenu) { 
        this.idMenu = idMenu;
    }
    public String getNamaMenu() { 
        return namaMenu; 
    }
    public void setNamaMenu(String namaMenu) { 
        this.namaMenu = namaMenu; 
    }
    public double getHarga() { 
        return harga; 
    }
    public void setHarga(double harga) { 
        this.harga = harga; 
    }

    public String getInfo() {
        return namaMenu + " - Rp" + harga;
    }
}
