import java.util.Scanner;

public class Eggs {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double dozenEggs = 3.25;
        double singleEgg = .45;
        int amountForDozenEggs;
        int amountForSingleEgg;
        int amountEntered;
        int dozenEgg = 12;
        double totalCost;
        double totalForSingleEgg;
        double totalForDozenEggs;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter an amount of eggs >>>");
        amountEntered = input.nextInt();

        amountForDozenEggs =  amountEntered / dozenEgg;
        amountForSingleEgg = amountEntered % dozenEgg;
        totalForDozenEggs = dozenEggs * amountForDozenEggs;
        totalForSingleEgg = singleEgg * amountForSingleEgg;
        totalCost = totalForDozenEggs + totalForSingleEgg;

        System.out.println("You ordered " + amountEntered + " eggs. That's " + amountForDozenEggs + " dozen at $3.25 per dozen and "
                + amountForSingleEgg + " loose eggs for .45 cents" + " each for a total of $" + totalCost );

    }

}
