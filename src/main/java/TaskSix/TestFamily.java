package TaskSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestFamily {
    @Test
    public void TestEqualsFamily() {
        Pet dog = new Pet("zevs", Species.DOG, 5, 50, new String[]{"eating",
                "playing"});
        Human mother = new Human("Aypara", "Qafarova", 1977, 70, new String[][]
                {{DayOfWeek.MONDAY.name(),
                        "Reading book"},
                        {"Sunday", "Watching film"}});
        Human father = new Human("Elvin", "Qafarov", 1971, 70, new String[][]
                {{DayOfWeek.MONDAY.name(), "Reading book"},
                        {DayOfWeek.SUNDAY.name(), "Watching film"}});
        Human zohre1 = new Human("Zohra", "Qafarova", 2001, 90,
                new String[][]{{DayOfWeek.SUNDAY.name(), "Reading book"}, {DayOfWeek.SUNDAY.name(),
                        "Watching film"}});
        Family family1 = new Family(mother, father, dog, zohre1);
        Pet dog1 = new Pet("zevs", Species.DOG, 5, 50, new String[]{"eating", "playing"});
        Human mother1 = new Human("Aypara", "Qafarova", 1977, 70,
                new String[][]{{DayOfWeek.MONDAY.name(), "Reading book"},
                        {DayOfWeek.SUNDAY.name(), "Watching film"}});
        Human father1 = new Human("Elvin", "Qafarov", 1971, 70, new String[][]{{"Monday",
                "Reading book"},
                {"Sunday", "Watching film"}});
        Human zohre2 = new Human("Zohra", "Qafarova", 2001, 90,
                new String[][]{{DayOfWeek.MONDAY.name(), "Reading book"}, {DayOfWeek.SUNDAY.name(), "Watching film"}});
        Family family2 = new Family(mother1, father1, dog1, zohre2);
        assertEquals(family1, family2);
    }

    @Test
    public void TestNotEqualsFamily() {
        Pet dog = new Pet("zevs", Species.DOG, 5, 50, new String[]{"eating",
                "playing"});
        Human mother = new Human("Aypara", "Qafarova", 1977, 70, new String[][]
                {{DayOfWeek.MONDAY.name(),
                        "Reading book"},
                        {"Sunday", "Watching film"}});
        Human father = new Human("Elvin", "Qafarov", 1971, 70, new String[][]
                {{DayOfWeek.MONDAY.name(), "Reading book"},
                        {DayOfWeek.SUNDAY.name(), "Watching film"}});
        Human zohre1 = new Human("Zohra", "Qafarova", 2001, 90,
                new String[][]{{DayOfWeek.SUNDAY.name(), "Reading book"}, {DayOfWeek.SUNDAY.name(),
                        "Watching film"}});
        Family family1 = new Family(mother, father, dog, zohre1);
        Pet dog1 = new Pet("mila", Species.DOG, 5, 50, new String[]{"eating", "playing"});
        Human mother1 = new Human("Aypara", "Hasanova", 1977, 70,
                new String[][]{{DayOfWeek.MONDAY.name(), "Reading book"},
                        {DayOfWeek.SUNDAY.name(), "Watching film"}});
        Human father1 = new Human("Elvin", "Qafarov", 1971, 70, new String[][]{{"Monday",
                "Reading book"},
                {"Sunday", "Watching film"}});
        Human zohre2 = new Human("Zohra", "Qafarova", 2001, 90,
                new String[][]{{DayOfWeek.MONDAY.name(), "Reading book"}, {DayOfWeek.SUNDAY.name(), "Watching film"}});
        Family family2 = new Family(mother1, father1, dog1, zohre2);
        assertNotEquals(family1, family2);
    }

    @Test
    public void TestCountFamily() {
        Pet dog = new Pet("zevs", Species.DOG, 5, 50, new String[]{"eating",
                "playing"});
        Human mother = new Human("Aypara", "Qafarova", 1977, 70, new String[][]
                {{DayOfWeek.MONDAY.name(),
                        "Reading book"},
                        {DayOfWeek.SUNDAY.name(), "Watching film"}});
        Human father = new Human("Elvin", "Qafarov", 1971, 70,
                new String[][]{{DayOfWeek.SUNDAY.name(),
                        "Reading book"},
                        {DayOfWeek.SUNDAY.name(), "Watching film"}});
        Human zohre1 = new Human("Zohra", "Qafarova", 2001, 90,
                new String[][]{{DayOfWeek.SUNDAY.name(), "Reading book"}, {DayOfWeek.SUNDAY.name(), "Watching film"}});
        Human vusala = new Human("Vusala", "Qafarova", 2001, 100,
                new String[][]{{DayOfWeek.MONDAY.name(), "Reading book"}, {DayOfWeek.SUNDAY.name(), "Watching film"}});
        Family family1 = new Family(mother, father, dog, zohre1, vusala);
        assertEquals(4, family1.countFamily());
    }

    @Test
    public void testDeleteChildWithIndex() {
        Pet dog = new Pet("zevs", Species.DOG, 5, 50, new String[]{"eating",
                "playing"});
        Human mother = new Human("Aypara", "Qafarova", 1977, 70,
                new String[][]{{DayOfWeek.MONDAY.name(),
                        "Reading book"},
                        {DayOfWeek.SUNDAY.name(), "Watching film"}});
        Human father = new Human("Elvin", "Qafarov", 1971, 70,
                new String[][]{{DayOfWeek.MONDAY.name(),
                        "Reading book"},
                        {DayOfWeek.SUNDAY.name(), "Watching film"}});
        Human zohre1 = new Human("Zohra", "Qafarova", 2001, 90,
                new String[][]{{DayOfWeek.MONDAY.name(), "Reading book"},
                        {DayOfWeek.SUNDAY.name(), "Watching film"}});
        Human vusala = new Human("Vusala", "Qafarova", 2001, 100,
                new String[][]{{DayOfWeek.MONDAY.name(), "Reading book"},
                        {DayOfWeek.SUNDAY.name(), "Watching film"}});
        Family family1 = new Family(mother, father, dog, zohre1, vusala);
        family1.deleteChild(1);
        Family family2 = new Family(mother, father, dog, zohre1);
        assertTrue(family1.equals(family2));
    }

    @Test
    public void testDeleteChildWithObject() {
        Pet dog = new Pet("zevs", Species.DOG, 5, 50, new String[]{"eating",
                "playing"});
        Human mother = new Human("Aypara", "Qafarova", 1977, 70,
                new String[][]{{DayOfWeek.MONDAY.name(),
                        "Reading book"},
                        {DayOfWeek.SUNDAY.name(), "Watching film"}});
        Human father = new Human("Elvin", "Qafarov", 1971, 70,
                new String[][]{{DayOfWeek.MONDAY.name(),
                        "Reading book"},
                        {DayOfWeek.SUNDAY.name(), "Watching film"}});
        Human zohre1 = new Human("Zohra", "Qafarova", 2001, 90,
                new String[][]{{DayOfWeek.MONDAY.name(), "Reading book"},
                        {DayOfWeek.SUNDAY.name(), "Watching film"}});
        Human vusala = new Human("Vusala", "Qafarova", 2001, 100,
                new String[][]{{DayOfWeek.MONDAY.name(), "Reading book"},
                        {DayOfWeek.SUNDAY.name(), "Watching film"}});
        Family family1 = new Family(mother, father, dog, zohre1, vusala);
        family1.deleteChild(vusala);
        Family family2 = new Family(mother, father, dog, zohre1);
        assertTrue(family1.equals(family2));
    }

    @Test
    public void testAddChild() {
        Pet dog = new Pet("zevs", Species.DOG, 5, 50, new String[]{"eating",
                "playing"});
        Human mother = new Human("Aypara", "Qafarova", 1977, 70,
                new String[][]{{DayOfWeek.MONDAY.name(),
                        "Reading book"},
                        {DayOfWeek.SUNDAY.name(), "Watching film"}});
        Human father = new Human("Elvin", "Qafarov", 1971, 70,
                new String[][]{{DayOfWeek.MONDAY.name(),
                        "Reading book"},
                        {DayOfWeek.SUNDAY.name(), "Watching film"}});
        Human zohre1 = new Human("Zohra", "Qafarova", 2001, 90,
                new String[][]{{DayOfWeek.MONDAY.name(), "Reading book"},
                        {DayOfWeek.SUNDAY.name(), "Watching film"}});
        Human vusala = new Human("Vusala", "Qafarova", 2001, 100,
                new String[][]{{DayOfWeek.MONDAY.name(), "Reading book"},
                        {DayOfWeek.SUNDAY.name(), "Watching film"}});
        Family family1 = new Family(mother, father, dog, zohre1);
        family1.addChild(vusala);

        Family family2 = new Family(mother, father, dog, zohre1, vusala);
        assertTrue(family1.equals(family2));
    }

    @Test
    public void testFamily() {
        Pet dog = new Pet("zevs", Species.DOG, 5, 50, new String[]{"eating",
                "playing"});
        Human mother = new Human("Aypara", "Qafarova", 1977, 70,
                new String[][]{{DayOfWeek.MONDAY.name(),
                        "Reading book"},
                        {DayOfWeek.SUNDAY.name(), "Watching film"}});
        Human father = new Human("Elvin", "Qafarov", 1971, 70,
                new String[][]{{DayOfWeek.MONDAY.name(),
                        "Reading book"},
                        {DayOfWeek.SUNDAY.name(), "Watching film"}});
        Human zohre1 = new Human("Zohra", "Qafarova", 2001, 90,
                new String[][]{{DayOfWeek.MONDAY.name(), "Reading book"},
                        {DayOfWeek.SUNDAY.name(), "Watching film"}});
        Human vusala = new Human("Vusala", "Qafarova", 2001, 100,
                new String[][]{{DayOfWeek.MONDAY.name(), "Reading book"},
                        {DayOfWeek.SUNDAY.name(), "Watching film"}});
        Family family1 = new Family(mother, father, dog, zohre1, vusala);
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
        Pet dog = new Pet("zevs", Species.DOG, 5, 50, new String[]{"eating",
                "playing"});
        Human mother = new Human("Aypara", "Qafarova", 1977, 70, new String[][]
                {{DayOfWeek.MONDAY.name(),
                        "Reading book"},
                        {"Sunday", "Watching film"}});
        Human father = new Human("Elvin", "Qafarov", 1971, 70, new String[][]
                {{DayOfWeek.MONDAY.name(), "Reading book"},
                        {DayOfWeek.SUNDAY.name(), "Watching film"}});
        Human zohre1 = new Human("Zohra", "Qafarova", 2001, 90,
                new String[][]{{DayOfWeek.SUNDAY.name(), "Reading book"}, {DayOfWeek.SUNDAY.name(),
                        "Watching film"}});
        Family family1 = new Family(mother, father, dog, zohre1);
        Pet dog1 = new Pet("zevs", Species.DOG, 5, 50, new String[]{"eating",
                "playing"});
        Human mother1 = new Human("Aypara", "Qafarova", 1977, 70, new String[][]
                {{DayOfWeek.MONDAY.name(),
                        "Reading book"},
                        {"Sunday", "Watching film"}});
        Human father1 = new Human("Elvin", "Qafarov", 1971, 70, new String[][]
                {{DayOfWeek.MONDAY.name(), "Reading book"},
                        {DayOfWeek.SUNDAY.name(), "Watching film"}});
        Human zohre2 = new Human("Zohra", "Qafarova", 2001, 90,
                new String[][]{{DayOfWeek.SUNDAY.name(), "Reading book"}, {DayOfWeek.SUNDAY.name(),
                        "Watching film"}});
        Family family2 = new Family(mother1, father1, dog1, zohre2);

        assertTrue(family1.hashCode() == family2.hashCode());
    }

    @Test
    public void testHashcodeFalse() {
        Pet dog = new Pet("zevs", Species.DOG, 5, 50, new String[]{"eating",
                "playing"});
        Human mother = new Human("Aypara", "Qafarova", 1977, 70, new String[][]
                {{DayOfWeek.MONDAY.name(),
                        "Reading book"},
                        {"Sunday", "Watching film"}});
        Human father = new Human("Elvin", "Qafarov", 1971, 70, new String[][]
                {{DayOfWeek.MONDAY.name(), "Reading book"},
                        {DayOfWeek.SUNDAY.name(), "Watching film"}});
        Human zohre1 = new Human("Zohra", "Qafarova", 2001, 90,
                new String[][]{{DayOfWeek.SUNDAY.name(), "Reading book"}, {DayOfWeek.SUNDAY.name(),
                        "Watching film"}});
        Family family1 = new Family(mother, father, dog, zohre1);
        Pet dog1 = new Pet("mila", Species.DOG, 5, 50, new String[]{"eating", "playing"});
        Human mother1 = new Human("Aypara", "Hasanova", 1977, 70,
                new String[][]{{DayOfWeek.MONDAY.name(), "Reading book"},
                        {DayOfWeek.SUNDAY.name(), "Watching film"}});
        Human father1 = new Human("Elvin", "Qafarov", 1971, 70, new String[][]{{"Monday",
                "Reading book"},
                {"Sunday", "Watching film"}});
        Human zohre2 = new Human("Zohra", "Qafarova", 2001, 90,
                new String[][]{{DayOfWeek.MONDAY.name(), "Reading book"}, {DayOfWeek.SUNDAY.name(), "Watching film"}});
        Family family2 = new Family(mother1, father1, dog1, zohre2);
        assertFalse(family1.hashCode() == family2.hashCode());
    }
}
