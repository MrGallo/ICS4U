import java.util.Scanner;

/**
 * Starter code.
 * What does this program do?
 * Refactor it by creating methods to make it easier to read (and cut down on duplication)!
 */
public class IntroToMethods {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] marks = new int[size];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = scan.nextInt();
        }

        for (int i = 0; i < marks.length; i++) {
            System.out.println("marks[" + i + "] = " + marks[i]);
        }

        for (int i = 0; i < marks.length; i++) {
            marks[i] += 10;
        }

        for (int i = 0; i < marks.length; i++) {
            System.out.println("marks[" + i + "] = " + marks[i]);
        }
    }
}
