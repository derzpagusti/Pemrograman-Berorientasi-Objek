package quiz1;

public class VehicleBengkel 
{
    private String  plateNumber,
                    brand,
                    model,
                    vehicleType;
                    
    private ServiceBengkel service;
    private EmployeeBengkel employee;

    public VehicleBengkel(String plateNumber, String brand, String model, String vehicleType, ServiceBengkel service, EmployeeBengkel employee) 
    {
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.model = model;
        this.vehicleType = vehicleType;
        this.service = service;
        this.employee = employee;
    }

    public String getPlateNumber() { return plateNumber; }
    public void setPlateNumber(String plateNumber) { this.plateNumber = plateNumber; }
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    public String getVehicleType() { return vehicleType; }
    public void setVehicleType(String vehicleType) { this.vehicleType = vehicleType; }
 
    public ServiceBengkel getService() { return service; }
    public void setService(ServiceBengkel service) { this.service = service; }
    public EmployeeBengkel getEmployee() { return employee; }
    public void setEmployee(EmployeeBengkel employee) { this.employee = employee; }

    public float calculateTotalCost() 
    {
        float serviceFee = 0;
 
        if (vehicleType.equalsIgnoreCase("Car"))
            serviceFee = 50000;
        else if (vehicleType.equalsIgnoreCase("Motorcycle"))
            serviceFee = 20000;
 
        return service.getServicePrice() + serviceFee;
    }
 
    public String getInfo() 
    {
        String info = "";
        info += "Plate Number   : " + plateNumber + "\n";
        info += "Brand / Model  : " + brand + " " + model + "\n";
        info += "Vehicle Type   : " + vehicleType + "\n";
        info += "Technician     : " + employee.getInfo() + "\n";
        info += "Selected Service: " + service.getServiceName()
                + " (Rp" + service.getServicePrice() + ")\n";
        info += "Total Cost     : Rp" + calculateTotalCost() + "\n";
 
        return info;
    }
}
