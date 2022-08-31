package taskTen.controller;

import taskTen.model.abstracts.Human;
import taskTen.model.abstracts.Pet;
import taskTen.model.nonAbstarcts.Family;
import taskTen.model.nonAbstarcts.Man;
import taskTen.model.nonAbstarcts.Woman;
import taskTen.service.FamilyService;

import java.util.List;

public class FamilyController {
    FamilyService familyService = new FamilyService();

    public List<Family> getAllFamilies() {
        return familyService.getAllFamilies();
    }

    public void displayAllFamilies() {
        familyService.displayAllFamilies();
    }

    public int countFamiliesWithMemberNumber(int sizeOfFamilies) {
        return familyService.countFamiliesWithMemberNumber(sizeOfFamilies);
    }

    public List<Family> getFamiliesBiggerThan(int sizeOfFamilies) {
        return familyService.getFamiliesBiggerThan(sizeOfFamilies);
    }

    public List<Family> getFamiliesLessThan(int sizeOfFamilies) {
        return familyService.getFamiliesLessThan(sizeOfFamilies);
    }

    public void createNewFamily(Woman mother, Man father) {
        familyService.createNewFamily(mother, father);
    }

    public Family bornChild(Family family, String masculine, String feminine) {
        return familyService.bornChild(family, masculine, feminine);
    }

    public Family adoptChild(Family family, Human human) {
        return familyService.adoptChild(family, human);
    }

    public void deleteAllChildrenOlderThen(int specifiedAge) {
        familyService.deleteAllChildrenOlderThen(specifiedAge);
    }

    public int count() {
        return familyService.count();
    }

    public boolean deleteFamilyByIndex(int deletedindex) {
        return familyService.deleteFamilyByIndex(deletedindex);
    }
    public boolean deleteFamilyByObject(Family family) {
        return familyService.deleteFamilyByObject(family);
    }

    public Family getFamilyById(int acceptedindex) {
        return familyService.getFamilyById(acceptedindex);
    }
    public void addPet(int indexOfFamily, Pet pet){
        familyService.addPet(indexOfFamily,pet);
    }
    public  List <Pet> getPets(int indexOfFamily){
        return familyService.getPets(indexOfFamily);
    }
    public void addFamily(Family family){
        familyService.addFamily(family);
    }
}
