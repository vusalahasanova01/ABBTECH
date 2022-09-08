package taskThirteen.model.nonAbstarcts;

import taskThirteen.model.abstracts.Human;
import taskThirteen.model.abstracts.Pet;
import taskThirteen.model.enums.DayOfWeek;

import java.util.Map;

public class Man extends Human {
    public Man(){}
    public Man(String name, String surname, String birthDate, int iq, Family family, Map<DayOfWeek,String> schedule) {
       super(name,surname,birthDate,iq,family,schedule);
    }
    public Man(String name, String surname, String birthDate){
        super(name,surname,birthDate);
    }
    public Man(String name, String surname,int iq, String birthDate){
        super(name,surname,iq,birthDate);
    }
    public Man(String name, String surname, String birthDate, int iq, Map<DayOfWeek,String> schedule) {
        super(name,surname,birthDate,iq,schedule);
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
