package taskFour;

import java.util.Random;

public class Human {
    public String name;
    public String surname;
    public int year;
    public int iq;
    public Pet pet;
    public Human mother;
    public Human father;
    public String[][] schedule;

    public Human() {
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, String[][] schedule, Pet pet, Human mother, Human father) {

        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
    }

    public void greetPet() {
        System.out.printf("Hello,%s \n", pet.nickname);
    }

    public void describePet() {
        if (pet.trickLevel > 50) {
            System.out.printf("I have a %s, he is %d years old, he is  very sly \n", pet.species, pet.age);
        } else {
            System.out.printf("I have a %s, he is %d years old, he is almost not sly\n ", pet.species, pet.age);

        }
    }

    public boolean feedPet(boolean timeForFeed) {
        Random rnd = new Random();
        int randomTrickLevel = rnd.nextInt();
        if (!timeForFeed) {
            if (randomTrickLevel < pet.trickLevel) {
                System.out.printf("Hm... I will feed Jack's %s \n",pet.nickname);
                return true;
            } else {
                System.out.println("I think Jack is not hungry.");
                return false;
            }
        } else {
            System.out.printf("Hm... I will feed Jack's %s \n",pet.nickname);
            return true;
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", pet=" + pet +
                ", mother=" + mother +
                ", father=" + father +
                '}';
    }
}
