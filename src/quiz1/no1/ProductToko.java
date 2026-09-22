package quiz1;

public class ProductToko 
{
    private int productID;
    private float productPrice;
    private String productType;

    public ProductToko(int productID, float productPrice, String productType) 
    {
        this.productID = productID;
        this.productPrice = productPrice;
        this.productType = productType;
    }

    public int getProductID() { return productID; }
    public void setProductID(int productID) { this.productID = productID; } 
    public float getProductPrice() { return productPrice; }
    public void setProductPrice(float productPrice) { this.productPrice = productPrice; }
    public String getProductType() { return productType; }
    public void setProductType(String productType) { this.productType = productType; }

    public String addProduct() 
    {
        String info = "";
        info += "Product telah ditambahkan\n";
        info += "ID     : " + productID + "\n";
        info += "Type   : " + productType + "\n";

        return info;
    }
    
    public void modifyProduct() 
        { System.out.println("Produk ID: " + productID + " telah diperbarui"); }

    public void selectProduct(int productID) 
        { System.out.println("Product ID yang dipilih: " + productID); }
}
