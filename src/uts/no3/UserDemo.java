package uts.no3;

public class UserDemo {
    public static void main(String[] args) {
        Customer customer1 = new Customer(101, 1234, "Budi Santoso", 21, "budi@mail.com");
        Admin admin1 = new Admin(1, 9999, "Sinta Dewi", 30, "sinta@mail.com");

        System.out.println("=== Customer ===");
        customer1.logIn(101, 1111);
        customer1.logIn(101, 1234);
        System.out.println("Status verifikasi: " + customer1.getVerificationStatus());
        customer1.showDocuments();

        System.out.println("=== Admin ===");
        admin1.logIn(1, 9999);
        admin1.verifyUser(customer1);

        System.out.println("=== Customer mengajukan verifikasi ===");
        customer1.applyVerification("ktp.jpg");
        customer1.showDocuments();

        System.out.println("=== Admin memverifikasi ===");
        admin1.verifyUser(customer1);
        System.out.println("Status verifikasi: " + customer1.getVerificationStatus());
        admin1.addVehicle("V001");
        admin1.updateVehicleDetails("V001");
        admin1.retrieveComplaint();
        admin1.removeComplaint();

        System.out.println("=== Logout ===");
        customer1.logOut();
        admin1.logOut();
    }
}
