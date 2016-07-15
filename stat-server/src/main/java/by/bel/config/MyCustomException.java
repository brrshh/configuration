package by.bel.config;

/**
 * Created by Barys_Shliaha on 11-Jul-16.
 */
public class MyCustomException extends Exception {

    public MyCustomException() {
    }

    public MyCustomException(Throwable cause) {
        super(cause);
    }

    public MyCustomException(String message) {
        super(message);
    }

    public MyCustomException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyCustomException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String code;
    private String description;

    @Override
    public String toString() {
        return "MyCustomException{" +
                "code='" + code + '\'' +
                ", description='" + description + '\'' +
                "} " + super.toString();
    }
}
