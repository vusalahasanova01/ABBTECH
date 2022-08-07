package TaskSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPet {
    @Test
    public void testEqualPet() {
        Pet dog = new Pet("zevs", Species.DOG, 5, 50, new String[]{"eating",
                "playing"});
        Pet dog1 = new Pet("zevs", Species.DOG, 5, 50, new String[]{"eating",
                "playing"});

        assertEquals(dog, dog1);
    }

    @Test
    public void testNotEqualPet() {
        Pet dog = new Pet("zevs", Species.DOG, 5, 50, new String[]{"eating",
                "playing"});
        Pet dog1 = new Pet("mila", Species.DOG, 6, 30, new String[]{"eating",
                "playing"});
        assertNotEquals(dog, dog1);
    }

    @Test
    public void testToString() {
        Pet dog = new Pet("zevs", Species.DOG, 5, 50, new String[]{"eating",
                "playing"});
        String expected = "DOG{animal can't flyanimal doesn't have furnumber of legs 4, nickname='zevs'," +
                " age=5, trickLevel=50, habits=[eating, playing]}";
        assertEquals(expected, dog.toString());
    }

    @Test
    public void testHashcodeFalse() {
        Pet dog = new Pet("zevs", Species.DOG, 5, 50, new String[]{"eating",
                "playing"});
        Pet dog1 = new Pet("mila", Species.DOG, 6, 30, new String[]{"eating",
                "playing"});
        assertFalse(dog.hashCode() == dog1.hashCode());
    }

    @Test
    public void testHashCodeTrue() {
        Pet dog = new Pet("zevs", Species.DOG, 5, 50, new String[]{"eating",
                "playing"});
        Pet dog1 = new Pet("zevs", Species.DOG, 5, 50, new String[]{"eating",
                "playing"});

        assertTrue(dog.hashCode() == dog1.hashCode());
    }
}
