package jobsheet4;

import java.time.LocalDate;
import java.util.ArrayList;

public class TransaksiBakso 
{
    private String idTransaksi;
    private LocalDate tanggal;
    private PenjualBakso penjual;
    private PembeliBakso pembeli;
    private ArrayList<MenuBakso> daftarPesanan;
    private double totalHarga;

    public TransaksiBakso(String idTransaksi, LocalDate tanggal, PenjualBakso penjual, PembeliBakso pembeli) 
    {
        this.idTransaksi = idTransaksi;
        this.tanggal = tanggal;
        this.penjual = penjual;
        this.pembeli = pembeli;
        this.daftarPesanan = new ArrayList<MenuBakso>();
        this.totalHarga = 0;
    }

    public String getIdTransaksi() { 
        return idTransaksi; 
    }
    public void setIdTransaksi(String idTransaksi) { 
        this.idTransaksi = idTransaksi; 
    }
    public LocalDate getTanggal() { 
        return tanggal; 
    }
    public void setTanggal(LocalDate tanggal) { 
        this.tanggal = tanggal; 
    }
    public PenjualBakso getPenjual() { 
        return penjual; 
    }
    public void setPenjual(PenjualBakso penjual) { 
        this.penjual = penjual; 
    }
    public PembeliBakso getPembeli() { 
        return pembeli; 
    }
    public void setPembeli(PembeliBakso pembeli) { 
        this.pembeli = pembeli; 
    }
    public double getTotalHarga() { 
        return totalHarga; 
    }

    public void tambahPesanan(MenuBakso menu) 
    {
        daftarPesanan.add(menu);
        totalHarga += menu.getHarga();
    }

    public String getInfo() 
    {
        String info = "";
        info += "ID Transaksi : " + idTransaksi + "\n";
        info += "Tanggal      : " + tanggal + "\n";
        info += "Penjual      : " + penjual.getInfo() + "\n";
        info += "Pembeli      : " + pembeli.getInfo() + "\n";

        if (!daftarPesanan.isEmpty()) 
        {
            info += "Daftar Pesanan :\n";
            for (MenuBakso menu : daftarPesanan)
                info += "\t" + menu.getInfo() + "\n";
        } else
            info += "Belum ada pesanan\n";

        info += "Total Harga  : Rp" + totalHarga + "\n";
        return info;
    }
}
