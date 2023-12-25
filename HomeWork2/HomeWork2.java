package HomeWork2;

import HomeWork3.*;

import java.util.TreeSet;

public class HomeWork2 {
    public static void main(String[] args) {
        Unit myPerson=new Unit(20);
        myPerson.printInfAboutLevelAndExpeirence();

        BonusesAddingExperience bonus1=new BonusesAddingExperience(50);
        BonusesAddingExperience bonus2=new BonusesAddingExperience(10);
        BonusesAddingExperience bonus3=new BonusesAddingExperience();

        ExperienceHandlrer.handler(myPerson,bonus1);
        myPerson.printInfAboutLevelAndExpeirence();

        ExperienceHandlrer.handler(myPerson,bonus2);
        myPerson.printInfAboutLevelAndExpeirence();

        ExperienceHandlrer.handler(myPerson,bonus3);
        myPerson.printInfAboutLevelAndExpeirence();

    }
}
