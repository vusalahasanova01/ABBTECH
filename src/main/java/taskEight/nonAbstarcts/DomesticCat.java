package taskEight.nonAbstarcts;

import taskEight.abstracts.Foul;
import taskEight.abstracts.Pet;
import taskEight.enums.Species;

import java.util.Set;

public class DomesticCat extends Pet implements Foul {
    public DomesticCat(String nickname) {
        super(nickname);
        this.setSpecies(Species.DOMESTICCAT);
    }
    public DomesticCat(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname,age,trickLevel,habits);
        this.setSpecies(Species.DOMESTICCAT);
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
