import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ssn = "";
        String MNum = "";
        ssn = SafeInput.getRegExString(in, "Enter your ssn", "\\d{3}-\\d{2}-\\d{4}");
        MNum = SafeInput.getRegExString(in, "Enter your M number", "(M|m)\\d{5}");
        ssn = SafeInput.getRegExString(in, "Enter your menu choice", "[OoSsVvQq]");
    }
}
