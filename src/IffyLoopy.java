import java.util.Scanner;

public class IffyLoopy {
    public static void main(String[] args)
    {
        /*  Loopy
            Declare a string variable.
            open while loop.
            prompt user to enter word 5 times using for loop.
            Display the words entered by the user.
            IFFY
            Declare and initialize boolean variable.
            Ask the user "Are your eyes red?".
            if the user answer yes print out "Get some sleep!",
            else print out "You look great!".
            Finally ask the user "Do you want to try again?".
            if the user answer yes the loop will continue
            else stop the while loop.
         */

        String words;
        String total_Words = " ";
        boolean redEyes = true;

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Iffyloopy Application.");
        // loop keep going as long as redEyes is true
        while (redEyes == true)
        {
            // ask users to enter 5 words.
            for (int x = 0; x < 5; x++) {
                System.out.print("Enter a word please: ");
                words = sc.nextLine();
                total_Words = total_Words + " " + words; // concatenate the entered words

            }
            System.out.println(total_Words); // print the 5 words entered by the user.

            System.out.print("Are your eyes red?(y/n or yes/no) ");
            words = sc.nextLine();

            // Check if the user needs some sleep or not based on the user response.
            if(words.equalsIgnoreCase("yes") || words.equalsIgnoreCase("y"))
            {
                System.out.println("Get some sleep!");
            } else{
                System.out.println("You look great!");
            }

            // ask the user if the user wants to do the process again
            System.out.print("Do you want to try again? ");
            words = sc.nextLine();
            // If the user wants to stop the loop this if clause do that.
            if(words.equalsIgnoreCase("no") || words.equalsIgnoreCase("n")){
                redEyes = false; // help us to stop the while loop.
            }
            total_Words = " ";
        }
        System.out.println("Thank you for using Iffyloopy Application. ");
    }
}
