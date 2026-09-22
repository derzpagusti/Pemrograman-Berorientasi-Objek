package quiz1;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class CustomerToko 
{
    private int customerID,
                phone;
    private String  customerName,
                    address;
    private ArrayList<OrderToko> riwayatOrder;

    public CustomerToko(int customerID, String customerName, String address, int phone) 
    {
        this.customerID     = customerID;
        this.phone          = phone;
        this.customerName   = customerName;
        this.address        = address;
        this.riwayatOrder   = new ArrayList<OrderToko>();
    }

    public int getCustomerID() { return customerID; }
    public void setCustomerID(int customerID) { this.customerID = customerID; }
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public int getPhone() { return phone; }
    public void setPhone(int phone) { this.phone = phone; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public void addCustomer() 
        { System.out.println("Customer baru ditambahkan: " + customerName); }
    
    public void editCustomer() 
        { System.out.println("Customer " + customerName + " telah diperbarui"); }
    
    public void deleteCustomer()
        { System.out.println("Customer " + customerName + " telah dihapus"); }

    public ArrayList<OrderToko> getRiwayatOrder() { return riwayatOrder; }

    public void tambahOrder(int orderID, ProductToko product, float amount, LocalDateTime orderDate) 
    {
        OrderToko order = new OrderToko(orderID, this.customerID, this.customerName, product, amount, orderDate);
        riwayatOrder.add(order);
    }

    public String getInfo() 
    {
        String info = "";
        info += "Customer ID : " + customerID + "\n";
        info += "Nama        : " + customerName + "\n";

        if (!riwayatOrder.isEmpty()) 
        {
            info += "Riwayat Order :\n";
            for (OrderToko order : riwayatOrder) 
            {
                info += "\tOrder ID: " + order.getOrderID()
                        + ", Produk: " + order.getProduct().getProductType()
                        + ", Amount: " + order.getAmount() + "\n";
            }
        } else
            info += "Belum ada riwayat order\n";

        return info;
    }
}
