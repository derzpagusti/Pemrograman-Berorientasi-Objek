package quiz1;

public class MainBengkel 
{
    public static void main(String[] args) 
    {
        EmployeeBengkel epy1 = new EmployeeBengkel("001", "Pegawai1", "Teknisi Magang");
        EmployeeBengkel epy2 = new EmployeeBengkel("002", "Pegawai2", "Teknisi");
 
        ServiceBengkel gantiOli = new ServiceBengkel("Ganti Oli", 100000);
        ServiceBengkel servisRem = new ServiceBengkel("Servis Rem", 150000);
        ServiceBengkel setelMesin = new ServiceBengkel("Tune Up Mesin", 200000);
        ServiceBengkel gantiBan = new ServiceBengkel("Ganti Ban", 80000);
 
        CustomerBengkel cst1 = new CustomerBengkel("Si A", "08001");
        cst1.addVehicle(new VehicleBengkel("B 1234 ABC", "Toyota", "Avanza", "Car", gantiOli, epy1));
        cst1.addVehicle(new VehicleBengkel("B 5678 XYZ", "Honda", "Civic", "Car", servisRem, epy2));
 
        CustomerBengkel cst2 = new CustomerBengkel("Budi Santoso", "081298765432");
        cst2.addVehicle(new VehicleBengkel("B 4321 DEF", "Yamaha", "NMAX", "Motorcycle", setelMesin, epy1));
        cst2.addVehicle(new VehicleBengkel("B 8765 UVW", "Honda", "Beat", "Motorcycle", gantiBan, epy2));
 
        System.out.println("========== BENGKEL MAJU ==========\n");
        System.out.println(cst1.getInfo());
        System.out.println(cst2.getInfo());
    }        
}
