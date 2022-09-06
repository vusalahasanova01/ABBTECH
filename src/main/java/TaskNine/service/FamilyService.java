package TaskNine.service;

import TaskNine.familyDao.CollectionFamilyDao;
import TaskNine.familyDao.FamilyDao;
import TaskNine.model.abstracts.Human;
import TaskNine.model.abstracts.Pet;
import TaskNine.model.nonAbstarcts.Family;
import TaskNine.model.nonAbstarcts.Man;
import TaskNine.model.nonAbstarcts.Woman;

import javax.swing.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class FamilyService {
    CollectionFamilyDao collectionFamilyDao = new CollectionFamilyDao();

    public List<Family> getAllFamilies() {
        return collectionFamilyDao.getAllFamilies();
    }

    public void displayAllFamilies() {

        for(Family f: getAllFamilies()){
            System.out.println(f);
        }
    }


    public int countFamiliesWithMemberNumber(int sizeOfFamilies) {
        int numberOfFamilies = 0;
        for (int i = 0; i < collectionFamilyDao.getAllFamilies().size(); i++) {
            if (collectionFamilyDao.getAllFamilies().get(i).countFamily() == sizeOfFamilies) {
                numberOfFamilies++;
            }
        }
        return numberOfFamilies;
    }

    public List<Family> getFamiliesBiggerThan(int sizeOfFamilies) {
        List<Family> BiggerFamilies = new ArrayList<>();
        for (int i = 0; i < collectionFamilyDao.getAllFamilies().size(); i++) {
            if (collectionFamilyDao.getAllFamilies().get(i).countFamily() > sizeOfFamilies) {
                BiggerFamilies.add(collectionFamilyDao.getAllFamilies().get(i));
            }
        }
        return BiggerFamilies;
    }

    public List<Family> getFamiliesLessThan(int sizeOfFamilies) {
        List<Family> LessFamilies = new ArrayList<>();
        for (int i = 0; i < collectionFamilyDao.getAllFamilies().size(); i++) {
            if (collectionFamilyDao.getAllFamilies().get(i).countFamily() < sizeOfFamilies) {
                LessFamilies.add(collectionFamilyDao.getAllFamilies().get(i));
            }
        }
        return LessFamilies;
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
        for (int i = 0; i < collectionFamilyDao.getAllFamilies().size(); i++) {
            Family f = collectionFamilyDao.getAllFamilies().get(i);
            List<Human> deletedChildren = new ArrayList<>();
            for (int j = 0; j < f.getChildren().size(); j++) {
                if (LocalDateTime.now().getYear() - f.getChildren().get(j).getYear() > specifiedAge) {
                    deletedChildren.add(f.getChildren().get(j));
                }
            }
            for (Human x : deletedChildren) {
                f.deleteChild(x);
            }
        }
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
