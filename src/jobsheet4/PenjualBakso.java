package jobsheet4;

public class PenjualBakso 
{
    private String idPenjual;
    private String nama;
    private String alamat;

    public PenjualBakso(String idPenjual, String nama, String alamat) 
    {
        this.idPenjual = idPenjual;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getIdPenjual() { 
        return idPenjual; 
    }
    public void setIdPenjual(String idPenjual) { 
        this.idPenjual = idPenjual; 
    }
    public String getNama() { 
        return nama; 
    }
    public void setNama(String nama) { 
        this.nama = nama; 
    }
    public String getAlamat() { 
        return alamat; 
    }
    public void setAlamat(String alamat) { 
        this.alamat = alamat; 
    }

    public String getInfo() {
        return nama + " (" + idPenjual + ")";
    }
}
