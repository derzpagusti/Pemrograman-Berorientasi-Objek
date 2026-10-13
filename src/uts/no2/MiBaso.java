package uts.no2;

public class MiBaso 
{
    private String id;
    private String menu;

    public void setId(String id) {this.id = id;}
    public String getId() {return id;}

    public void setMenu(String menu) {this.menu = menu;}
    public String getMenu() {return menu;}

    public MiBaso(String id, boolean menu) {
        this.id = id;
        
        if (menu == true) {
            this.menu = "Anda memesan Bakso";
        } else {
            this.menu = "Anda memesan Mi Ayam";
        }
    }
    
    public String getInfoMiBaso()
    {
        String info = "";
        info += "Pesanan nomor " + id + " adalah " + menu + "\n";
        return info;
    }
}
