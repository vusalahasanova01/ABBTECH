package taskThirteen.familyDao;


import taskThirteen.model.nonAbstarcts.Family;

import java.util.List;

public interface FamilyDao {
   List <Family> getAllFamilies();
   Family getFamilyByIndex(int familyIndex);
   boolean deleteFamily(int index);
   boolean deleteFamily(Family family);
   void saveFamily(Family family);



}
