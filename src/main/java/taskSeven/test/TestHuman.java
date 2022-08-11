package taskSeven.test;

import org.junit.jupiter.api.Test;
import taskSeven.abstracts.Human;
import taskSeven.enums.DayOfWeek;
import taskSeven.nonAbstarcts.Woman;

import static org.junit.jupiter.api.Assertions.*;

public class TestHuman {
    @Test
    public void testToString() {
       Woman vusala = new Woman("Vusala", "Qafarova", 2001, 100,
                new String[][]{{DayOfWeek.MONDAY.name(), "Reading book"}, {DayOfWeek.SUNDAY.name(), "Watching film"}});

        String expected = "Human{name='Vusala', surname='Qafarova', year=2001," +
                " iq=100schedule[[MONDAY, Reading book], [SUNDAY, Watching film]]}";
        assertEquals(expected, vusala.toString());
    }

    @Test
    public void testEqualsHuman() {
        Woman vusala = new Woman("Vusala", "Qafarova", 2001, 100,
                new String[][]{{DayOfWeek.MONDAY.name(), "Reading book"}, {"Sunday", "Watching film"}});
        Woman vusala2 = new Woman("Vusala", "Qafarova", 2001, 100,
                new String[][]{{DayOfWeek.MONDAY.name(), "Reading book"}, {"Sunday", "Watching film"}});
        assertEquals(vusala, vusala2);
    }

    @Test
    public void testNotEqualsHuman() {
        Woman vusala = new Woman("Vusala", "Qafarova", 2001, 100,
                new String[][]{{DayOfWeek.MONDAY.name(), "Reading book"}, {"Sunday", "Watching film"}});
        Woman vusala2 = new Woman("Zohre", "Hasanova", 2001, 100,
                new String[][]{{DayOfWeek.MONDAY.name(), "Reading book"}, {"Sunday", "Watching film"}});
        assertNotEquals(vusala, vusala2);
    }

    @Test
    public void testHashcodeTrue() {
       Woman vusala = new Woman("Vusala", "Qafarova", 2001, 100,
                new String[][]{{DayOfWeek.MONDAY.name(), "Reading book"}, {"Sunday", "Watching film"}});
        Woman vusala2 = new Woman("Vusala", "Qafarova", 2001, 100,
                new String[][]{{DayOfWeek.MONDAY.name(), "Reading book"}, {"Sunday", "Watching film"}});
        assertTrue(vusala.hashCode() == vusala2.hashCode());
    }

    @Test
    public void testHashcodeFalse() {
        Woman vusala = new Woman("Vusala", "Qafarova", 2001, 100,
                new String[][]{{DayOfWeek.MONDAY.name(), "Reading book"}, {"Sunday", "Watching film"}});
        Woman vusala2 = new Woman("Zohre", "Hasanova", 2001, 100,
                new String[][]{{DayOfWeek.MONDAY.name(), "Reading book"}, {"Sunday", "Watching film"}});
        assertFalse(vusala.hashCode() == vusala2.hashCode());
    }
}
