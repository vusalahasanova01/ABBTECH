package taskEight.nonAbstarcts;

import taskEight.abstracts.Human;
import taskEight.abstracts.Pet;
import taskEight.enums.DayOfWeek;

import java.util.Map;

public class Man extends Human {
    public Man(){}
    public Man(String name, String surname, int year, int iq, Family family, Map<DayOfWeek,String> schedule) {
       super(name,surname,year,iq,family,schedule);
    }
    public Man(String name, String surname, int year, int iq, Map<DayOfWeek,String> schedule) {
        super(name,surname,year,iq,schedule);
    }

    @Override

    public void greetPet(){

        for(Pet pet: getFamily().getPet()) {
            System.out.printf("Hello,%s \n", pet.getNickname());
        }
    }
    public void repairCar(){
        System.out.println("i love all models of car");
    }
}
