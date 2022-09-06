package taskTwelve.familyDao;


import taskTwelve.model.nonAbstarcts.Family;

import java.util.List;

public interface FamilyDao {
   List <Family> getAllFamilies();
   Family getFamilyByIndex(int familyIndex);
   boolean deleteFamily(int index);
   boolean deleteFamily(Family family);
   void saveFamily(Family family);



}
