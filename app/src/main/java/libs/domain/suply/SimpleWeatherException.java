package libs.domain.suply;

public class SimpleWeatherException extends  RuntimeException{

    public SimpleWeatherException() {
    }

    public SimpleWeatherException(String message) {
        super(message);
    }

    public SimpleWeatherException(String message, Throwable cause) {
        super(message, cause);
    }

    public SimpleWeatherException(Throwable cause) {
        super(cause);
    }
}
