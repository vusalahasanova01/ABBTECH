package taskTwelve.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import taskTwelve.model.nonAbstarcts.DomesticCat;
import taskTwelve.model.nonAbstarcts.Fish;
import taskTwelve.model.nonAbstarcts.RoboCat;
import taskTwelve.model.nonAbstarcts.Dog;

public class TestNewPet {
    RoboCat roboCat;
    DomesticCat domesticCat;
    Dog dog;
    Fish fish;
    @BeforeEach
    public void testAll(){
    roboCat = Mockito.mock(RoboCat.class);
    domesticCat = Mockito.mock(DomesticCat.class);
    dog = Mockito.mock(Dog.class);
    fish = Mockito.mock(Fish.class);

    }
    @Test
    public void testFoulRoboCat(){
      roboCat.foul();
        Mockito.verify(roboCat).foul();
    }
    @Test
    public void testRespondRoboCat(){
        roboCat.respond();
        Mockito.verify(roboCat).respond();
    }


    @Test
    public void testFoulDomesticCat(){
        domesticCat.foul();
        Mockito.verify(domesticCat).foul();
    }
    @Test
    public void testRespondDomesticCat(){
        domesticCat.respond();
        Mockito.verify(domesticCat).respond();
    }
    @Test
    public void testFoulDog(){
        dog.foul();
        Mockito.verify(dog).foul();
    }
    @Test
    public void testRespondDog(){
        dog.respond();
        Mockito.verify(dog).respond();
    }
    @Test
    public void testFoulFish(){
        fish.foul();
        Mockito.verify(fish).foul();
    }
    @Test
    public void testRespondFish(){
        fish.respond();
        Mockito.verify(fish).respond();
    }
}
