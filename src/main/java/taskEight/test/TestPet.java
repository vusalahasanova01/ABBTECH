package taskEight.test;

import org.junit.jupiter.api.Test;
import taskEight.nonAbstarcts.Dog;

import static org.junit.jupiter.api.Assertions.*;

public class TestPet {
    @Test
    public void testEqualPet() {
        Dog dog = new Dog("zevs", 5, 50, new String[]{"eating",
                "playing"});
        Dog dog1 = new Dog("zevs", 5, 50, new String[]{"eating",
                "playing"});

        assertEquals(dog, dog1);
    }

    @Test
    public void testNotEqualPet() {
        Dog dog = new Dog("zevs", 5, 50, new String[]{"eating",
                "playing"});
        Dog dog1 = new Dog("zevs", 5, 40, new String[]{"eating",
                "playing"});
        assertNotEquals(dog, dog1);
    }

    @Test
    public void testToString() {
        Dog dog = new Dog("zevs", 5, 50, new String[]{"eating",
                "playing"});

        String expected = "DOG{animal can't flyanimal doesn't have furnumber of legs 4, nickname='zevs'," +
                " age=5, trickLevel=50, habits=[eating, playing]}";
        assertEquals(expected, dog.toString());
    }

    @Test
    public void testHashcodeFalse() {
        Dog dog = new Dog("zevs", 5, 50, new String[]{"eating",
                "playing"});
        Dog dog1 = new Dog("zevs", 5, 40, new String[]{"eating",
                "playing"});
        assertFalse(dog.hashCode() == dog1.hashCode());
    }

    @Test
    public void testHashCodeTrue() {
        Dog dog = new Dog("zevs", 5, 50, new String[]{"eating",
                "playing"});
        Dog dog1 = new Dog("zevs", 5, 50, new String[]{"eating",
                "playing"});

        assertTrue(dog.hashCode() == dog1.hashCode());
    }
}
