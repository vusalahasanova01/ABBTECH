package TaskFive;

import java.util.Arrays;


public class Family {
    // fields for family
    Human mother;
    Human father;
    Human[] children = new Human[0];
    Pet pet;

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
    static{
        System.out.println("a new class is being loaded "+ Family.class.getName());
    }
    //istance block
    {
        System.out.println("a new object is created" + this.getClass());
    }
    public void setChildren(Human[] children) {
        this.children = children;
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

    public void addChild(Human child) {
        Human[] backUpChildren;
        backUpChildren = children;
        children = new Human[1 + backUpChildren.length];
        for (int i = 0; i < backUpChildren.length; i++) {
            children[i] = backUpChildren[i];
        }
        child.setFamily(this);
        child.setRole(EnumForFamily.CHILD);
        children[backUpChildren.length] = child;

    }

    public boolean deleteChild(int index) {
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

            return true;
        } else return false;

    }

    public boolean deleteChild(Human o) {
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
            return true;
        }
        return false;
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
        return  mother.equals(family.mother)
                && father.equals(family.father)
                && Arrays.equals(children, family.children)
                && pet.equals(family.pet);
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
