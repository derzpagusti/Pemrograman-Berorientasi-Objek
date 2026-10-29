package jobsheet9;

public class Main {
    public void main() {
        Kipas kipas = new Kipas("Kipas Angin Berdiri", 350000, "Putih", "Miyako");
        TV tv = new TV("LED", 20, 3500000, "Hitam", "Samsung");
        Kulkas kulkas = new Kulkas(2, 2800000, "Silver", "Sharp");
        SmartFridge smartFridge = new SmartFridge(10, 2, 7500000, "Abu-abu", "LG");

        System.out.println("===== KIPAS =====");
        System.out.println(kipas.getInfo());

        System.out.println("\n===== TV =====");
        System.out.println(tv.getInfo());
        tv.naikkanVolume(5);
        System.out.println("Setelah dinaikkan 5, volume TV: " + tv.getVolume());

        System.out.println("\n===== KULKAS =====");
        System.out.println(kulkas.getInfo());

        System.out.println("\n===== SMART FRIDGE =====");
        System.out.println(smartFridge.getInfo());
        smartFridge.turunkanVolume(3);
        System.out.println("Setelah diturunkan 3, volume SmartFridge: " + smartFridge.getVolume());
    }
}
