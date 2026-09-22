package quiz1;

public class StockToko 
{
    private ProductToko product;
    private int quantity,
                shopNo;

    public StockToko(ProductToko product, int quantity, int shopNo) 
    {
        this.product = product;
        this.quantity = quantity;
        this.shopNo = shopNo;
    }

    public ProductToko getProduct() { return product; }
    public void setProduct(ProductToko product) { this.product = product; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public int getShopNo() { return shopNo; }
    public void setShopNo(int shopNo) { this.shopNo = shopNo; }
    
    public void addStock()
        { System.out.println("Product ID " + product.getProductID() + " ditambah sebanyak " + quantity); }

    public void modifyStock(int productId)
        { System.out.println("Stok produk ID " + productId + " telah diperbarui"); }
    
    public void selectStockItem(int productId) 
        { System.out.println("Stok product ID yang dipilih: " + productId); }
}
