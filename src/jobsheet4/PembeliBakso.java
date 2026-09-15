package jobsheet4;

public class PembeliBakso 
{
    private String idPembeli;
    private String nama;
    private String alamat;

    public PembeliBakso(String idPembeli, String nama, String alamat) 
    {
        this.idPembeli = idPembeli;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getIdPembeli() { 
        return idPembeli; 
    }
    public void setIdPembeli(String idPembeli) { 
        this.idPembeli = idPembeli; 
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
        return nama + " (" + idPembeli + ")";
    }
}
