package Bootcamp.week1.TryCatch;
import Bootcamp.week1.TryCatch.CheckAge.AgeUtils;
public class ValidateUtils {

    // Phương thức kiểm tra 1 ứng viên.
    public static void checkPerson(Person person) throws ValidateException {
        try {

            // Kiểm tra tuổi.
            // Hợp lệ là trong khoảng 18-40
            // Method này có thể ném ra TooOldException,TooYoungException.
            AgeUtils.checkAge(person.getAge());

        } catch (Exception e) {

            // Nếu không hợp lệ
            // Gói ngoại lệ này bởi ValidateException, và ném ra (throw).
            throw new ValidateException(e);

        }

        // Nếu người này là Nữ, nghĩa là không hợp lệ.
        if (person.getGender().equals(Person.FEMALE)) {

            GenderException e = new GenderException("Do not accept women");
            throw new ValidateException(e);

        }
    }

}