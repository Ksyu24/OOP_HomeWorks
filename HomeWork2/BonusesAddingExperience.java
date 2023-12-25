package HomeWork2;

public class BonusesAddingExperience implements IncreasedExperience{

    private int experience;
    public BonusesAddingExperience(int exp){
        this.experience=exp;
    }
    public BonusesAddingExperience(){
        this(5);
    }
    @Override
    public int getExperience() {
        return experience;
    }
}
