package taskTwelve.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import taskTwelve.model.abstracts.Human;
import taskTwelve.model.enums.DayOfWeek;
import taskTwelve.model.nonAbstarcts.Dog;
import taskTwelve.model.nonAbstarcts.Family;
import taskTwelve.model.nonAbstarcts.Man;
import taskTwelve.model.nonAbstarcts.Woman;

import java.util.*;

public class testNewFamily {
    @Test
    public void testBornChild(){
        Woman mother = new Woman("Aypara", "Qafarova", "01.05.1977", 70,
                Map.of(DayOfWeek.MONDAY,"Reading book", DayOfWeek.SUNDAY,"Watching film"));


        Man father = new Man("Elvin", "Qafarov", "01.05.1971", 70,
                Map.of(DayOfWeek.MONDAY,"Reading book", DayOfWeek.SUNDAY,"Watching film"));
        Woman zohre1 = new Woman("Zohra", "Qafarova", "17.12.2001", 90,
                Map.of(DayOfWeek.MONDAY,"Reading book", DayOfWeek.SUNDAY,"Watching film"));
        Dog dog = new Dog("zevs", 5, 50, new HashSet<>(Arrays.asList("eating",
                "playing")));
        Family family1 = new Family(mother, father, new HashSet<>(List.of(dog)),new ArrayList<>(List.of(zohre1)));
        Human child = family1.bornChild();
        Assertions.assertNotNull(child);
    }
}
