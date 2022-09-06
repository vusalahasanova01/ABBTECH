package taskTwelve.model.abstracts;

import taskTwelve.model.enums.DayOfWeek;
import taskTwelve.model.enums.EnumForFamily;
import taskTwelve.model.nonAbstarcts.Family;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Objects;
import java.util.Random;

public abstract class Human {
    // fields for human
    private String name;
    private String surname;
    private long birthDate;
    private int iq;
    private Map<DayOfWeek,String> schedule;
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


    public long getBirthDate() {
        return birthDate;
    }
    public Date getBirthDateWithDate(){
        return new Date(birthDate);
    }

    public int getBirthDateWithYear(){
        return 1900 + getBirthDateWithDate().getYear();
    }

    public void setBirthDate(String birthDate)  {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.birthDate = dateFormat.parse(birthDate).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }


    public Map<DayOfWeek, String> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<DayOfWeek,String>schedule) {
        this.schedule = schedule;
    }

    // constructors
    public Human() {
    }

    public Human(String name, String surname, String birthDate, int iq, Family family, Map<DayOfWeek,String> schedule) {
        this.name = name;
        this.surname = surname;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.birthDate = simpleDateFormat.parse(birthDate).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.family = family;
        this.iq = iq;
        this.schedule = schedule;
    }
    public Human(String name, String surname, String birthDate)  {
        this.name = name;
        this.surname = surname;
       SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.birthDate = simpleDateFormat.parse(birthDate).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public Human(String name, String surname,int iq, String birthDate)  {
        this.name = name;
        this.surname = surname;
        this.iq = iq;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.birthDate = simpleDateFormat.parse(birthDate).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public Human(String name, String surname, String birthDate, int iq, Map<DayOfWeek,String> schedule) {
        this.name = name;
        this.surname = surname;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.birthDate = simpleDateFormat.parse(birthDate).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.iq = iq;
        this.schedule = schedule;
    }

    static {
        System.out.println("a new class is being loaded " + Human.class.getName());
    }

    {
        System.out.println("a new object is created" + this.getClass());
    }

    public abstract void greetPet();

    public void describePet() {
        for (Pet pet : family.getPet()) {
            if (pet.getTrickLevel() > 50) {
                System.out.printf("I have a %s, he is %d years old, he is  very sly \n", pet.getSpecies(),
                        pet.getAge());
            } else {
                System.out.printf("I have a %s, he is %d years old, he is almost not sly\n ", pet.getSpecies(),
                        pet.getAge());

            }
        }

    }
    public String describeAge(){
       return String.format("Year: %d,Month: %d, Day: %d",getBirthDateWithYear(),
               getBirthDateWithDate().getMonth(),getBirthDateWithDate().getDay());
    }

    public boolean feedPet(boolean timeForFeed) {
        if(family.getPet().size()== 0) return false;
        Random rnd = new Random();
        int randomTrickLevel = rnd.nextInt();
        for (Pet pet : family.getPet()) {
            if (!timeForFeed) {
                if (randomTrickLevel < pet.getTrickLevel()) {
                    System.out.printf("Hm... I will feed Jack's %s \n", pet.getNickname());

                } else {
                    System.out.println("I think Jack is not hungry.");

                }
            } else {
                System.out.printf("Hm... I will feed Jack's %s \n", pet.getNickname());
            }
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (this == o) return true;
        if (role == EnumForFamily.MOTHER || role == EnumForFamily.FATHER || role == EnumForFamily.NONE) {
            Human human = (Human) o;
            return birthDate == birthDate
                    && name.equals(human.name)
                    && surname.equals(human.surname);
        } else {
            Human human = (Human) o;
            return birthDate == human.birthDate
                    && name.equals(human.name)
                    && surname.equals(human.surname)
                    && family.getFather().getName().equals(human.family.getFather().getName());
        }
    }

    @Override
    public int hashCode() {
        if (role == EnumForFamily.MOTHER || role == EnumForFamily.FATHER || role == EnumForFamily.NONE) {
            return Objects.hash(name, surname, birthDate);
        } else {
            return Objects.hash(name, surname, birthDate, family.getFather().name);
        }

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method is called.");
        super.finalize();
    }

    @Override
    public String toString() {
        //"Human{name='Vusala', surname='Qafarova', year=2001," +
        //                        " iq=100schedule[[MONDAY, Reading book], [SUNDAY, Watching film]]}";


        String result = "Human{";
        if (name == null) result += "}";
        else result += "name='" + name + '\'';
        if (surname != null) result += ", surname='" + surname + '\'';
        if (birthDate!= 0)
        {  SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            result += ", birthdate=" + simpleDateFormat.format(new Date(birthDate));
        }
        if (iq != 0) result += ", iq=" + iq;
        if (schedule != null) result += "schedule" + schedule + '}';
        return result;
    }
}
