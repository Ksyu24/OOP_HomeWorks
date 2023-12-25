package HomeWork2;

public class Unit implements HasExperience{
    private int currentLevel;
    private int currentExpeirence;
    private int currentExpeirenceForNewLevel;
    public Unit(int currentExpeirence, int currentLevel, int currentExpeirenceForNewLevel){
        while (currentExpeirence>=currentExpeirenceForNewLevel)
        {
            currentExpeirence=currentExpeirence-currentExpeirenceForNewLevel;
            currentLevel++;
        }
        this.currentExpeirence=currentExpeirence;
        this.currentLevel=currentLevel;
        this.currentExpeirenceForNewLevel=currentExpeirenceForNewLevel;
    }
    public Unit(int currentLevel,int currentExpeirenceForNewLevel){
        this(0,currentLevel, currentExpeirenceForNewLevel);
    }
    public Unit(int currentExpeirenceForNewLevel){
        this(0, currentExpeirenceForNewLevel);
    }
    public Unit(){
        this(10);
    }

    @Override
    public int getCurrentLevel() {
        return currentLevel;
    }

    @Override
    public int getCurrentExpeirence() {
        return currentExpeirence;
    }

    @Override
    public int getLevelExpeirence() {
        return currentExpeirenceForNewLevel;
    }

    @Override
    public void setCurrentLevel(int level) {
        this.currentLevel=level;
    }

    @Override
    public void setCurrentExpeirence(int exp) {
        this.currentExpeirence=exp;
    }
    @Override
    public void printInfAboutLevelAndExpeirence(){
        System.out.println("Текущий уровень: "+currentLevel+"\nТекущее количество очков опыта: "+currentExpeirence);
    }

}
