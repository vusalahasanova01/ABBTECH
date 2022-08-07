package TaskSix;

import java.util.Arrays;
import java.util.Objects;


public class Family {
    // fields for family
    private Human mother;
    private Human father;
    private Human[] children = new Human[0];
    private Pet pet;

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

    public Family(Human mother, Human father, Pet pet, Human... children) {
        this.mother = mother;
        this.mother.setRole(EnumForFamily.MOTHER);
        this.father = father;
        this.father.setRole(EnumForFamily.FATHER);
        this.pet = pet;
        this.children = children;
        this.mother.setFamily(this);
        this.father.setFamily(this);
        for (int i = 0; i < children.length; i++) {
            this.children[i].setFamily(this);
            this.children[i].setRole(EnumForFamily.CHILD);
        }

    }

    // static block
    static {
        System.out.println("a new class is being loaded " + Family.class.getName());
    }

    //instance block
    {
        System.out.println("a new object is created" + this.getClass());
    }


    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public Human[] getChildren() {
        return children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public boolean addChild(Human child) {
        int lengthChildren = children.length;
        Human[] backUpChildren;
        backUpChildren = children;
        children = new Human[1 + backUpChildren.length];
        for (int i = 0; i < backUpChildren.length; i++) {
            children[i] = backUpChildren[i];
        }
        child.setFamily(this);
        child.setRole(EnumForFamily.CHILD);
        children[backUpChildren.length] = child;

        return lengthChildren == children.length - 1;

    }

    public boolean deleteChild(int index) {
        int lengthChildren = children.length;
        if (index >= 0 && index < children.length) {
            children[index].setFamily(null);
            children[index].setRole(EnumForFamily.NONE);
            Human[] deleteChildren = new Human[children.length - 1];
            for (int i = 0; i < children.length - 1; i++) {
                if (i >= index) {
                    deleteChildren[i] = children[i + 1];
                } else {
                    deleteChildren[i] = children[i];
                }
            }
            children = deleteChildren;

        }
        return lengthChildren == children.length + 1;
    }

    public boolean deleteChild(Human o) {
        int lengthChildren = children.length;
        if (o != null) {
            Human[] deleteChildren = new Human[children.length - 1];
            for (int i = 0; i < children.length; i++) {
                if (children[i].equals(o)) {
                    children[i].setFamily(null);
                    children[i].setRole(EnumForFamily.NONE);
                    System.arraycopy(children, 0, deleteChildren, 0, i);
                    System.arraycopy(children, i + 1, deleteChildren, i, deleteChildren.length - i);
                }
            }
            children = deleteChildren;
        }
        return lengthChildren == children.length + 1;
    }

    // i write count family this method.Because there are father, mother and numbers of children in the family.
    public int countFamily() {
        return children.length + 2;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (this == o) return true;
        Family family = (Family) o;
        return mother.equals(family.mother)
                && father.equals(family.father)
                && Arrays.equals(children, family.children)
                && pet.equals(family.pet);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method is called.");
        super.finalize();
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }
}
