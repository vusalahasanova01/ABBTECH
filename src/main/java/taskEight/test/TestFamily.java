package taskEight.test;

import org.junit.jupiter.api.Test;
import taskEight.enums.DayOfWeek;
import taskEight.nonAbstarcts.Dog;
import taskEight.nonAbstarcts.Family;
import taskEight.nonAbstarcts.Man;
import taskEight.nonAbstarcts.Woman;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestFamily {
    @Test
    public void TestEqualsFamily() {
        Dog dog = new Dog("zevs", 5, 50, new HashSet<>(Arrays.asList("eating",
                "playing")));

       Woman mother = new Woman("Aypara", "Qafarova", 1977, 70,
               Map.of(DayOfWeek.MONDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
        Man father = new Man("Elvin", "Qafarov", 1971, 70,
                Map.of(DayOfWeek.MONDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
        Woman zohre1 = new Woman("Zohra", "Qafarova", 2001, 90,
                Map.of(DayOfWeek.SUNDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
        Family family1 = new Family(mother, father,  new HashSet<>(List.of(dog)),new ArrayList<>( List.of(zohre1)));
        Dog dog1 = new Dog("zevs", 5, 50,new HashSet<>(Arrays.asList("eating",
                "playing")));
        Woman mother1 = new Woman("Aypara", "Qafarova", 1977, 70,
                Map.of(DayOfWeek.MONDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
        Man father1 = new Man("Elvin", "Qafarov", 1971, 70,
                Map.of(DayOfWeek.MONDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
        Woman zohre2 = new Woman("Zohra", "Qafarova", 2001, 90,
                Map.of(DayOfWeek.MONDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
        Family family2 = new Family(mother1, father1,  new HashSet<>(List.of(dog1)),new ArrayList<>( List.of(zohre2)));
        assertEquals(family1, family2);
    }

    @Test
    public void TestNotEqualsFamily() {
        Dog dog = new Dog("zevs", 5, 50, new HashSet<>(Arrays.asList("eating",
                "playing")));
            Woman mother = new Woman("Aypara", "Qafarova", 1977, 70,
                    Map.of(DayOfWeek.MONDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));

        Man father = new Man("Elvin", "Qafarov", 1971, 70,
                Map.of(DayOfWeek.MONDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));

        Woman zohre1 = new Woman("Zohra", "Qafarova", 2001, 90,
                Map.of(DayOfWeek.SUNDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
        Family family1 = new Family(mother, father,new HashSet<>(List.of(dog)),new ArrayList<>( List.of(zohre1)));
        Dog dog1 = new Dog("zevs", 5, 50,new HashSet<>(Arrays.asList("eating",
                "playing")));
        Woman mother1 = new Woman("Aypara", "Hasanova", 1977, 70,
                Map.of(DayOfWeek.MONDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
        Man father1 = new Man("Elvin", "Qafarov", 1971, 70,
                Map.of(DayOfWeek.MONDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
        Woman zohre2 = new Woman("Zohra", "Qafarova", 2001, 90,
                Map.of(DayOfWeek.MONDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
        Family family2 = new Family(mother1, father1,new HashSet<>(List.of(dog1)),new ArrayList<>( List.of(zohre2)));
        assertNotEquals(family1, family2);
    }

    @Test
    public void TestCountFamily() {
        Dog dog = new Dog("zevs", 5, 50, new HashSet<>(Arrays.asList("eating",
                "playing")));
        Woman mother = new Woman("Aypara", "Qafarova", 1977, 70,
                Map.of(DayOfWeek.MONDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
       Man father = new Man("Elvin", "Qafarov", 1971, 70,
               Map.of(DayOfWeek.SUNDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
        Woman zohre1 = new Woman("Zohra", "Qafarova", 2001, 90,
                Map.of(DayOfWeek.SUNDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
        Woman vusala = new Woman("Vusala", "Qafarova", 2001, 100,
                Map.of(DayOfWeek.MONDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
        Family family1 = new Family(mother, father, new HashSet<>(List.of(dog)),new ArrayList<>( List.of(zohre1,vusala)));
        assertEquals(4, family1.countFamily());
    }

    @Test
    public void testDeleteChildWithIndex() {
        Dog dog = new Dog("zevs", 5, 50, new HashSet<>(Arrays.asList("eating",
                "playing")));
       Woman mother = new Woman("Aypara", "Qafarova", 1977, 70,
               Map.of(DayOfWeek.MONDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
        Man father = new Man("Elvin", "Qafarov", 1971, 70,
                Map.of(DayOfWeek.MONDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
        Woman zohre1 = new Woman("Zohra", "Qafarova", 2001, 90,
                Map.of(DayOfWeek.MONDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
        Woman vusala = new Woman("Vusala", "Qafarova", 2001, 100,
                Map.of(DayOfWeek.MONDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
        Family family1 = new Family(mother, father,new HashSet<>(List.of(dog)),new ArrayList<>( List.of(zohre1,vusala)));
        family1.deleteChild(1);
        Family family2 = new Family(mother, father, new HashSet<>(List.of(dog)),new ArrayList<>( List.of(zohre1,vusala)));

                assertTrue(family1.equals(family2));
    }

    @Test
    public void testDeleteChildWithObject() {
        Dog dog = new Dog("zevs", 5, 50, new HashSet<>(Arrays.asList("eating",
                "playing")));
        Woman mother = new Woman("Aypara", "Qafarova", 1977, 70,
                Map.of(DayOfWeek.MONDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
        Man father = new Man("Elvin", "Qafarov", 1971, 70,
                Map.of(DayOfWeek.MONDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
       Woman zohre1 = new Woman("Zohra", "Qafarova", 2001, 90,
               Map.of(DayOfWeek.MONDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
        Woman vusala = new Woman("Vusala", "Qafarova", 2001, 100,
                Map.of(DayOfWeek.MONDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
        Family family1 = new Family(mother, father, new HashSet<>(List.of(dog)),new ArrayList<>( List.of(zohre1,vusala)));
        family1.deleteChild(vusala);
        Family family2 = new Family(mother, father, new HashSet<>(List.of(dog)),new ArrayList<>( List.of(zohre1)));
        assertTrue(family1.equals(family2));
    }

    @Test
    public void testAddChild() {
        Dog dog = new Dog("zevs", 5, 50,new HashSet<>(Arrays.asList("eating",
                "playing")));
        Woman mother = new Woman("Aypara", "Qafarova", 1977, 70,
                Map.of(DayOfWeek.MONDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
        Man father = new Man("Elvin", "Qafarov", 1971, 70,
                Map.of(DayOfWeek.MONDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
        Woman zohre1 = new Woman("Zohra", "Qafarova", 2001, 90,
                Map.of(DayOfWeek.MONDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
        Woman vusala = new Woman("Vusala", "Qafarova", 2001, 100,
                Map.of(DayOfWeek.MONDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
        Family family1 = new Family(mother, father, new HashSet<>(List.of(dog)),new ArrayList<>( List.of(zohre1)));
        family1.addChild(vusala);

        Family family2 = new Family(mother, father, new HashSet<>(List.of(dog)),new ArrayList<>( List.of(zohre1,vusala)));
        assertTrue(family1.equals(family2));
    }

    @Test
    public void testFamily() {
        Dog dog = new Dog("zevs", 5, 50,new HashSet<>(Arrays.asList("eating",
                "playing")));
        Woman mother = new Woman("Aypara", "Qafarova", 1977, 70,
                Map.of(DayOfWeek.MONDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
        Man father = new Man("Elvin", "Qafarov", 1971, 70,
                Map.of(DayOfWeek.MONDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
        Woman zohre1 = new Woman("Zohra", "Qafarova", 2001, 90,
                Map.of(DayOfWeek.MONDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
        Woman vusala = new Woman("Vusala", "Qafarova", 2001, 100,
                Map.of(DayOfWeek.MONDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
        Family family1 = new Family(mother, father,new HashSet<>(List.of(dog)),new ArrayList<>( List.of(zohre1,vusala)));
        String expected = "Family{mother=Human{name='Aypara', surname='Qafarova', year=1977," +
                " iq=70schedule[[MONDAY, Reading book], [SUNDAY, Watching film]]}, " +
                "father=Human{name='Elvin', surname='Qafarov', year=1971, iq=70schedule[[MONDAY, Reading book], [SUNDAY, Watching film]]}," +
                " children=[Human{name='Zohra', surname='Qafarova', year=2001, iq=90schedule[[MONDAY, Reading book], [SUNDAY, Watching film]]}, " +
                "Human{name='Vusala', surname='Qafarova', year=2001, iq=100schedule[[MONDAY, Reading book], [SUNDAY, Watching film]]}], " +
                "pet=DOG{animal can't flyanimal doesn't have furnumber of legs 4, nickname='zevs', age=5, trickLevel=50, habits=[eating, playing]}}";
        assertEquals(expected, family1.toString());
    }

    @Test
    public void testHashCodeTrue() {
        Dog dog = new Dog("zevs", 5, 50,new HashSet<>(Arrays.asList("eating",
                "playing")));
       Woman mother = new Woman("Aypara", "Qafarova", 1977, 70,
               Map.of(DayOfWeek.MONDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
        Man father = new Man("Elvin", "Qafarov", 1971, 70,
                Map.of(DayOfWeek.MONDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
        Woman zohre1 = new Woman("Zohra", "Qafarova", 2001, 90,
                Map.of(DayOfWeek.SUNDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
        Family family1 = new Family(mother, father, new HashSet<>(List.of(dog)),new ArrayList<>( List.of(zohre1)));
        Dog dog1 = new Dog("zevs", 5, 50, new HashSet<>(Arrays.asList("eating",
                "playing")));
        Woman mother1 = new Woman("Aypara", "Qafarova", 1977, 70,
                Map.of(DayOfWeek.MONDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
        Man father1 = new Man("Elvin", "Qafarov", 1971, 70,
                Map.of(DayOfWeek.MONDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
        Woman zohre2 = new Woman("Zohra", "Qafarova", 2001, 90,
                Map.of(DayOfWeek.SUNDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
        Family family2 = new Family(mother1, father1, new HashSet<>(List.of(dog1)),new ArrayList<>( List.of(zohre2)));

        assertTrue(family1.hashCode() == family2.hashCode());
    }

    @Test
    public void testHashcodeFalse() {
        Dog dog = new Dog("zevs", 5, 50, new HashSet<>(Arrays.asList("eating",
                "playing")));
        Woman mother = new Woman("Aypara", "Qafarova", 1977, 70,
                Map.of(DayOfWeek.MONDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
        Man father = new Man("Elvin", "Qafarov", 1971, 70,
                Map.of(DayOfWeek.MONDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));

      Woman zohre1 = new Woman("Zohra", "Qafarova", 2001, 90,
              Map.of(DayOfWeek.SUNDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
        Family family1 = new Family(mother, father,new HashSet<>(List.of(dog)),new ArrayList<>( List.of(zohre1)));
        Dog dog1 = new Dog("zevs", 5, 40,new HashSet<>(Arrays.asList("eating",
                "playing")));
        Woman mother1 = new Woman("Aypara", "Hasanova", 1977, 70,
                Map.of(DayOfWeek.MONDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
        Man father1 = new Man("Elvin", "Qafarov", 1971, 70,
                Map.of(DayOfWeek.MONDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
        Woman zohre2 = new Woman("Zohra", "Qafarova", 2001, 90,
                Map.of(DayOfWeek.MONDAY,"Reading book",DayOfWeek.SUNDAY,"Watching film"));
        Family family2 = new Family(mother1, father1,new HashSet<>(List.of(dog1)),new ArrayList<>( List.of(zohre2)));
        assertFalse(family1.hashCode() == family2.hashCode());
    }

}
