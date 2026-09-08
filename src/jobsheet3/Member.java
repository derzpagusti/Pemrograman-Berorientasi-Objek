package jobsheet3;

public class Member 
{
    private String  nameCode,
                    name;
    private int limitLoan,
                loanAmount;

    public Member(String nameCode, String name, int limitLoan) {
        this.nameCode = nameCode;
        this.name = name;
        this.limitLoan = limitLoan;
    }

    public String getName() {
        return name;
    }

    public int getLimitLoan() {
        return limitLoan;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void borrow (int borrow)
    {
        if (borrow > limitLoan)
            System.out.println("Maaf, jumlah peminjaman melebihi limit.");
        else
            loanAmount += borrow;
    }

    public void installment (int installment)
    {
        if (installment > loanAmount)
            System.out.println("Maaf, jumlah cilcilan melebihi total peminjaman saat ini");
        else if (installment < 0.1 * loanAmount)
            System.out.println("Maaf, jumlah cilcilan harus minimal 10% dari total peminjaman");
        else
            loanAmount -= installment;
    }
}
