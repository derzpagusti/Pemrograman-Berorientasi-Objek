package jobsheet7.code;

public class BaksoMalangDemo 
{
    public static void main(String[] args) 
    {
        BaksoJumbo j1   = new BaksoJumbo();
        j1.setItem(2, 1);
        System.out.println(j1.getInfo());

        BaksoJumbo j2   = new BaksoJumbo();
        j2.setItem(2, 1, 1, 1);
        System.out.println(j2.getInfo());

        BaksoTetelan t1 = new BaksoTetelan();
        t1.setItem(5, 3);
        System.out.println(t1.getInfo());

        BaksoJumbo t2   = new BaksoJumbo();
        t2.setItem(5, 2, 2, 2);
        System.out.println(t2.getInfo());

        BaksoMalang b1 = new BaksoMalang();
        b1.setItem(5);
        System.out.println(b1.getInfo());

        BaksoMalang b2 = new BaksoMalang();
        b2.setItem(5, 2, 2);
        System.out.println(b2.getInfo());
    }    
}
