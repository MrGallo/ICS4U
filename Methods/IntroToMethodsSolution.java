import java.util.Scanner;

public class IntroToMethodsSolution {
    public static void main(String[] args) {

        int[] marks = getMarksFromUser();
        printMarks(marks);
        bumpMarks(marks, 10);
        printMarks(marks);

    }

    public static int[] getMarksFromUser() {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] marks = new int[size];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = scan.nextInt();
        }
        return marks;
    }


    public static void printMarks(int[] marks) {
        System.out.println("printMarks was called");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("marks[" + i + "] = " + marks[i]);
        }
    }

    public static void bumpMarks(int[] marks, int bumpBy) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] += bumpBy;
        }
    }


}
