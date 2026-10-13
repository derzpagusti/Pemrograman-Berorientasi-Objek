package uts.no3;

public class Customer extends User {
    private boolean verificationStatus = false;

    public Customer(int userId, int password, String name, int age, String emailId) {
        super(userId, password, name, age, emailId);
    }

    public boolean getVerificationStatus() {
        return verificationStatus;
    }

    public void setVerificationStatus(boolean verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    public void applyVerification(String doc) {
        this.setDoc(doc);
        System.out.println("Dokumen " + doc + " diajukan untuk verifikasi");
    }
}
