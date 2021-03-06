public class Arrays {
    public static void main(String[] args) {
//        String[] students = new String[3];
//        students[0] = "Jim";
//        students[1] = "Tom";
//        students[2] = "Kayla";

        String[] students = {"Jim", "Tom", "Kayla"};
        students[1] = "Mr. Skeleton";

        printStudents(students);

        int[][] marks = {
                {50, 68, 87},
                {97, 86, 56},
                {90, 87, 99}
        };

        for (int i = 0; i < marks.length; i++) {
            int[] markList = marks[i];
            System.out.println(students[i] + "'s marks");
            for (int mark : markList) {
                System.out.println("mark = " + mark);
            }
        }

        String[] tempArray = new String[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            tempArray[i] = students[i];
        }
        tempArray[tempArray.length-1] = "Donald";

        students = tempArray;
        printStudents(students);

    }

    private static void printStudents(String[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println("students[" + i + "] = " + students[i]);
        }
    }
}
