package jobsheet4;

import java.time.LocalDate;

public class BaksoDemo 
{
    public static void main(String[] args) 
    {
        PenjualBakso penjual1 = new PenjualBakso("P01", "Pak Man", "Jl. Malang No. 1");
        PembeliBakso pembeli1 = new PembeliBakso("B01", "Budi", "Jl. Merdeka No. 5");

        MenuBakso baksoUrat  = new MenuBakso("M01", "Bakso Urat", 15000);
        MenuBakso baksoTelur = new MenuBakso("M02", "Bakso Telur", 17000);

        TransaksiBakso transaksi1 = new TransaksiBakso("T01", LocalDate.of(2026, 9, 15), penjual1, pembeli1);
        transaksi1.tambahPesanan(baksoUrat);
        transaksi1.tambahPesanan(baksoTelur);

        System.out.println(transaksi1.getInfo());
    }
}
