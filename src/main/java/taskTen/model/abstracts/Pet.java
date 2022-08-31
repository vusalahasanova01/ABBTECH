package taskTen.model.abstracts;

import taskTen.model.enums.Species;

import java.util.Objects;
import java.util.Set;

public abstract class Pet {
    // fields for pet
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private Set<String> habits;

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public Set<String> getHabits() {
        return habits;
    }

    public void setHabits(Set<String> habits) {
        this.habits = habits;
    }

    //constructors
    public Pet() {
    }

    public Pet(String nickname) {
        this.nickname = nickname;
    }

    public Pet(String nickname, int age, int trickLevel,Set<String> habits) {
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    static {
        System.out.println("a new class is being loaded " + Pet.class.getName());
    }

    {
        System.out.println("a new object is created" + this.getClass());
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public abstract void respond();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age
                && trickLevel == pet.trickLevel
                && Objects.equals(species, pet.species)
                && Objects.equals(nickname, pet.nickname)
                && Objects.equals(habits, pet.habits);
    }

    @Override
    public int hashCode() {

        return Objects.hash(species, nickname, age, trickLevel, habits);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method is called.");
        super.finalize();
    }

    @Override
    public String toString() {
        //"DOG{animal can't flyanimal doesn't have furnumber of legs 4, nickname='zevs'," +
        //                " age=5, trickLevel=50, habits=[eating, playing]}";
        String result = "{";
        if (species != null) result = species + result;
        else result += "}";
        if (species.isCanFly()) result += ", can fly";
        else result += "animal can't fly";
        if (species.isHasfur()) result += ", has fur";
        else result += "animal doesn't have fur";
        if (species.getNumberOfLegs() != 0) result += "number of legs " + species.getNumberOfLegs();
        if (nickname != null) result += ", nickname='" + nickname + '\'';
        if (age != 0) result += ", age=" + age ;
        if (trickLevel != 0) result += ", trickLevel=" + trickLevel;
        if (habits != null) result += ", habits=" +habits +
                '}';
        return result;

    }
}
