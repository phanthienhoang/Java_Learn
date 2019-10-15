package Bootcamp.week1.TryCatch;

public class ValidateException extends Exception {

    // Gói (wrap) Exception trong một Exception khác
    public ValidateException(Exception e)  {
        super(e);
    }

}