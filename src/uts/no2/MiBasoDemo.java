package uts.no2;

public class MiBasoDemo 
{
    public static void main(String[] args) 
    {
        MiBaso mb1 = new MiBaso("100", true);
        System.out.println(mb1.getInfoMiBaso());
        MiBaso mb2 = new MiBaso("200", false);
        System.out.println(mb2.getInfoMiBaso());

        BaksoPolos bp1 = new BaksoPolos("101", true, 5);
        System.out.println(bp1.getInfoBakso());
        BaksoPolos bp2 = new BaksoPolos("102", true, 5, 2, 2);
        System.out.println(bp2.getInfoBakso());

        BaksoJumbo bj1 = new BaksoJumbo("111", true, 1);
        System.out.println(bj1.getInfoBakso());
        BaksoJumbo bj2 = new BaksoJumbo("112", true, 1, 2, 2);
        System.out.println(bj2.getInfoBakso());

        MiAyam m1 = new MiAyam("201", false);
        System.out.println(m1.getInfoMi());
    }
}
