package quiz1;

public class ServiceBengkel 
{
    private String serviceName;
    private float servicePrice;
 
    public ServiceBengkel(String serviceName, float servicePrice) 
    {
        this.serviceName = serviceName;
        this.servicePrice = servicePrice;
    }
 
    public String getServiceName() { return serviceName; }
    public void setServiceName(String serviceName) { this.serviceName = serviceName; }
    public float getServicePrice() { return servicePrice; }
    public void setServicePrice(float servicePrice) { this.servicePrice = servicePrice; }    
}
