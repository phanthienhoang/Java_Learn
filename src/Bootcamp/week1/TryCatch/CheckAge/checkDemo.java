package Bootcamp.week1.TryCatch.CheckAge;

public class checkDemo {
    public static void main(String[] args) {
        // Kiểm tra tuổi.
        System.out.println("Check your Age");
        int age = 20;

        try {

            AgeUtils.checkAge(age);

            System.out.println("You pass!");

        } catch (TooYoungException e) {
            // Làm gì đó tại đây ..
            System.out.println("You are too young, not pass!");
            System.out.println(e.getMessage());

        } catch (TooOldException e) {
            // Làm gì đó tại đây
            System.out.println("You are too old, not pass!");
            System.out.println(e.getMessage());

        }

    }
}
