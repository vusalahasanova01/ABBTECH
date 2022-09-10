package taskThirteen.familyDao;

import taskThirteen.model.nonAbstarcts.Family;

import java.util.List;

public interface FileFamilyDao {
    boolean saveData(List<Family> families);
    List <Family> loadData();

}
