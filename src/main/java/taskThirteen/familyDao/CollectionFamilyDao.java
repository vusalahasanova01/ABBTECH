package taskThirteen.familyDao;

import taskThirteen.model.nonAbstarcts.Family;

import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao implements FamilyDao {
    private final List <Family> familyList = new ArrayList<>();

    @Override
    public List<Family> getAllFamilies() {
        return familyList;
    }

    @Override
    public Family getFamilyByIndex(int familyIndex) {
        try{
            return familyList.get(familyIndex);
        }
        catch(IndexOutOfBoundsException e){
            return  null;
        }
    }

    @Override
    public boolean deleteFamily(int index) {
        try {
            familyList.remove(index);
            return true;
        }
        catch (IndexOutOfBoundsException e){
            return false;
        }
    }

    @Override
    public boolean deleteFamily(Family family) {
        int size = familyList.size();
        familyList.remove(family);
        return size != familyList.size();
    }

    @Override
    public void saveFamily(Family family) {
        if(!familyList.contains(family)){
            familyList.add(family);
        }


    }

}
