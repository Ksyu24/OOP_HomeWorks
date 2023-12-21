package HomeWork1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DepositAccount extends Account{
    private LocalDate dateWithdrawal;
    private LocalDate now=LocalDate.now();
    public DepositAccount(Integer numAccount, String owner, double amount) {
        super(numAccount, owner, amount);
    }
    public DepositAccount(Integer numAccount, double amount) {
        super(numAccount, amount);
    }

    public LocalDate getDateWithdrawal() {
        return dateWithdrawal;
    }

    public LocalDate getNow() {
        return now;
    }

    public void setNow(LocalDate now) {
        this.now = now;
    }

    @Override
    public void putAmount(double sumPlus) {
        this.dateWithdrawal=LocalDate.now();
        super.putAmount(sumPlus);
    }

    @Override
    public void takeAmount(double sumMinus) {
        if((ChronoUnit.MONTHS.between(getDateWithdrawal(),getNow()))>=1) {
            super.takeAmount(sumMinus);
        }
        else {
            System.out.println("После последнего пополнения прошло менее месяца, снятие средств будет доступно через "+
                    +ChronoUnit.DAYS.between(getNow(),getDateWithdrawal().plusDays(30))+" дней");
        }
    }
}
