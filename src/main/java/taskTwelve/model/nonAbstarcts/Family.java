package taskTwelve.model.nonAbstarcts;

import taskTwelve.model.abstracts.Human;
import taskTwelve.model.abstracts.HumanCreator;
import taskTwelve.model.abstracts.Pet;
import taskTwelve.model.enums.EnumForFamily;

import java.time.LocalDate;
import java.util.*;


public class Family implements HumanCreator {
    // fields for family
    private Woman mother;
    private Man father;
    private List<Human> children = new ArrayList<>();
    private Set<Pet> pet = new HashSet<>();
    private final List<String> nameOfWoman;
    private final List<String> nameOfMan;

    // constructors
    public Family() {
    }

    public Family(Woman mother, Man father) {
        this.father = father;
        this.father.setRole(EnumForFamily.FATHER);
        this.mother = mother;
        this.mother.setRole(EnumForFamily.MOTHER);
        this.mother.setFamily(this);
        this.father.setFamily(this);
    }

    public Family(Woman mother, Man father, Set<Pet> pet, List<Human> children) {
        this.mother = mother;
        this.mother.setRole(EnumForFamily.MOTHER);
        this.father = father;
        this.father.setRole(EnumForFamily.FATHER);
        this.pet.addAll(pet);
        this.children = children;
        this.mother.setFamily(this);
        this.father.setFamily(this);
        for (int i = 0; i < children.size(); i++) {
            this.children.get(i).setFamily(this);
            this.children.get(i).setRole(EnumForFamily.CHILD);
        }

    }

    // static block
    static {
        System.out.println("a new class is being loaded " + Family.class.getName());

    }

    //instance block
    {
        System.out.println("a new object is created" + this.getClass());
        this.nameOfWoman = Arrays.asList("Sevinc", "Sebine", "Leyla", "Afaq", "Zehra", "Ayten", "Cicek");
        this.nameOfMan = Arrays.asList("Nicat", "Eziz", "Ceyhun", "Revan", "Novruz", "Elnur", "Kamal");
    }


    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public List<Human> getChildren() {
        return children;
    }

    public Set<Pet> getPet() {
        return pet;
    }

    public void setPet(Set<Pet> pet) {
        this.pet = pet;
    }

    public boolean addChild(Human child) {
        int length = children.size() + 1;
        child.setFamily(this);
        child.setRole(EnumForFamily.CHILD);
        children.add(child);
        return length == children.size() - 1;
    }
    public boolean addPet(Pet addedPet){
        int length = pet.size();
        pet.add(addedPet);
        return length == pet.size() -1;

    }

    public boolean deleteChild(int index) {
        if(index < 0 || index >= children.size()){
            return false;
        }
        else {
            int length = children.size();
            children.get(index).setFamily(null);
            children.get(index).setRole(EnumForFamily.NONE);
            children.remove(index);
            return length == children.size() + 1;
        }
    }

    public boolean deleteChild(Human o) {
        int length = children.size();
        int index = children.indexOf(o);
        if(index == -1 ){
            return false;
        }
        else {
            children.get(index).setFamily(null);
            children.get(index).setRole(EnumForFamily.NONE);
            children.remove(o);
            return length == children.size() - 1;
        }
    }

    // i write count family this method.Because there are father, mother and numbers of children in the family.
    public int countFamily() {
        return children.size() + 2;
    }

    @Override
    public Human bornChild() {
        Random rnd = new Random();
        Human createdChild;
        boolean gender = rnd.nextBoolean();
        //if gender is true, gender = woman, else gender = man
        if (gender) {
            int selectName = rnd.nextInt(nameOfWoman.size());
            createdChild = new Woman(nameOfWoman.get(selectName),
                    father.getSurname(),
                    String.format("%d,%d,%d", LocalDate.now().getDayOfMonth(),
                            LocalDate.now().getMonthValue(),LocalDate.now().getYear()));


        } else {
            int selectName = rnd.nextInt(nameOfMan.size());
            createdChild = new Woman(nameOfMan.get(selectName),
                    father.getSurname(),
                    String.format("%d,%d,%d", LocalDate.now().getDayOfMonth(),
                            LocalDate.now().getMonthValue(),LocalDate.now().getYear()));


        }
        createdChild.setIq((father.getIq() + mother.getIq()) / 2);
        createdChild.setRole(EnumForFamily.CHILD);
        createdChild.setFamily(this);
        addChild(createdChild);
        return createdChild;
    }
    @Override
    public Human bornChild(String womanName, String manName) {
        Random rnd = new Random();
        Human createdChild;
        boolean gender = rnd.nextBoolean();
        //if gender is true, gender = woman, else gender = man
        if (gender) {
            String  selectName = womanName ;
            createdChild = new Woman(womanName,
                    father.getSurname(),
                    String.format("%d,%d,%d", LocalDate.now().getDayOfMonth(),
                            LocalDate.now().getMonthValue(),LocalDate.now().getYear()));


        } else {
          String selectName = manName;
            createdChild = new Woman(selectName,
                    father.getSurname(),
                    String.format("%d,%d,%d", LocalDate.now().getDayOfMonth(),
                            LocalDate.now().getMonthValue(),LocalDate.now().getYear()));


        }
        createdChild.setIq((father.getIq() + mother.getIq()) / 2);
        createdChild.setRole(EnumForFamily.CHILD);
        createdChild.setFamily(this);
        addChild(createdChild);
        return createdChild;
    }
    public String prettyFormat(){
        return null;

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (this == o) return true;
        Family family = (Family) o;
        return mother.equals(family.mother)
                && father.equals(family.father)
                && children.equals(family.children)
                && pet.equals(family.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father, pet, children);

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method is called.");
        super.finalize();
    }

    @Override
    public String toString() {
        String result = "Family{" + "mother=" + mother + ", father=" + father;
        if (children != null) result += ", children=" + children;
        if (pet != null) result += ", pet=" + pet + '}';
        return result;
    }


}
