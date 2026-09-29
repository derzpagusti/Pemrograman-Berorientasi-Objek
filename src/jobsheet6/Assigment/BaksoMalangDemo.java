package jobsheet6.Assigment;

public class BaksoMalangDemo 
{
    public static void main(String[] args) 
    {
        BaksoJumbo j1   = new BaksoJumbo(2, 1, 1, 1);
        System.out.println(j1.getInfo());

        BaksoTetelan t1 = new BaksoTetelan(4, 1, 1, 2);
        System.out.println(t1.getInfo());

        BaksoMalang b1 = new BaksoMalang(5, 2, 2);
        System.out.println(b1.getInfo());
    }    
}
