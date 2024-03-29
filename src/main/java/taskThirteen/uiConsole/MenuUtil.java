package taskThirteen.uiConsole;

import taskThirteen.exception.FamilyOverflowException;
import taskThirteen.model.nonAbstarcts.Family;

public class MenuUtil {
    final static int sizeOfFamily = 3;
    public void showMenu(){
        String menu = """
                1. Fill with test data
                2. Display the entire list of families
                3. Display a list of families where the number of people is greater than the specified number
                4. Display a list of families where the number of people is less than the specified number
                5. Calculate the number of families where the number of members is
                6. Create a new family
                7. Delete a family by its index in the general list
                8. Edit a family by its index in the general list
                9. Remove all children over the age of majority 
          
                """;
        System.out.println(menu);



    }
    public void editMenu() {
       String editMenu= """
                1. Give birth to a baby 
                2. Adopt a child
                3. Return to main menu
                """;
        System.out.println(editMenu);
        }
        public void selectGender(){
            String selectGender = """
                    1.boy
                    2.girl
                    """;
            System.out.println(selectGender);

        }
        public static void checkSizeOfFamily(Family family)throws FamilyOverflowException {
        if(family.countFamily()>= sizeOfFamily){
             throw new FamilyOverflowException();
        }
        }








}
