package taskEight.nonAbstarcts;

import taskEight.abstracts.Human;

public class Man extends Human {
    public Man(){}
    public Man(String name, String surname, int year, int iq, Family family, String[][] schedule) {
       super(name,surname,year,iq,family,schedule);
    }
    public Man(String name, String surname, int year, int iq, String[][] schedule) {
        super(name,surname,year,iq,schedule);
    }

    @Override
    public void greetPet(){
        System.out.printf("Hello,%s \n", getFamily().getPet().getNickname());
    }
    public void repairCar(){
        System.out.println("i love all models of car");
    }
}
