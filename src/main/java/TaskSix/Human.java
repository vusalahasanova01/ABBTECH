package TaskSix;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Human {
    // fields for human
    private String name;
    private String surname;
    private int year;
    private int iq;
    private String[][] schedule;
    private Family family;
    private EnumForFamily role = EnumForFamily.NONE;

    public EnumForFamily getRole() {
        return role;
    }

    public void setRole(EnumForFamily role) {
        this.role = role;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }


    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    // constructors
    public Human() {
    }

    public Human(String name, String surname, int year, int iq, Family family, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.family = family;
        this.iq = iq;
        this.schedule = schedule;
    }

    public Human(String name, String surname, int year, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    static {
        System.out.println("a new class is being loaded " + Human.class.getName());
    }

    {
        System.out.println("a new object is created" + this.getClass());
    }

    public void greetPet() {
        System.out.printf("Hello,%s \n", family.getPet().getNickname());
    }

    public void describePet() {
        if (family.getPet().getTrickLevel() > 50) {
            System.out.printf("I have a %s, he is %d years old, he is  very sly \n", family.getPet().getSpecies(),
                    family.getPet().getAge());
        } else {
            System.out.printf("I have a %s, he is %d years old, he is almost not sly\n ", family.getPet().getSpecies(),
                    family.getPet().getAge());

        }
    }

    public boolean feedPet(boolean timeForFeed) {
        Random rnd = new Random();
        int randomTrickLevel = rnd.nextInt();
        if (!timeForFeed) {
            if (randomTrickLevel < family.getPet().getTrickLevel()) {
                System.out.printf("Hm... I will feed Jack's %s \n", family.getPet().getNickname());
                return true;
            } else {
                System.out.println("I think Jack is not hungry.");
                return false;
            }
        } else {
            System.out.printf("Hm... I will feed Jack's %s \n", family.getPet().getNickname());
            return true;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (this == o) return true;
        if (role == EnumForFamily.MOTHER || role == EnumForFamily.FATHER || role == EnumForFamily.NONE) {
            Human human = (Human) o;
            return year == human.year
                    && name.equals(human.name)
                    && surname.equals(human.surname);
        } else {
            Human human = (Human) o;
            return year == human.year
                    && name.equals(human.name)
                    && surname.equals(human.surname)
                    && family.getFather().getName().equals(human.family.getFather().getName());
        }
    }

    @Override
    public int hashCode() {
        if (role == EnumForFamily.MOTHER || role == EnumForFamily.FATHER || role == EnumForFamily.NONE) {
            return Objects.hash(name, surname, year);
        } else {
            return Objects.hash(name, surname, year, family.getFather().name);
        }

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method is called.");
        super.finalize();
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                "schedule" + Arrays.deepToString(schedule) +
                '}';
    }
}
