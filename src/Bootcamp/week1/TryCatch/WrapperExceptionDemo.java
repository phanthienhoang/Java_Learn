package Bootcamp.week1.TryCatch;

public class WrapperExceptionDemo {
    public static void main(String[] args) {

        // Một ứng viên.
        Person person = new Person("Marry", Person.MALE, 20);
        try {
            // Ngoại lệ có thể xẩy ra tại đây.
            ValidateUtils.checkPerson(person);

        } catch (ValidateException wrap) {
            // Lấy ra nguyên nhân thực sự.
            Exception cause = (Exception) wrap.getCause();
            if (cause != null) {
                System.out.println("Not pass, cause: " + cause.getMessage());
            } else {
                System.out.println(wrap.getMessage());
            }
        }
    }
}
