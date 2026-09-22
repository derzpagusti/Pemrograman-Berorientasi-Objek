package quiz1;

import java.util.ArrayList;

public class CustomerBengkel 
{
    private String  name,
                    phoneNumber;
    
    private ArrayList<VehicleBengkel> vehicles; 

    public CustomerBengkel(String name, String phoneNumber) 
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.vehicles = new ArrayList<VehicleBengkel>();
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    
    public ArrayList<VehicleBengkel> getVehicles() { return vehicles; }
    public void addVehicle(VehicleBengkel vehicle) { vehicles.add(vehicle); }
    
    public String getInfo() 
    {
        String info = "";
        info += "Customer Name  : " + name + "\n";
        info += "Phone Number   : " + phoneNumber + "\n";
 
        if (!vehicles.isEmpty()) 
        {
            info += "Vehicle List:\n";
            for (VehicleBengkel vehicle : vehicles) {
                info += "-----------------------------\n";
                info += vehicle.getInfo();
            }
        } else
            info += "No vehicle registered yet\n";
 
        return info;
    }
}
