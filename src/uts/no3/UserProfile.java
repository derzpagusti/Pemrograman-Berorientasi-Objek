package uts.no3;

public class UserProfile {
    private int userId;
    private int password;
    private String name;
    private int age;
    private String emailId;
    private String doc;

    public UserProfile(int userId, int password, String name, int age, String emailId) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.age = age;
        this.emailId = emailId;
    }

    public int getUserId() {
        return userId;
    }

    public int getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return emailId;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public void editProfile(String name, int age, String emailId) {
        this.name = name;
        this.age = age;
        this.emailId = emailId;
        System.out.println("Profil " + this.name + " berhasil diubah");
    }

    public void showDocuments() {
        if (doc == null) {
            System.out.println("Belum ada dokumen");
        } else {
            System.out.println("Dokumen: " + doc);
        }
    }
}
