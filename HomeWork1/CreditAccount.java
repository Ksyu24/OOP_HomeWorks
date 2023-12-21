package HomeWork1;

public class CreditAccount extends Account{

    public CreditAccount(Integer numAccount, String owner, double amount) {
        super(numAccount, owner, amount);
    }
    public CreditAccount(Integer numAccount, double amount) {
        super(numAccount, amount);
    }

    @Override
    public void takeAmount(double sumMinus) {
        super.takeAmount(sumMinus*1.01);
    }
}
