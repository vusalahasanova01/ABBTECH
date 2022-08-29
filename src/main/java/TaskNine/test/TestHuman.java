package TaskNine.test;

import TaskNine.model.enums.DayOfWeek;
import TaskNine.model.nonAbstarcts.Woman;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class TestHuman {

    @Test
    public void testEqualsHuman() {
        Woman vusala = new Woman("Vusala", "Qafarova", 2001, 100,
                Map.of(DayOfWeek.MONDAY,"Reading book", DayOfWeek.SUNDAY,"Watching film"));
        Woman vusala2 = new Woman("Vusala", "Qafarova", 2001, 100,
                Map.of(DayOfWeek.MONDAY,"Reading book", DayOfWeek.SUNDAY,"Watching film"));
        assertEquals(vusala, vusala2);
    }

    @Test
    public void testNotEqualsHuman() {
        Woman vusala = new Woman("Vusala", "Qafarova", 2001, 100,
                Map.of(DayOfWeek.MONDAY,"Reading book", DayOfWeek.SUNDAY,"Watching film"));
        Woman vusala2 = new Woman("Zohre", "Hasanova", 2001, 100,
                Map.of(DayOfWeek.MONDAY,"Reading book", DayOfWeek.SUNDAY,"Watching film"));
        assertNotEquals(vusala, vusala2);
    }

    @Test
    public void testHashcodeTrue() {
       Woman vusala = new Woman("Vusala", "Qafarova", 2001, 100,
               Map.of(DayOfWeek.MONDAY,"Reading book", DayOfWeek.SUNDAY,"Watching film"));
        Woman vusala2 = new Woman("Vusala", "Qafarova", 2001, 100,
                Map.of(DayOfWeek.MONDAY,"Reading book", DayOfWeek.SUNDAY,"Watching film"));
        assertTrue(vusala.hashCode() == vusala2.hashCode());
    }

    @Test
    public void testHashcodeFalse() {
        Woman vusala = new Woman("Vusala", "Qafarova", 2001, 100,
                Map.of(DayOfWeek.MONDAY,"Reading book", DayOfWeek.SUNDAY,"Watching film"));
        Woman vusala2 = new Woman("Zohre", "Hasanova", 2001, 100,
                Map.of(DayOfWeek.MONDAY,"Reading book", DayOfWeek.SUNDAY,"Watching film"));
        assertFalse(vusala.hashCode() == vusala2.hashCode());
    }
}
