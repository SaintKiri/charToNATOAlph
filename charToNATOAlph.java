import java.util.Scanner;

public class charToNATOAlph {

    public static void main (String[] args) {
        // Prompt
        System.out.print("Enter your text and press enter: ");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine().toUpperCase();

        // Bravo six, going dark
        System.out.println("Bravo six, going dark: ");
        // Formatting
        System.out.println(" ----- Start of message ----- ");
        if (text.length() != 0) {
            for (int i = 0; i < text.length(); i++) {

                // Non-alphabetic letters
                if (!(text.charAt(i) >= 'A' && text.charAt(i) <= 'Z')) {// Other characters
                    System.out.println(text.charAt(i));
                }

                // Alphabetic letters
                if (text.charAt(i) == 'A') {
                    System.out.println("Alpha ");
                } else if (text.charAt(i) == 'B') {
                    System.out.println("Bravo ");
                } else if (text.charAt(i) == 'C') {
                    System.out.println("Charlie ");
                } else if (text.charAt(i) == 'D') {
                    System.out.println("Delta ");
                } else if (text.charAt(i) == 'E') {
                    System.out.println("Echo ");
                } else if (text.charAt(i) == 'F') {
                    System.out.println("Foxtrot ");
                } else if (text.charAt(i) == 'G') {
                    System.out.println("Golf ");
                } else if (text.charAt(i) == 'H') {
                    System.out.println("Hotel ");
                } else if (text.charAt(i) == 'I') {
                    System.out.println("India ");
                } else if (text.charAt(i) == 'J') {
                    System.out.println("Juliett ");
                } else if (text.charAt(i) == 'K') {
                    System.out.println("Kilo ");
                } else if (text.charAt(i) == 'L') {
                    System.out.println("Lima ");
                } else if (text.charAt(i) == 'M') {
                    System.out.println("Mike ");
                } else if (text.charAt(i) == 'N') {
                    System.out.println("November ");
                } else if (text.charAt(i) == 'O') {
                    System.out.println("Oscar ");
                } else if (text.charAt(i) == 'P') {
                    System.out.println("Papa ");
                } else if (text.charAt(i) == 'Q') {
                    System.out.println("Quebec ");
                } else if (text.charAt(i) == 'R') {
                    System.out.println("Romeo ");
                } else if (text.charAt(i) == 'S') {
                    System.out.println("Sierra ");
                } else if (text.charAt(i) == 'T') {
                    System.out.println("Tango ");
                } else if (text.charAt(i) == 'U') {
                    System.out.println("Uniform ");
                } else if (text.charAt(i) == 'V') {
                    System.out.println("Victor ");
                } else if (text.charAt(i) == 'W') {
                    System.out.println("Whiskey ");
                } else if (text.charAt(i) == 'X') {
                    System.out.println("X-ray ");
                } else if (text.charAt(i) == 'Y') {
                    System.out.println("Yankee ");
                } else if (text.charAt(i) == 'Z') {
                    System.out.println("Zulu ");
                }

            }
        }
        System.out.println(" ----- End of message ----- ");

        input.close();
    }
}