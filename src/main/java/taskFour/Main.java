package taskFour;

public class Main {
    public static void main(String[] args) {
        mainOne();
        System.out.println("-------------------------------------------------------------------------");
        mainTwo();


    }

    public static void mainOne() {
        Pet cat1 = new Pet(); //using empty constructor
        cat1.nickname = "mila";
        cat1.species = "cat";
        cat1.age = 3;
        cat1.trickLevel = 40;
        cat1.habits = new String[]{"play", "eating"};


        //using second consturctor
        Pet cat = new Pet("duman", "cat");

        // using third constructor
        Pet dog = new Pet("zevs", "dog", 5, 50, new String[]{"eating", "playing"});
        Human mother = new Human("Aypara", "Qafarova", 1977);
        Human father = new Human("Elvin", "Qafarov", 1971);
        Human zohre1 = new Human("Zohra", "Qafarova", 2001, 90,
                new String[][]{{"Monday", "Reading book"}, {"Sunday", "Watching film"}}, dog, mother, father);
        Human zohre = new Human("Zohra", "Qafarova", 2001, mother, father);
        System.out.println(zohre);
        System.out.println(zohre1);
        zohre1.describePet();
        zohre1.greetPet();
    }

    public static void mainTwo() {
        Human mother = new Human("Sevinc", "Ahmedova", 1977);
        Human father = new Human("Novruz", "Ahmedov", 1972);
        Pet zevs = new Pet("zevs", "dog", 2, 30, new String[]{"playing with people"});
        Pet mila = new Pet("mila", "cat", 3, 50, new String[]{"eating", "playing"});
        Human nicat = new Human("Nicat", "Ahmedov", 2001, 50,
                new String[][]{{"Monday", "go to school"}, {"Sunday", "Reading book"}}, zevs, mother, father);
        Human revan = new Human("Revan", "Ahmedov", 2011, 35,
                new String[][]{{"Monday", "playing game"}, {"Sunday", "Reading book"}}, mila, mother, father);
        zevs.eat();
        zevs.foul();
        zevs.respond();
        mila.foul();
        mila.eat();
        mila.respond();
        nicat.greetPet();
        nicat.describePet();
        System.out.println(zevs);
        System.out.println(nicat);
        nicat.feedPet(true);
        revan.feedPet(false);
    }
}