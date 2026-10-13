package uts.no3;

public class User extends UserProfile {

    public User(int userId, int password, String name, int age, String emailId) {
        super(userId, password, name, age, emailId);
    }

    public void logIn(int userId, int password) {
        if (userId == this.getUserId() && password == this.getPassword()) {
            System.out.println("Login berhasil. Selamat datang, " + this.getName());
        } else {
            System.out.println("Login gagal: User ID atau password salah");
        }
    }

    public void recoverPassword() {
        System.out.println("Link pemulihan password dikirim ke " + this.getEmail());
    }

    public void logOut() {
        System.out.println(this.getName() + " berhasil logout");
    }
}
