import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a valid integer: ");
            int integerInput = scanner.nextInt();

            String romanNumeral = IntegerToRomanNumber.convertIntegerToRomanNumber(integerInput);
            System.out.println("Roman numeral representation for " + integerInput + " is: " + romanNumeral);
        } catch (InputMismatchException exception) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }

}
