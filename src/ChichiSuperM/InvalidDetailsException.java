package ChichiSuperM;

public class InvalidDetailsException extends RuntimeException {
    public InvalidDetailsException(String yourDetailsAreIncorrect) {
        super(yourDetailsAreIncorrect);
    }
}
