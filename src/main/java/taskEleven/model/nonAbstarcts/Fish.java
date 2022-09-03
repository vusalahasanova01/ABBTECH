package taskEleven.model.nonAbstarcts;

import taskEleven.model.abstracts.Foul;
import taskEleven.model.abstracts.Pet;
import taskEleven.model.enums.Species;

import java.util.Set;

public class Fish extends Pet implements Foul {
    public Fish(String nickname) {
        super(nickname);
        this.setSpecies(Species.FISH);
    }

    public Fish(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname,age,trickLevel,habits);
        this.setSpecies(Species.FISH);
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
