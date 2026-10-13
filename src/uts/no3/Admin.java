package uts.no3;

public class Admin extends User {

    public Admin(int userId, int password, String name, int age, String emailId) {
        super(userId, password, name, age, emailId);
    }

    public void updateVehicleDetails(String vehicleId) {
        System.out.println("Detail kendaraan " + vehicleId + " diperbarui");
    }

    public void addVehicle(String vehicleId) {
        System.out.println("Kendaraan " + vehicleId + " ditambahkan");
    }

    public void removeComplaint() {
        System.out.println("Keluhan dihapus");
    }

    public void retrieveComplaint() {
        System.out.println("Mengambil data keluhan");
    }

    public void verifyUser(Customer customer) {
        if (customer.getDoc() == null) {
            System.out.println("Verifikasi gagal: " + customer.getName() + " belum mengunggah dokumen");
        } else {
            customer.setVerificationStatus(true);
            System.out.println("User " + customer.getName() + " berhasil diverifikasi");
        }
    }
}
