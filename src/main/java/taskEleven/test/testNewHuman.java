package taskEleven.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import taskEleven.model.nonAbstarcts.Man;
import taskEleven.model.nonAbstarcts.Woman;

public class testNewHuman {
    Man man;
    Woman woman;

    @BeforeEach
    public void testAll() {
        man = Mockito.mock(Man.class);
        woman = Mockito.mock(Woman.class);
    }

    @Test
    public void testRepairCar() {
        man.repairCar();
        Mockito.verify(man).repairCar();

    }
    @Test
    public void testMakeUp() {
        woman.makeUp();
        Mockito.verify(woman).makeUp();

    }


}
