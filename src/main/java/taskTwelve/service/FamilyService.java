package taskTwelve.service;

import taskTwelve.model.abstracts.Human;
import taskTwelve.familyDao.CollectionFamilyDao;
import taskTwelve.model.abstracts.Pet;
import taskTwelve.model.nonAbstarcts.Family;
import taskTwelve.model.nonAbstarcts.Man;
import taskTwelve.model.nonAbstarcts.Woman;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FamilyService {
    CollectionFamilyDao collectionFamilyDao = new CollectionFamilyDao();

    public List<Family> getAllFamilies() {
        return collectionFamilyDao.getAllFamilies();
    }

    public void displayAllFamilies() {

        getAllFamilies().stream().forEach(x-> System.out.println(x));
    }


    public int countFamiliesWithMemberNumber(int sizeOfFamilies){
        return (int) collectionFamilyDao.getAllFamilies().stream()
                .filter(x->x.countFamily()==sizeOfFamilies)
                .count();
    }

    public List<Family> getFamiliesBiggerThan(int sizeOfFamilies) {
           return collectionFamilyDao.getAllFamilies().stream()
                .filter(x-> x.countFamily()>sizeOfFamilies)
                   .collect(Collectors.toList());
    }

    public List<Family> getFamiliesLessThan(int sizeOfFamilies) {
         return collectionFamilyDao.getAllFamilies().stream()
                 .filter(x-> x.countFamily() < sizeOfFamilies)
                 .collect(Collectors.toList());
    }

    public void createNewFamily(Woman mother, Man father) {
        Family family = new Family(mother, father);
        collectionFamilyDao.getAllFamilies().add(family);
    }

    public Family bornChild(Family family, String masculine, String feminine) {

        if (collectionFamilyDao.getAllFamilies().contains(family)) {
            int index = collectionFamilyDao.getAllFamilies().indexOf(family);
            Family family1 = collectionFamilyDao.getAllFamilies().get(index);
            family1.bornChild("Zohre", "Elvin");
            return family1;
        } else {
            return null;
        }

    }

    public Family adoptChild(Family family, Human human) {
        if (collectionFamilyDao.getAllFamilies().contains(family)) {
            int index = collectionFamilyDao.getAllFamilies().indexOf(family);
            Family family1 = collectionFamilyDao.getAllFamilies().get(index);
            family1.addChild(human);
            return family1;
        } else {
            return null;
        }
    }

    public void deleteAllChildrenOlderThen(int specifiedAge) {
        collectionFamilyDao.getAllFamilies().stream()
                .forEach(x-> {
                   List <Human> deletedChildren = IntStream.range(0, x.getChildren().size())
                           .filter(y -> LocalDateTime.now().getYear() - x.getChildren().get(y).getBirthDateWithYear()
                                   > specifiedAge)
                           .mapToObj(index -> x.getChildren().get(index)).toList();
                           deletedChildren.stream().forEach(f->x.deleteChild(f));

                } );
        }

    public int count() {
        return collectionFamilyDao.getAllFamilies().size();
    }

    public boolean deleteFamilyByIndex(int deletedindex) {
        return collectionFamilyDao.deleteFamily(deletedindex);
    }

    public boolean deleteFamilyByObject(Family family) {
        return collectionFamilyDao.deleteFamily(family);
    }

    public Family getFamilyById(int acceptedindex) {
        return collectionFamilyDao.getFamilyByIndex(acceptedindex);
    }

    public List<Pet> getPets(int indexOfFamily) {
        try {
            return new ArrayList<>(collectionFamilyDao.getAllFamilies().get(indexOfFamily).getPet());
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    public void addPet(int indexOfFamily, Pet pet) {
        try {
            collectionFamilyDao.getAllFamilies().get(indexOfFamily).addPet(pet);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public void addFamily(Family family) {
        collectionFamilyDao.saveFamily(family);
    }
}
