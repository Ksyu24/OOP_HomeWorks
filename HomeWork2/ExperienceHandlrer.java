package HomeWork2;

public class ExperienceHandlrer {
    public static void handler(HasExperience hasExperience, IncreasedExperience increasedExperience) {
        hasExperience.setCurrentExpeirence(hasExperience.getCurrentExpeirence()+increasedExperience.getExperience());
        while(hasExperience.getCurrentExpeirence()>=hasExperience.getLevelExpeirence())
        {
            hasExperience.setCurrentExpeirence(hasExperience.getCurrentExpeirence()-hasExperience.getLevelExpeirence());
            hasExperience.setCurrentLevel(hasExperience.getCurrentLevel()+1);
            System.out.println("Уровень повышен!");
        }
    }

}
