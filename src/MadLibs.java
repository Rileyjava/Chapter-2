import java.util.Scanner;

public class MadLibs {

        public static void main(String[] args) {

            String color, wordEst, bodyPartPlural, anAnimal, aNoun, pluralNoun;

            int a, b, c;

            Scanner input = new Scanner(System.in);

            System.out.print("Enter a color >>");
            color = input.nextLine();
            System.out.print("Enter a word ending in est >>");
            wordEst = input.nextLine();
            System.out.print("Enter an number >>");
            a = input.nextInt();
            System.out.print("Enter an number >>");
            b = input.nextInt();
            input.nextLine();
            System.out.print("Enter a body part plural >>");
            bodyPartPlural = input.nextLine();
            System.out.print("Enter an animal >>");
            anAnimal = input.nextLine();
            System.out.print("Enter a noun >>");
            aNoun = input.nextLine();
            System.out.print("Enter a plural noun >>");
            pluralNoun = input.nextLine();

            c = a - b;

            System.out.print("The " + color + " Dragon is the " + wordEst + " Dragon of all. It has " + c +" " + bodyPartPlural + ", and a "
                    + anAnimal + " shaped like a " + aNoun + "\n .It loves to eat " + pluralNoun + ", although it will feast on nearly anything.");
        }

    }

