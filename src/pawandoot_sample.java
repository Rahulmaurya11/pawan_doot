import java.sql.SQLOutput;
import java.util.Scanner;

public class pawandoot_sample {
    public static void main(String[] args) {
requirementGathering();
    }
    public static void requirementGathering () {
        Scanner in = new Scanner(System.in);
        System.out.println("1. Pease (mutter) " + '\n' + "2. Panner (Indian cottage cheese)" + '\n' + "3. Cold Drink" + '\n' + "4. ice cream");
        System.out.println("please enter 1,2,3 or 4 from above list her e :--> ");
        int opt = in.nextInt();
        System.out.println("please select the locations '\n' 1.MUmbai'\n' 2.kokata '\n' 3.chennai '\n' 4.Delhi");
        System.out.println("please enter 1,2,3 or 4 from above list her e :--> ");
        int City = in.nextInt();


        System.out.println("Enter a contact number");
        String number = in.next();
        System.out.println("Selected product is:");
        switch (opt) {
            case 1:
                System.out.println("Pease (mutter)");
                break;
            case 2:
                System.out.println("Panner (Indian cottage cheese)");
                break;
            case 3:
                System.out.println("Cold Drink");
                break;
            case 4:
                System.out.println("Ice cream");
                break;
            default:
                System.out.println("invalid input");
        }
        System.out.println("Contact number: " + number);

        System.out.print("Opted city:  ");
        switch (City) {
            case 1:
                System.out.println("Mumbai");
                break;
            case 2:
                System.out.println("Kolkata");
                break;
            case 3:
                System.out.println("chennai");
                break;
            case 4:
                System.out.println("Delhi");
                break;
            default:
                System.out.println("Invalid input ");
        }
        System.out.println("your order has been placed \n thank you ");
    }
}
