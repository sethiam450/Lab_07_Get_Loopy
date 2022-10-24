import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter starting temp in Celsius ");
        if (in.hasNextDouble()) {
            double startingTemp = in.nextDouble();
            double convertTemp = startingTemp * 9 / 5 + 32;
            if (convertTemp <= 32) {
                System.out.println("Temperature is boiling " + convertTemp);
            } else if (convertTemp <= 32) {
                System.out.println("Temperature is freezing " + convertTemp);

            } else {
                System.out.println(convertTemp);

            }
        } else if (in.hasNext() && !in.hasNextDouble()) {
            System.out.println("Not a valid input, please try again! ");

        }


    }
}