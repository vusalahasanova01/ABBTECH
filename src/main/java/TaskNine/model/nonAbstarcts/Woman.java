package TaskNine.model.nonAbstarcts;

import TaskNine.model.abstracts.Human;
import TaskNine.model.abstracts.Pet;
import TaskNine.model.enums.DayOfWeek;

import java.util.Map;

public class Woman extends Human {
    public Woman(){}

    public Woman(String name, String surname, int year, int iq, Family family, Map<DayOfWeek,String> schedule) {
        super(name,surname,year,iq,family,schedule);
    }

    public Woman(String name, String surname, int year) {
        super(name, surname, year);
    }
    public Woman(String name, String surname, int year, int iq, Map<DayOfWeek,String> schedule) {
        super(name,surname,year,iq,schedule);
    }
    @Override
    public void greetPet(){

        for(Pet pet: getFamily().getPet()) {
            System.out.printf("Hello,%s \n", pet.getNickname());
        }
    }
    public void makeUp(){
        System.out.println("I can do make up");
    }
}
