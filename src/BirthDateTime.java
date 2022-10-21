import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year;
        int month;
        int day;
        int hours;
        int minutes;
        year = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2010);
        month = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);

        switch (month) {
            case 1,3,5,7,8,10,12:
                day = SafeInput.getRangedInt(in, "Enter your day of birth", 1, 31);
                break;
            case 2:
                day = SafeInput.getRangedInt(in, "Enter your day of birth", 1, 29);
                break;
            case 4,6,9,11:
                day = SafeInput.getRangedInt(in, "Enter your day of birth", 1, 30);
                break;
        }
        hours = SafeInput.getRangedInt(in, "Enter your hour of birth", 1, 24);
        minutes = SafeInput.getRangedInt(in, "Enter your minute of birth", 1, 59);


    }
}
