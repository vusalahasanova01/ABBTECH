package taskTen.model.nonAbstarcts;

import taskTen.model.abstracts.Foul;
import taskTen.model.abstracts.Pet;
import taskTen.model.enums.Species;

import java.util.Set;

public class RoboCat extends Pet implements Foul {
    public RoboCat(String nickname) {
        super(nickname);
        this.setSpecies(Species.ROBOCAT);
    }
    public RoboCat(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname,age,trickLevel,habits);
        this.setSpecies(Species.ROBOCAT);
    }
    @Override
    public void foul() {
        System.out.println("I need to cover it up");
    }

    @Override
    public void respond() {
        System.out.printf("Hello, owner. I am, %s. I miss you!\n", this.getNickname());
    }
}
