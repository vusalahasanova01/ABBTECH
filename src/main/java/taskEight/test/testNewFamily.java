package taskEight.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import taskEight.enums.DayOfWeek;
import taskEight.nonAbstarcts.Dog;
import taskEight.nonAbstarcts.Family;
import taskEight.nonAbstarcts.Man;
import taskEight.abstracts.Human;
import taskEight.nonAbstarcts.Woman;

public class testNewFamily {
    @Test
    public void testBornChild(){
        Woman mother = new Woman("Aypara", "Qafarova", 1977, 70, new String[][]
                {{DayOfWeek.MONDAY.name(),
                        "Reading book"},
                        {"Sunday", "Watching film"}});
        Man father = new Man("Elvin", "Qafarov", 1971, 70, new String[][]
                {{DayOfWeek.MONDAY.name(), "Reading book"},
                        {DayOfWeek.SUNDAY.name(), "Watching film"}});
        Woman zohre1 = new Woman("Zohra", "Qafarova", 2001, 90,
                new String[][]{{DayOfWeek.SUNDAY.name(), "Reading book"}, {DayOfWeek.SUNDAY.name(),
                        "Watching film"}});
        Dog dog = new Dog("zevs", 5, 50, new String[]{"eating",
                "playing"});
        Family family1 = new Family(mother, father, dog, zohre1);
        Human child = family1.bornChild();
        Assertions.assertNotNull(child);
    }
}
