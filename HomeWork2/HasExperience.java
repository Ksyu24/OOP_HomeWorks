package HomeWork2;

public interface HasExperience {
    int getCurrentLevel();
    int getCurrentExpeirence();
    int getLevelExpeirence();
    default void setCurrentLevel(int level){}
    default void setCurrentExpeirence(int exp){}
    default void printInfAboutLevelAndExpeirence(){}
}
