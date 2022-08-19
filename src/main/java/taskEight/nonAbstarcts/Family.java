package taskEight.nonAbstarcts;

import taskEight.abstracts.Human;
import taskEight.abstracts.HumanCreator;
import taskEight.abstracts.Pet;
import taskEight.enums.EnumForFamily;


import java.time.LocalDateTime;
import java.util.*;


public class Family implements HumanCreator {
    // fields for family
    private Human mother;
    private Human father;
    private List<Human> children = new ArrayList<>();
    private Set<Pet> pet;
    private final List<String> nameOfWoman;
    private final List<String> nameOfMan;

    // constructors
    public Family() {
    }

    public Family(Human mother, Human father) {
        this.father = father;
        this.father.setRole(EnumForFamily.FATHER);
        this.mother = mother;
        this.mother.setRole(EnumForFamily.MOTHER);
        this.mother.setFamily(this);
        this.father.setFamily(this);
    }

    public Family(Human mother, Human father, Set<Pet> pet, List<Human> children) {
        this.mother = mother;
        this.mother.setRole(EnumForFamily.MOTHER);
        this.father = father;
        this.father.setRole(EnumForFamily.FATHER);
        this.pet = pet;
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
                    LocalDateTime.now().getYear());

        } else {
            int selectName = rnd.nextInt(nameOfMan.size());
            createdChild = new Woman(nameOfMan.get(selectName),
                    father.getSurname(),
                    LocalDateTime.now().getYear());

        }
        createdChild.setIq((father.getIq() + mother.getIq()) / 2);
        createdChild.setRole(EnumForFamily.CHILD);
        createdChild.setFamily(this);
        addChild(createdChild);
        return createdChild;
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
