package TaskFive;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestOne {

    @Test
    public void testAddChild(){
        Pet dog = new Pet("zevs", "dog", 5, 50, new String[]{"eating",
                "playing"});
        Human mother = new Human("Aypara", "Qafarova", 1977, 70, new String[][]{{"Monday",
                "Reading book"},
                {"Sunday", "Watching film"}});
        Human father = new Human("Elvin", "Qafarov", 1971, 70, new String[][]{{"Monday",
                "Reading book"},
                {"Sunday", "Watching film"}});
        Human zohre1 = new Human("Zohra", "Qafarova", 2001, 90,
                new String[][]{{"Monday", "Reading book"}, {"Sunday", "Watching film"}});
        Human vusala = new Human("Vusala", "Qafarova", 2001, 100,
                new String[][]{{"Monday", "Reading book"}, {"Sunday", "Watching film"}});
        Family family1 = new Family(mother, father, dog, zohre1);
        family1.addChild(vusala);

        Family family2 =  new Family(mother,father,dog,zohre1,vusala);
        assertTrue(family1.equals(family2));

    }
    @Test
    public void testDeleteChildWithObject(){
        Pet dog = new Pet("zevs", "dog", 5, 50, new String[]{"eating",
                "playing"});
        Human mother = new Human("Aypara", "Qafarova", 1977, 70, new String[][]{{"Monday",
                "Reading book"},
                {"Sunday", "Watching film"}});
        Human father = new Human("Elvin", "Qafarov", 1971, 70, new String[][]{{"Monday",
                "Reading book"},
                {"Sunday", "Watching film"}});
        Human zohre1 = new Human("Zohra", "Qafarova", 2001, 90,
                new String[][]{{"Monday", "Reading book"}, {"Sunday", "Watching film"}});
        Human vusala = new Human("Vusala", "Qafarova", 2001, 100,
                new String[][]{{"Monday", "Reading book"}, {"Sunday", "Watching film"}});
        Family family1 = new Family(mother, father, dog, zohre1, vusala);
        family1.deleteChild(vusala);
        Family family2 = new Family(mother,father,dog,zohre1);
        assertTrue(family1.equals(family2));
    }
    @Test
    public void testDeleteChildWithIndex(){
        Pet dog = new Pet("zevs", "dog", 5, 50, new String[]{"eating",
                "playing"});
        Human mother = new Human("Aypara", "Qafarova", 1977, 70, new String[][]{{"Monday",
                "Reading book"},
                {"Sunday", "Watching film"}});
        Human father = new Human("Elvin", "Qafarov", 1971, 70, new String[][]{{"Monday",
                "Reading book"},
                {"Sunday", "Watching film"}});
        Human zohre1 = new Human("Zohra", "Qafarova", 2001, 90,
                new String[][]{{"Monday", "Reading book"}, {"Sunday", "Watching film"}});
        Human vusala = new Human("Vusala", "Qafarova", 2001, 100,
                new String[][]{{"Monday", "Reading book"}, {"Sunday", "Watching film"}});
        Family family1 = new Family(mother, father, dog, zohre1, vusala);
        family1.deleteChild(1);
        Family family2 = new Family(mother,father,dog,zohre1);
        assertTrue(family1.equals(family2));
    }
   @Test
    public void TestCountFamily(){
       Pet dog = new Pet("zevs", "dog", 5, 50, new String[]{"eating",
               "playing"});
       Human mother = new Human("Aypara", "Qafarova", 1977, 70, new String[][]{{"Monday",
               "Reading book"},
               {"Sunday", "Watching film"}});
       Human father = new Human("Elvin", "Qafarov", 1971, 70, new String[][]{{"Monday",
               "Reading book"},
               {"Sunday", "Watching film"}});
       Human zohre1 = new Human("Zohra", "Qafarova", 2001, 90,
               new String[][]{{"Monday", "Reading book"}, {"Sunday", "Watching film"}});
       Human vusala = new Human("Vusala", "Qafarova", 2001, 100,
               new String[][]{{"Monday", "Reading book"}, {"Sunday", "Watching film"}});
       Family family1 = new Family(mother, father, dog, zohre1, vusala);
       assertEquals(4,family1.countFamily());
   }
   @Test
    public void TestEqualsFamily(){
       Pet dog = new Pet("zevs", "dog", 5, 50, new String[]{"eating",
               "playing"});
       Human mother = new Human("Aypara", "Qafarova", 1977, 70, new String[][]{{"Monday",
               "Reading book"},
               {"Sunday", "Watching film"}});
       Human father = new Human("Elvin", "Qafarov", 1971, 70, new String[][]{{"Monday",
               "Reading book"},
               {"Sunday", "Watching film"}});
       Human zohre1 = new Human("Zohra", "Qafarova", 2001, 90,
               new String[][]{{"Monday", "Reading book"}, {"Sunday", "Watching film"}});
       Family family1 = new Family(mother, father, dog, zohre1);
       Pet dog1 = new Pet("zevs", "dog", 5, 50, new String[]{"eating", "playing"});
       Human mother1 = new Human("Aypara", "Qafarova", 1977, 70, new String[][]{{"Monday",
               "Reading book"},
               {"Sunday", "Watching film"}});
       Human father1 = new Human("Elvin", "Qafarov", 1971, 70, new String[][]{{"Monday",
               "Reading book"},
               {"Sunday", "Watching film"}});
       Human zohre2 = new Human("Zohra", "Qafarova", 2001, 90,
               new String[][]{{"Monday", "Reading book"}, {"Sunday", "Watching film"}});
       Family family2 = new Family(mother1, father1, dog1, zohre2);
      assertEquals(family1,family2);
   }
   @Test
    public void testEqualsHuman(){
        Human vusala =  new Human("Vusala", "Qafarova", 2001, 100,
                new String[][]{{"Monday", "Reading book"}, {"Sunday", "Watching film"}});
        Human vusala2 = new Human("Vusala", "Qafarova", 2001, 100,
                new String[][]{{"Monday", "Reading book"}, {"Sunday", "Watching film"}});
        assertEquals(vusala,vusala2);
   }
   @Test
    public void testEqualPet(){
       Pet dog = new Pet("zevs", "dog", 5, 50, new String[]{"eating",
               "playing"});
       Pet dog1 = new Pet("zevs", "dog", 5, 50, new String[]{"eating",
               "playing"});
       assertEquals(dog,dog1);
   }
}
