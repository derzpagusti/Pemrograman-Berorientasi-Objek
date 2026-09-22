package quiz1;

import java.time.LocalDateTime;

public class OrderToko 
{
    private int orderID,
                customerID;
    private String customerName;
    
    private ProductToko product;
    private float amount;
    private LocalDateTime orderDate;

    public OrderToko(int orderID, int customerID, String customerName, ProductToko product, float amount, LocalDateTime orderDate) 
    {
        this.orderID = orderID;
        this.customerID = customerID;
        this.customerName = customerName;
        this.product = product;
        this.amount = amount;
        this.orderDate = orderDate;
    }

    public int getOrderID() { return orderID; }
    public void setOrderID(int orderID) { this.orderID = orderID; }
    public int getCustomerID() { return customerID; }
    public void setCustomerID(int customerID) { this.customerID = customerID; }
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public ProductToko getProduct() { return product; }
    public void setProduct(ProductToko product) { this.product = product; }
    public float getAmount() { return amount; }
    public void setAmount(float amount) {this.amount = amount; }
    public LocalDateTime getOrderDate() { return orderDate; }
    public void setOrderDate(LocalDateTime orderDate) { this.orderDate = orderDate; }
    
    public String createOrder()
    {
        String info = "";
        info += "Order dibuat oleh " + customerName + "\n";
        info += "Produk : " + product.getProductType() + "\n";

        return info;
    }

    public void editOrder()
        { System.out.println("Order ID " + orderID + " telah diperbarui"); }
}
