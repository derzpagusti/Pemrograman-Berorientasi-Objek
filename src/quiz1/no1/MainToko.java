package quiz1;

import java.time.LocalDateTime;

public class MainToko 
{
    public static void main(String[] args) 
    {
        CustomerToko cst1   = new CustomerToko(1, "Si A", "Malang", 001);
        cst1.addCustomer();

        ProductToko pct1    = new ProductToko(101, 5000, "Buku");
        pct1.addProduct();
        ProductToko pct2    = new ProductToko(102, 2000, "Pulpen");
        pct2.addProduct();

        StockToko stc1      = new StockToko(pct1, 50, 1);
        stc1.addStock();
        StockToko stc2      = new StockToko(pct2, 100, 2);
        stc2.addStock();

        cst1.tambahOrder(1001, pct1, 10000, LocalDateTime.of(2026, 9, 20, 10, 30));
        cst1.tambahOrder(1002, pct2, 2000, LocalDateTime.of(2026, 9, 20, 10, 30));

        System.out.println();
        System.out.println(cst1.getInfo());

        CustomerToko cst2   = new CustomerToko(2, "Si B", "Malang", 002);
        cst2.addCustomer();
        System.out.println(cst2.getInfo());
    }    
}
