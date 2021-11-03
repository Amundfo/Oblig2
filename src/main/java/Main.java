import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a year");

        int year = 0;
        String NUMBER_REGEX = "^[0-9]*$";

        while (true) {
            String temp = reader.nextLine();
            if (ValidateNumber.validateNumber(temp)) {
                year = Integer.parseInt(temp);
                break;
            }
            else {
                System.out.println("The input was not a year");
                System.out.println("Enter a year");
            }
        }


        if (IsLeapYear.isLeapYear(year)) System.out.println("The year is a leap year");
        else System.out.println("The year isn't a leap year");
    }
}
