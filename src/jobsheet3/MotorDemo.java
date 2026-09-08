package jobsheet3;

public class MotorDemo 
{
    public static void main(String[] args) 
    {
        Motor mtr1 = new Motor();
        mtr1.displayStatus();
        
        mtr1.setPlatMotor("B 0838 XZ");
        mtr1.setKecepatan(50);
        mtr1.displayStatus();

        Motor mtr2 = new Motor();
        mtr2.setPlatMotor("N 9840 AB");
        mtr2.setIsMesinOn(true);
        mtr2.setKecepatan(40);
        mtr2.displayStatus();

        Motor mtr3 = new Motor();
        mtr3.setPlatMotor("D 8343 CV");
        mtr3.setKecepatan(60);
        mtr3.displayStatus();
    }
}

// mtr1.platMotor = "B 0838 XZ";

// int kecepatanBaru = 50;

// if (!mtr1.isMesinOn && kecepatanBaru > 0)
//     System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
// else
//     mtr1.kecepatan = kecepatanBaru;

// // mtr1.kecepatan = 50;

// mtr2.platMotor = "N 9840 AB";
// mtr2.isMesinOn = true;
// kecepatanBaru = 40;

// if (!mtr2.isMesinOn && kecepatanBaru > 0)
//     System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
// else
//     mtr2.kecepatan = kecepatanBaru;

// // mtr2.kecepatan = 40;

// mtr3.platMotor = "D 8343 CV";
// kecepatanBaru = 60;

// if (!mtr3.isMesinOn && kecepatanBaru > 0)
//     System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
// else
//     mtr3.kecepatan = kecepatanBaru;

// // mtr3.kecepatan = 60;