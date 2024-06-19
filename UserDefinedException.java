import java.util.Scanner;
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
public class UserDefinedException {
	public static void checkNumber(int number) throws CustomException {
    
        System.out.println("Enter a number");
        @SuppressWarnings("resource")
        Scanner r = new Scanner(System.in);
        number = r.nextInt();
        if (number < 0) {
            throw new CustomException("Number cannot be negative");
        }
        else {
            System.out.println("Number is positive: " + number);
        }
    }
	
	public static void main(String[] args) {
        try {
            int n = -5;
            checkNumber(n);
        } catch (CustomException e) {
            System.out.println("Custom Exception caught: " + e.getMessage());
        }
    }
}
