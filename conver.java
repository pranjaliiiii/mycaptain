import java.util.Scanner;
public class convert {

    public static void main(String[] Strings) {


        double mininyr = 60 * 24 * 365;

        Scanner sc = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");

        double min = sc.nextDouble();

        long years = (long) (min / mininyr);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println((int) min + " minutes is  " + years + " years and " + days + " days");
    }
}
