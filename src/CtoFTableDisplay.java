import java.util.Scanner;

public class CtoFTableDisplay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int i = 0;
        System.out.println("Celsius | Fahrenheit");
        System.out.println("--------------------");
        for (int Cel = -100; Cel <= 100; Cel++)
        {
            System.out.print(Cel + "   | ");
            System.out.printf("%.2f", CtoF(Cel));
            System.out.println();
        }
    }

    public static double CtoF(double Celsius) {
        double fahrenheit = 0.00;
        fahrenheit = (Celsius * (1.8)) + 32;

        return fahrenheit;


    }
}
