public class IsLeapYear {
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean leapYearIsDivisibleByFour(int year) {
        return (year % 4 == 0);
    }
    public static boolean leapYearIsDivisibleByFourAndNotHoundred(int year) {
        return (year % 4 == 0 && year % 100 != 0);
    }
    public static boolean leapYearIsDivisibleBy4Houndred(int year) {
        return (year % 400 == 0);
    }
    public static boolean leapYearIsDivisibleByHundredNot400(int year) {
        return (year % 400 != 0 && year % 100 == 0);
    }
}
