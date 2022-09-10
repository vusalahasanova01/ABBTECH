package taskThirteen.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import taskThirteen.controller.FamilyController;
import taskThirteen.model.nonAbstarcts.Man;
import taskThirteen.model.nonAbstarcts.Dog;
import taskThirteen.model.nonAbstarcts.Family;
import taskThirteen.model.nonAbstarcts.Woman;

import java.util.ArrayList;
import java.util.List;

public class TestFamilyController {

    FamilyController familyController = new FamilyController();
    FamilyController familyControllerMock;
    Woman mother;
    Man father;
    Woman mother1;
    Man father1;
    Family family1;
    Family family2;
    Dog dog;

    @BeforeEach
    public void testAll(){
        familyControllerMock = Mockito.mock(FamilyController.class);
        mother  = new Woman("Aypara","Qafarova","01/05/1977");
        father = new Man("Elvin","Qafarova","01/05/1971");
        family1 = new Family(mother,father);
        mother1  = new Woman("Aypara1","Qafarova1","01/05/1977");
        father1 = new Man("Elvin1","Qafarova1","01/05/1971");
        family2 = new Family(mother1,father1);
        dog  = new Dog("Toplan");

    }

    @Test
    public void testGetAllFamilies(){
        familyController.addFamily(family1);
        familyController.addFamily(family2);
        List <Family> family = new ArrayList<>();
        family.add(family1);
        family.add(family2);
        Assertions.assertEquals(family,familyController.getAllFamilies());
    }

    @Test
    public void testDisplayAllFamilies(){
         familyControllerMock.displayAllFamilies();
         Mockito.verify(familyControllerMock).displayAllFamilies();
    }

    @Test
    public void testCountFamiliesWithMemberNumber(){
        Woman child1 = new Woman("Zohra","Qafarova","17/12/2001");
        family1.addChild(child1);
        familyController.addFamily(family1);
        familyController.addFamily(family2);
        Assertions.assertEquals(1,familyController.countFamiliesWithMemberNumber(3));
    }

    @Test
    public void testGetFamiliesBiggerThan(){
        Woman child1 = new Woman("Zohra","Qafarova","17/12/2001");
        Woman child2 = new Woman("Vusala","Qafarova","17/12/2001");
        Man child3 = new Man("Elvin","Qafarli","17/12/2000");
        family1.addChild(child2);
        family1.addChild(child1);
        family2.addChild(child3);
        familyController.addFamily(family1);
        familyController.addFamily(family2);
        List<Family> result = new ArrayList<>();
        result.add(family1);
        result.add(family2);
        Assertions.assertEquals(result,familyController.getFamiliesBiggerThan(2));
    }

    @Test
    public void TestGetFamiliesLessThan(){
        Woman child1 = new Woman("Zohra","Qafarova","17/12/2001");
        Woman child2 = new Woman("Vusala","Qafarova","17/12/2001");
        Man child3 = new Man("Elvin","Qafarli","17/12/2000");
        family1.addChild(child2);
        family1.addChild(child1);
        family2.addChild(child3);
        familyController.addFamily(family1);
        familyController.addFamily(family2);
        List<Family> result = new ArrayList<>();
        result.add(family1);
        result.add(family2);
        Assertions.assertEquals(result,familyController.getFamiliesLessThan(5));

    }

    @Test
    public void testCreateNewFamily(){
        familyController.createNewFamily(mother,father);
        Family selectedFamily = familyController.getAllFamilies().get(0);
        Assertions.assertEquals(mother,selectedFamily.getMother());
        Assertions.assertEquals(father,selectedFamily.getFather());

    }

    @Test
    public void testAdoptChild(){
        Family family3 = new Family(mother,father);
        Woman child1 = new Woman("Zohra","Qafarova","17/12/2001");
        family3.addChild(child1);
        familyController.addFamily(family1);
        Assertions.assertEquals(family3, familyController.adoptChild(family1,child1));

    }

    @Test
    public void testBornChild(){
        familyController.addFamily(family1);
        Family expectedFamily = familyController.bornChild(family1,"Elvin","Zohre");
        Assertions.assertTrue("Zohre".equals(expectedFamily.getChildren().get(0).getName())
                || "Elvin".equals(expectedFamily.getChildren().get(0).getName()));

    }

