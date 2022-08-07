package TaskSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestHuman {
    @Test
    public void testToString() {
        Human vusala = new Human("Vusala", "Qafarova", 2001, 100,
                new String[][]{{DayOfWeek.MONDAY.name(), "Reading book"}, {DayOfWeek.SUNDAY.name(), "Watching film"}});

        String expected = "Human{name='Vusala', surname='Qafarova', year=2001," +
                " iq=100schedule[[MONDAY, Reading book], [SUNDAY, Watching film]]}";
        assertEquals(expected, vusala.toString());
    }

    @Test
    public void testEqualsHuman() {
        Human vusala = new Human("Vusala", "Qafarova", 2001, 100,
                new String[][]{{DayOfWeek.MONDAY.name(), "Reading book"}, {"Sunday", "Watching film"}});
        Human vusala2 = new Human("Vusala", "Qafarova", 2001, 100,
                new String[][]{{DayOfWeek.MONDAY.name(), "Reading book"}, {"Sunday", "Watching film"}});
        assertEquals(vusala, vusala2);
    }

    @Test
    public void testNotEqualsHuman() {
        Human vusala = new Human("Vusala", "Qafarova", 2001, 100,
                new String[][]{{DayOfWeek.MONDAY.name(), "Reading book"}, {"Sunday", "Watching film"}});
        Human vusala2 = new Human("Zohre", "Hasanova", 2001, 100,
                new String[][]{{DayOfWeek.MONDAY.name(), "Reading book"}, {"Sunday", "Watching film"}});
        assertNotEquals(vusala, vusala2);
    }

    @Test
    public void testHashcodeTrue() {
        Human vusala = new Human("Vusala", "Qafarova", 2001, 100,
                new String[][]{{DayOfWeek.MONDAY.name(), "Reading book"}, {"Sunday", "Watching film"}});
        Human vusala2 = new Human("Vusala", "Qafarova", 2001, 100,
                new String[][]{{DayOfWeek.MONDAY.name(), "Reading book"}, {"Sunday", "Watching film"}});
        assertTrue(vusala.hashCode() == vusala2.hashCode());
    }

    @Test
    public void testHashcodeFalse() {
        Human vusala = new Human("Vusala", "Qafarova", 2001, 100,
                new String[][]{{DayOfWeek.MONDAY.name(), "Reading book"}, {"Sunday", "Watching film"}});
        Human vusala2 = new Human("Zohre", "Hasanova", 2001, 100,
                new String[][]{{DayOfWeek.MONDAY.name(), "Reading book"}, {"Sunday", "Watching film"}});
        assertFalse(vusala.hashCode() == vusala2.hashCode());
    }
}
