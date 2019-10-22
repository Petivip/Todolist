
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String exit="yes";
        String todo, cat;
        int pri;
        boolean comp;
        Scanner key = new Scanner(System.in);
        do {
            System.out.println("Enter the item you have to do: ");
            todo = key.next();
            System.out.println("Enter the category of this item: ");
            cat = key.next();
            System.out.print("Your assigned priority is: ");
            pri = key.nextInt();
            System.out.print("Is this item completed? (true or false): ");
            comp = key.nextBoolean();
            System.out.print("Do you have another item? Enter q or quit to exit or yes: ");
            exit = key.next();
        } while (exit.equalsIgnoreCase("yes"));
        System.out.println("Item Name        "+" Category      "+"  Priority"+ "       Done?");
        System.out.println(todo+"              "+cat+"            "+ pri+ "            "+comp);
    }
}
