import java.util.Scanner;
import java.io.*;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {

        // load an external file into a variable
        File f = new File("FileIOAssets/external-file.txt");

        // Create a scanner to scan the file.
        Scanner scanner = new Scanner(f);

        // read the file's contents line-by-line
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        // close the scanner.
        scanner.close();
    }
}
