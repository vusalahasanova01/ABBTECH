package taskEleven.test;

import org.junit.jupiter.api.Test;
import taskEleven.model.nonAbstarcts.Dog;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

public class TestPet {
    @Test
    public void testEqualPet() {
        Dog dog = new Dog("zevs", 5, 50,
                new HashSet<>(Arrays.asList("eating", "playing")));
        Dog dog1 = new Dog("zevs", 5, 50,
                new HashSet<>(Arrays.asList("eating", "playing")));

        assertEquals(dog, dog1);
    }

    @Test
    public void testNotEqualPet() {
        Dog dog = new Dog("zevs", 5, 50,
                new HashSet<>(Arrays.asList("eating", "playing")));
        Dog dog1 = new Dog("zevs", 5, 40,
                new HashSet<>(Arrays.asList("eating", "playing")));
        assertNotEquals(dog, dog1);
    }



    @Test
    public void testHashcodeFalse() {
        Dog dog = new Dog("zevs", 5, 50,
                new HashSet<>(Arrays.asList("eating", "playing")));
        Dog dog1 = new Dog("zevs", 5, 40,
                new HashSet<>(Arrays.asList("eating", "playing")));
        assertFalse(dog.hashCode() == dog1.hashCode());
    }

    @Test
    public void testHashCodeTrue() {
        Dog dog = new Dog("zevs", 5, 50,
                new HashSet<>(Arrays.asList("eating", "playing")));
        Dog dog1 = new Dog("zevs", 5, 50,
                new HashSet<>(Arrays.asList("eating", "playing")));

        assertTrue(dog.hashCode() == dog1.hashCode());
    }
}
