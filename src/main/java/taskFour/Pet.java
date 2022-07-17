package taskFour;

import java.util.Arrays;

public class Pet {
    public String species;
    public String nickname;
    public int age;
    public int trickLevel;
    public String[] habits;

    public Pet() {
    }

    public Pet(String nickname, String species) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String nickname, String species,int age, int trickLevel, String[] habits) {
        this.nickname = nickname;
        this.species = species;
        this.age =age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.printf("Hello, owner. I am, %s. I miss you!\n", this.nickname);

    }
    public void foul() {
        System.out.println("I need to cover it up");
    }

    @Override
    public String toString() {
        return  species +"{" +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }
}
