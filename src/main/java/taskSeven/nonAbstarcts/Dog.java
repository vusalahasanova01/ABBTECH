package taskSeven.nonAbstarcts;

import taskSeven.abstracts.Foul;
import taskSeven.abstracts.Pet;
import taskSeven.enums.Species;

public class Dog extends Pet implements Foul {
    public Dog(String nickname) {
       super(nickname);
       this.setSpecies(Species.DOG);
    }
    public Dog(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname,age,trickLevel,habits);
        this.setSpecies(Species.DOG);
    }
    @Override
    public void foul(){
        System.out.println("I need to cover it up");
    }

    @Override
    public void respond() {
        System.out.printf("Hello, owner. I am, %s. I miss you!\n", this.getNickname());
    }
}