    @Test
    public void testDeleteAllChildrenOlderThen(){

        Woman child1 = new Woman("Zohra","Qafarova","17/12/2001");
        Woman child2 = new Woman("Vusala","Qafarova","17/12/2018");
        Man child3 = new Man("Elvin","Qafarli","17/12/2000");
        family1.addChild(child2);
        family1.addChild(child1);
        family1.addChild(child3);
        familyController.addFamily(family1);
        Assertions.assertEquals(3,familyController.getAllFamilies().get(0).getChildren().size());
        familyController.deleteAllChildrenOlderThen(10);
        Assertions.assertEquals(1,familyController.getAllFamilies().get(0).getChildren().size());

    }

    @Test
    public void testCount(){
        Woman child1 = new Woman("Zohra","Qafarova","17/12/2001");
        Woman child2 = new Woman("Vusala","Qafarova","17/12/2018");
        Man child3 = new Man("Elvin","Qafarli","17/12/2000");
        family1.addChild(child2);
        family1.addChild(child1);
        family1.addChild(child3);
        familyController.addFamily(family1);
        familyController.addFamily(family2);
        Assertions.assertEquals(2,familyController.count());

    }

    @Test
    public void testDeleteFamilyByIndex(){
        Woman child1 = new Woman("Zohra","Qafarova","17/12/2001");
        Woman child2 = new Woman("Vusala","Qafarova","17/12/2018");
        Man child3 = new Man("Elvin","Qafarli","17/12/2000");
        family1.addChild(child2);
        family1.addChild(child1);
        family1.addChild(child3);
        familyController.addFamily(family1);
        familyController.addFamily(family2);
        Assertions.assertEquals(2,familyController.getAllFamilies().size());
        Assertions.assertTrue( familyController.deleteFamilyByIndex(0));
        Assertions.assertEquals(1,familyController.getAllFamilies().size());

    }

    @Test
    public void testDeleteFamilyByObject(){
        Woman child1 = new Woman("Zohra","Qafarova","17/12/2001");
        Woman child2 = new Woman("Vusala","Qafarova","17/12/2018");
        Man child3 = new Man("Elvin","Qafarli","17/12/2000");
        family1.addChild(child2);
        family1.addChild(child1);
        family1.addChild(child3);
        familyController.addFamily(family1);
        familyController.addFamily(family2);
        Assertions.assertEquals(2,familyController.getAllFamilies().size());
        Assertions.assertTrue( familyController.deleteFamilyByObject(family2));
        Assertions.assertEquals(1,familyController.getAllFamilies().size());

    }
    @Test
    public void testGetFamilyById(){
        Woman child1 = new Woman("Zohra","Qafarova","17/12/2001");
        Woman child2 = new Woman("Vusala","Qafarova","17/12/2018");
        Man child3 = new Man("Elvin","Qafarli","17/12/2000");
        family1.addChild(child2);
        family1.addChild(child1);
        family1.addChild(child3);
        familyController.addFamily(family1);
        familyController.addFamily(family2);
        Assertions.assertEquals(family1,familyController.getFamilyById(0));
    }

    @Test
    public void testAddPet(){
        Family family3 = new Family(mother,father);
        family3.addPet(dog);
        familyController.addFamily(family1);
        familyController.addFamily(family2);
        familyController.addPet(0,dog);
        Assertions.assertEquals(family3,family1);

    }

    @Test
     public  void testGetPets(){
        Family family3 = new Family(mother,father);
        family3.addPet(dog);
        familyController.addFamily(family1);
        familyController.addFamily(family2);
        familyController.addFamily(family3);
        Assertions.assertEquals(dog,familyController.getPets(2).get(0));
    }

    @Test
    public void testAddFamily(){
        Family family3 = new Family(mother,father);
        familyController.addFamily(family3);
        Family selectedFamily = familyController.getAllFamilies().get(0);
        Assertions.assertEquals(mother,selectedFamily.getMother());
        Assertions.assertEquals(father,selectedFamily.getFather());
    }






}
