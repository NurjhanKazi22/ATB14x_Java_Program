package Exercises.Test16112025;

public class TestAge {
    public static void main(String[] args) {
        AgeValidator validator = new AgeValidator();

        try {
            validator.validateAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("InvalidAgeException: " + e.getMessage());
        }

        try {
            validator.validateAge(25);
        } catch (InvalidAgeException e) {
            System.out.println("InvalidAgeException: " + e.getMessage());
        }
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class AgeValidator {

    public void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above. Provided age: " + age);
        } else {
            System.out.println("Age is valid: " + age);
        }
    }
}

