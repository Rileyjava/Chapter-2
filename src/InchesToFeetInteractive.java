import java.util.Scanner;

public class InchesToFeetInteractive {

    public static void main(String[] args) {

            int numInches;
            int numFeet;
            int numInchesTonumFeet;
            int userInputNM;
            final int NUM_TO_FEET = 12;

            Scanner keyboard = new Scanner(System.in);
            System.out.print(" Enter the number of inches you have >>>> ");
            userInputNM = keyboard.nextInt();

            numFeet = userInputNM / NUM_TO_FEET;
            numInches = userInputNM % NUM_TO_FEET;

            System.out.println(" The number of feet is " + numFeet + " with " +
                    numInches + " number of inches ");

        }

    }