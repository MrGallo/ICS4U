import java.util.Scanner;

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
