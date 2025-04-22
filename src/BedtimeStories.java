
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        System.out.println("""
Enter the name of a story (e.g. 
    "goldilocks.txt", 
    "hansel_and_gretel.txt", 
    or "mary_had_a_little_lamb.txt"
):""");
        Scanner in = new Scanner(System.in);
        String story = in.nextLine().trim();
        try {
// create a FileInputStream object pointing to
// a specific file
            FileInputStream fis = new FileInputStream(story);
// create a Scanner to reference the file to be read
            Scanner scanner = new Scanner(fis);
            String input;
// read until there is no more data
            while (scanner.hasNextLine()) {
                input = scanner.nextLine();
                System.out.println(input);
            }
// close the scanner and release the resources
            scanner.close();
        } catch (IOException e) {
// display stack trace if there was an error
            System.out.println("Invalid Input!");
    }
}

        }