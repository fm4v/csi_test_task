package utils;

import org.openqa.selenium.WebDriver;

/**
 * Created by root on 22.02.17.
 */
public class AppException  extends RuntimeException {

    public AppException() {
    }

    public AppException(String message) {
        super(message);
    }

    public AppException(String message, Throwable cause) {
        super(message, cause);
    }

    public AppException(Throwable cause) {
        super(cause);
    }

}