package HomeWork1;

public class Account {
    private String owner;
    private Integer numAccount;
    private double amount;
    public Account(Integer numAccount, String owner, double amount)
    {
        this.numAccount=numAccount;
        this.owner=owner;
        this.amount=amount;
    }

    public Account(Integer numAccount, double amount)
    {
        this(numAccount,"NoName",amount);
    }
    public Integer getNumAccount() {
        return numAccount;
    }
    public String getOwner() {
        return owner;
    }
    public double getAmount() {
        return amount;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void putAmount(double sumPlus)
    {
        this.amount=getAmount()+sumPlus;
    }
    public void takeAmount(double sumMinus)
    {
        if (getAmount()>sumMinus) {
            this.amount = getAmount() - sumMinus;
        }
        else {
            System.out.println("Недостаточно средств для снятия!");
        }
    }

    @Override
    public String toString() {
        return "Владелец счета: " + owner +
                ", Номер счета: " + numAccount +
                ", Баланс: " + amount ;
    }
}
