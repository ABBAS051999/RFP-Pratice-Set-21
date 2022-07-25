import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean firstName = false;
        try {
            firstName = userRegistration.validateFirstName("Rahul");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(firstName);
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldThrowException() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.validateFirstName("Rah");
        } catch (UserRegistrationException e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean lastName = false;
        try {
            lastName = userRegistration.validateLastName("Girgal");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(lastName);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldThrowException() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.validateLastName("Gir");
        } catch (UserRegistrationException e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean email = userRegistration.validateEmail("rahul4girgal@gmail.com");
        Assertions.assertTrue(email);
    }

    @Test
    public void givenPhoneNumber_WhenProperWithSpace_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean phoneNumber = userRegistration.validatePhoneNumber("91 8446448194");
        Assertions.assertTrue(phoneNumber);
    }

    @Test
    public void givenPhoneNumber_WhenProperWithOutSpace_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean phoneNumber = userRegistration.validatePhoneNumber("8446448194");
        Assertions.assertTrue(phoneNumber);
    }

    @Test
    public void givenPhoneNumber_WhenNotProper_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean phoneNumber = userRegistration.validatePhoneNumber("8446");
        Assertions.assertFalse(phoneNumber);
    }

    @Test
    public void givenPassword_WhenMinEightChar_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean password = userRegistration.validatePassword("Rahul@12");
        Assertions.assertTrue(password);
    }

    @Test
    public void givenPassword_WhenAtleastOne_Caps_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean password = userRegistration.validatePassword("Rahul@123");
        Assertions.assertTrue(password);
    }

    @Test
    public void givenPassword_WhenAtleastOne_Numerics_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean password = userRegistration.validatePassword("Rahul@123");
        Assertions.assertTrue(password);
    }

    @Test
    public void givenPassword_HasExactlyOneSpecialCharacter_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean password = userRegistration.validatePassword("Rahul@1");
        Assertions.assertTrue(password);
    }

    @Test
    public void givenEmail1_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.addEmail();
        boolean email = userRegistration.validateEmail(userRegistration.emailArrayList.get(0));
        Assertions.assertTrue(email);
    }

    @Test
    public void givenEmail2_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.addEmail();
        boolean email = userRegistration.validateEmail(userRegistration.emailArrayList.get(1));
        Assertions.assertTrue(email);
    }

    @Test
    public void givenEmail3_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.addEmail();
        boolean email = userRegistration.validateEmail(userRegistration.emailArrayList.get(2));
        Assertions.assertTrue(email);
    }

    @Test
    public void givenEmail4_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.addEmail();
        boolean email = userRegistration.validateEmail(userRegistration.emailArrayList.get(3));
        Assertions.assertTrue(email);
    }

    @Test
    public void givenEmail5_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.addEmail();
        boolean email = userRegistration.validateEmail(userRegistration.emailArrayList.get(4));
        Assertions.assertTrue(email);
    }

    @Test
    public void givenEmail6_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.addEmail();
        boolean email = userRegistration.validateEmail(userRegistration.emailArrayList.get(5));
        Assertions.assertTrue(email);
    }

    @Test
    public void givenEmail7_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.addEmail();
        boolean email = userRegistration.validateEmail(userRegistration.emailArrayList.get(6));
        Assertions.assertTrue(email);
    }

    @Test
    public void givenEmail8_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.addEmail();
        boolean email = userRegistration.validateEmail(userRegistration.emailArrayList.get(7));
        Assertions.assertTrue(email);
    }
}