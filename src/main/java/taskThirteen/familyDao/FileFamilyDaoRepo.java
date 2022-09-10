package taskThirteen.familyDao;

import taskThirteen.model.nonAbstarcts.Family;
import taskTwelve.controller.FamilyController;

import java.io.*;
import java.util.List;

public class FileFamilyDaoRepo implements FileFamilyDao {
    @Override
    public boolean saveData(List<Family> families) {
        try (ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(new File("file.bin")))) {
            o.writeObject(families);
            System.out.println("All families saved in data");
            return true;
        } catch (FileNotFoundException e) {
            System.out.println("File not found in data");
            return false;

        } catch (IOException e) {
            System.out.println("File not found in data");
            return false;
        }


    }

    @Override
    public List<Family> loadData() {
        try (ObjectInputStream o = new ObjectInputStream(new FileInputStream(new File("file.bin")))) {
            System.out.println("All families saved in data");
            return (List<Family>) o.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

}
