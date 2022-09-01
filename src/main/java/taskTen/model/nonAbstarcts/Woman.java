package taskTen.model.nonAbstarcts;

import taskTen.model.abstracts.Human;
import taskTen.model.abstracts.Pet;
import taskTen.model.enums.DayOfWeek;

import java.util.Map;

public class Woman extends Human {
    public Woman(){}

    public Woman(String name, String surname, String birthDate, int iq, Family family, Map<DayOfWeek,String> schedule) {
        super(name,surname,birthDate,iq,family,schedule);
    }

    public Woman(String name, String surname, String birthDate) {
        super(name, surname, birthDate);
    }
    public Woman(String name, String surname,int iq, String birthDate) {
        super(name, surname,iq, birthDate);
    }
    public Woman(String name, String surname, String birthDate, int iq, Map<DayOfWeek,String> schedule) {
        super(name,surname,birthDate,iq,schedule);
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
