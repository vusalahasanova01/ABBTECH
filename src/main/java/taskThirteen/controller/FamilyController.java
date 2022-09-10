package taskThirteen.controller;

import taskThirteen.exception.FamilyOverflowException;
import taskThirteen.model.abstracts.Pet;
import taskThirteen.service.FamilyService;
import taskThirteen.model.abstracts.Human;
import taskThirteen.model.nonAbstarcts.Family;
import taskThirteen.model.nonAbstarcts.Man;
import taskThirteen.model.nonAbstarcts.Woman;
import taskThirteen.uiConsole.MenuUtil;

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
        try {
            MenuUtil.checkSizeOfFamily(family);
            return familyService.bornChild(family, masculine, feminine);
        }
        catch(FamilyOverflowException e){
            System.out.println("You crossed the limit");
            return family;
        }
    }

    public Family adoptChild(Family family, Human human) {
        try{
            MenuUtil.checkSizeOfFamily(family);
            return familyService.adoptChild(family, human);
        }
        catch (FamilyOverflowException e){
            System.out.println("You crossed the limit");
            return family;
        }

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
