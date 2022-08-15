package taskEight.nonAbstarcts;

import taskEight.abstracts.Human;

public class Woman extends Human {
    public Woman(){}

    public Woman(String name, String surname, int year, int iq, Family family, String[][] schedule) {
        super(name,surname,year,iq,family,schedule);
    }

    public Woman(String name, String surname, int year) {
        super(name, surname, year);
    }
    public Woman(String name, String surname, int year, int iq, String[][] schedule) {
        super(name,surname,year,iq,schedule);
    }
    @Override
    public void greetPet(){
        System.out.printf("Hello,%s \n", getFamily().getPet().getNickname());
    }
    public void makeUp(){
        System.out.println("I can do make up");
    }
}
