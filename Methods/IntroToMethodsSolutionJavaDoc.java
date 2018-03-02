import java.util.Scanner;

/**
 * This program is to demonstrate the use of javaDoc within the Methods Intro
 * file.
 *
 * @version 1.0
 * @author Mr. Gallo
 */
public class IntroToMethodsSolutionJavaDoc {
    public static void main(String[] args) {
        int[] marks = getMarks();
        printMarks(marks);
        bumpMarks(marks, 10);
        printMarks(marks);
    }

    /**
     * Will return an integer array of marks taken from user input.
     * @return int array of marks
     */
    public static int[] getMarks() {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] marks = new int[size];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = scan.nextInt();
        }
        return marks;
    }

    /**
     * Takes an integer array and increases each value by a given amount.
     * @param marks
     *          Integer array to modify
     * @param bumpBy
     *          amount by which to increase the integer array values
     */
    public static void bumpMarks(int[] marks, int bumpBy) {
        System.out.println("\nModifying marks");
        for (int i = 0; i < marks.length; i++) {
            marks[i] += bumpBy;
        }
    }

    /**
     * Prints out contents of int array in a formatted manner.
     * @param marks
     *          int array of marks
     */
    public static void printMarks(int[] marks) {
        System.out.println("\nPrinting marks");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("marks[" + i + "] = " + marks[i]);
        }
    }
}
